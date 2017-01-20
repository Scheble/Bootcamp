package com.Bootcamp.Asignaciones.Persistencia;

import java.sql.*;
import java.util.ArrayList;

import com.Bootcamp.Asignaciones.Configuracion.Connect;
import com.Bootcamp.Asignaciones.Dominio.*;

public class GetDatosController {
	private Connect conn = new Connect();
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
				Country c = new Country(rs.getString("Name"),rs.getString("Alpha2_code"),rs.getString("Alpha3_code"),null);
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
				State s = new State(rs.getInt("Idstates"),rs.getString("Country"),rs.getString("Name"),rs.getString("Abbr"),rs.getInt("Area"),rs.getString("Largest_city"),rs.getString("Capital"),rs.getInt("idWeather"),null,null);
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
}
