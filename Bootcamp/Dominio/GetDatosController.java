package Dominio;

import java.sql.*;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import Configuracion.Connect;
import Persistencia.*;


 
public class GetDatosController {
	@Autowired
	private Connect conn;	
	private ResultSet rs = null;	
	
	public GetDatosController() {
		super();
	}

	public ArrayList<Country> GetCountries(){
		ArrayList<Country> lista = new ArrayList<Country>();
		
		try{
			conn.OpenCon();
			Statement st = conn.CreateStatement();
			rs = st.executeQuery("SELECT * FROM countries");
			while(rs.next()){				
				Country c = new Country(rs.getString("Name"),rs.getString("Alpha2_code"),rs.getString("Alpha3_code"));
				lista.add(c);
			
			}
			
		}catch(Exception e){
			System.out.println("Error en GetCountris "+e.getMessage());
		}finally{
			try{
				
				rs.close();
			}catch(Exception e){
				System.out.println("Error al cerrar conexion "+ e.getMessage());
			}
		}
		return lista;
	}
	
	public ArrayList<State> GetStates(String alpha3){
		ArrayList<State> lista = new ArrayList<State>();
		try{
			conn.OpenCon();
			Statement st = conn.CreateStatement();
			rs = st.executeQuery("SELECT * FROM states WHERE Country like '"+alpha3+"'");
			
			while(rs.next()){
				State s = new State(rs.getInt("Idstates"),rs.getString("Country"),rs.getString("Name"),rs.getString("Abbr"),rs.getInt("Area"),rs.getString("Largest_city"),rs.getString("Capital"),rs.getInt("idWeather"));
				lista.add(s);
			}
		}catch(Exception e){
			System.out.println("Error en GetStates: "+e.getMessage());
		}finally{
			try{
				
				rs.close();
			}catch(Exception e){
				System.out.println("Error al cerrar la conexion "+e.getMessage());
			}
		}
		
		return lista;
	}
	public ArrayList<Weather> GetWeather(int id){
		ArrayList<Weather> lista = new ArrayList<Weather>();
		
		try{
			conn.OpenCon();
			Statement st = conn.CreateStatement();
			rs = st.executeQuery("SELECT * FROM weathers WHERE Code = "+id);
			while(rs.next()){
				Weather w = new Weather(rs.getString("Date"),rs.getInt("Temp"),rs.getString("Text"),rs.getInt("Chill"),rs.getInt("Direction"),rs.getInt("Speed"),rs.getInt("Humidity"),rs.getInt("Pressure"),rs.getInt("Rising"),rs.getInt("Visibility"),rs.getString("Sunrise"),rs.getString("Sunset"));
				lista.add(w);
			}
		}catch(Exception e){
			System.out.println("Error en GetWeather "+e.getMessage());
		}finally{
			try{
				
				rs.close();
			}catch(Exception e){
				System.out.println("Error al cerrar la conexion "+e.getMessage());
			}
		}
		
		return lista;
	}
	public ArrayList<Forecaste> GetForecaste(int idState){
		ArrayList<Forecaste> lista = new ArrayList<Forecaste>();
		
		try{
			conn.OpenCon();
			Statement st = conn.CreateStatement();
			rs = st.executeQuery("SELECT * FROM forecastes WHERE idState = "+idState);
			while(rs.next()){
				Forecaste f = new Forecaste(rs.getString("Date"),rs.getString("Day"),rs.getInt("high"),rs.getInt("low"),rs.getString("Text"),rs.getInt("idState"));
				lista.add(f);
			}
		}catch(Exception e){
			System.out.println("Error en GetForecaste "+e.getMessage());
		}finally{
			try{
				
				rs.close();
			}catch(Exception e){
				System.out.println("Error al cerrar la conexion "+e.getMessage());
			}
		}		
		return lista;
	}
	public void ConexionCerrada(){
		conn.Close();
	}
	public WeatherStateConsulta GetTerceraAsignacion(String alpCode, int idState, String date){
		WeatherStateConsulta ws = null;
		try{
			conn.OpenCon();
			Statement st = conn.CreateStatement();
			rs = st.executeQuery("SELECT Country, Name, Abbr, Area, Largest_city, Capital, Date, Temp, Text, Chill, Direction, Speed, Humidity, Pressure, Rising, Visibility, Sunrise, Sunset "
					+ "FROM states JOIN weathers ON idWeather = Code "
					+ "WHERE Country like '"+alpCode+"' and Idstates = "+idState+" and Date like '"+date+"'");
			while(rs.next()){
						ws= new WeatherStateConsulta(
						rs.getString("Country"),rs.getString("Name"),rs.getString("Abbr"),rs.getInt("Area"),rs.getString("Largest_city"),rs.getString("Capital"),
						rs.getString("Date"),rs.getInt("Temp"),rs.getString("Text"),rs.getInt("Chill"),rs.getInt("Direction"),rs.getInt("Speed"),rs.getInt("Humidity"),rs.getInt("Pressure"),rs.getInt("Rising"),
						rs.getInt("Visibility"),rs.getString("Sunrise"),rs.getString("Sunset")
						);				
			}
			
		}catch(Exception e){
			System.out.println("Error en GetStates: "+e.getMessage());
		}finally{
			try{
				
				rs.close();
			}catch(Exception e){
				System.out.println("Error al cerrar la conexion "+e.getMessage());
			}
		}
		return ws;
	}
	
	
}
