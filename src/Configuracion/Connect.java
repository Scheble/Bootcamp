
package Configuracion;
import java.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

 
@Configuration
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
			System.out.println("Conexion Cerrada");
			}catch(Exception e){
					System.out.println("Error al intentar cerrar la conexion: "+e.getMessage());
				}
	}
	
	public Statement CreateStatement() {
        Statement st = null;
        try{
            st = conn.createStatement();          
        }catch(Exception e){
            System.out.println("Error en el createStatement: "+e.getMessage());
        }
        return st;
    }
}
