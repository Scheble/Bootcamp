package Controller;

import java.sql.*;

import Model.Country;

public class Connect {
	private Connection conn;
	
	

	public Connection getCon() {
		return conn;
	}

	public void setCon(Connection conn) {
		this.conn = conn;
	}

	public Connect(Connection conn) {
		super();
		this.conn = conn;
	}

	public Connect() {
		super();
	}
	
	public void OpenCon(){
		try{
			String user = "root";
			String pass = "1234";
			String url = "jdbc:mysql://localhost:3306/bootcamp?autoReconnect=true&useSSL=false";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url,user,pass);
			
				
		}catch(Exception e){
			System.out.println("Error en la conexion: "+e.getMessage());
		}
	}
	public void Close(){
		try{
			conn.close();			
		}catch(Exception e){
			System.out.println("Error al intentar cerrar la conexion: "+e.getMessage());
		}		
	}
	public boolean Insert(Country c){
		boolean resultado = false;
		Statement st = null;
		try{
			OpenCon();
			st = conn.createStatement();
			String sql = "INSERT INTO countries (Name, Alpha2_code, Alpha3_code) VALUES('"+c.getName()+"','"+c.getCodeAlpha2()+"','"+c.getCodeAlpha3()+"')";
			st.executeUpdate(sql);
			resultado = true;
			
		}catch(Exception e){
			System.out.println("Error en el insert: "+e.getMessage());
		}
		
		return resultado;
	}
}
