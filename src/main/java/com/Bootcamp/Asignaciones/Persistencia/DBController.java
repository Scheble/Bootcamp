package com.Bootcamp.Asignaciones.Persistencia;

import java.sql.ResultSet;
import java.sql.Statement;

import com.Bootcamp.Asignaciones.Configuracion.Connect;
import com.Bootcamp.Asignaciones.Dominio.*;

public class DBController {
	private Connect conn = new Connect();
	private Statement st = null;
	
	
	public DBController() {
		super();
	}

	public DBController(Connect conn) {
		super();
		this.conn = conn;
	}

	public boolean InsertCountry(Country c){
		boolean resultado = false;
		
		try{
			conn.OpenCon();
			st = conn.CreateStatement();
			String sql = "INSERT INTO countries (Name, Alpha2_code, Alpha3_code) VALUES('"+c.getName()+"','"+c.getCodeAlpha2()+"','"+c.getCodeAlpha3()+"')";
			st.executeUpdate(sql);
			resultado = true;
			
		}catch(Exception e){
			System.out.println("Error en el insert: "+e.getMessage());
		}finally{
			try{
				
			}catch(Exception e){
				System.out.println("Error al cerrar la conexion "+e.getMessage());
			}
		}
		
		return resultado;
	}
	
	public boolean InsertState(State s){
		boolean resultado = false;
		
		try{
			conn.OpenCon();
			st = conn.CreateStatement();
			String sql = "INSERT INTO states (Country,Name, Abbr, Area,Largest_city, Capital, idWeather) VALUES('"+s.getCountry()+"','"+s.getName()+"','"+s.getAbbr()+"',"+s.getArea()+",'"+s.getLargest_city()+"','"+s.getCapital()+"',"+s.getIdWeather()+")";
			st.executeUpdate(sql);
			resultado = true;
			
		}catch(Exception e){
			System.out.println("Error en el insert: "+e.getMessage());
		}finally{
			try{
				
			}catch(Exception e){
				System.out.println("Error al cerrar la conexion "+e.getMessage());
			}
		}
		
		return resultado;
	}
	public boolean InsertWeather(Weather w){
		boolean resultado = false;
		
		try{
			conn.OpenCon();
			st = conn.CreateStatement();
			String sql = "INSERT INTO weathers (Date, Temp, Text, Chill, Direction, Speed, Humidity, Pressure, Rising, Visibility, Sunrise, Sunset) VALUES('"+w.getDate()+"',"+w.getTemp()+",'"+w.getText()+"',"+w.getChill()+","+w.getDirection()+","+w.getSpeed()+","+w.getHumidity()+","+w.getPressure()+","+w.getRising()+","+w.getVisibility()+",'"+w.getSunrise()+"','"+w.getSunset()+"')";
			st.executeUpdate(sql);
			resultado = true;
			
		}catch(Exception e){
			System.out.println("Error en el insert: "+e.getMessage());
		}finally{
			try{
				
			}catch(Exception e){
				System.out.println("Error al cerrar la conexion "+e.getMessage());
			}
		}
		
		return resultado;
	}
	
	public boolean InsertForecaste(Forecaste f){
		boolean resultado = false;
		
		try{
			conn.OpenCon();
			st = conn.CreateStatement();
			String sql = "INSERT INTO forecastes (Date, Day, High, low, Text, idState) VALUES('"+f.getDate()+"','"+f.getDay()+"',"+f.getHig()+","+f.getLow()+",'"+f.getText()+"',"+f.getIdState()+")";
			st.executeUpdate(sql);
			resultado = true;
			
		}catch(Exception e){
			System.out.println("Error en el insert: "+e.getMessage());
		}finally{
			try{
				
			}catch(Exception e){
				System.out.println("Error al cerrar la conexion "+e.getMessage());
			}
		}
		
		return resultado;
	}
	
	public int GetId(String table){
		ResultSet rs = null;
		String id = "id"+table;
		
		int resultado = 0;		
		if(table == "weathers"){
			id = "code";			
		}
		try{
			conn.OpenCon();
			st = conn.CreateStatement();
			String sql = "SELECT "+id+" FROM "+table+" ORDER BY "+id+" DESC LIMIT 1";			
			rs = st.executeQuery(sql);
			rs.next();
			resultado = rs.getInt(id);			
		}catch(Exception e){
			System.out.println("Error en GetId: "+e.getMessage());
		}finally{
			try{
				rs.close();
				
			}catch(Exception e){
				System.out.println("Error al cerrar conexion GetId "+e.getMessage());
			}
		}
		
		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
