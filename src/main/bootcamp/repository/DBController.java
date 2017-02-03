package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.*;

public class DBController {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("bootcamp");
	private EntityManager manager = factory.createEntityManager();
	
	
	public boolean InsertCountry(Country c){
		boolean resultado = false;
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try{
			manager.persist(c);			
			tx.commit();
			resultado = true;
		}catch(Exception e){
			System.out.println("Error insertar Country: "+e.getMessage());
			tx.rollback();
		}finally{
			try{
				manager.close();
			}catch(Exception e){
				System.out.println("Error cerrar conexion "+e.getMessage());
			}
		}
		return resultado;
	}
	
	public List Serch(String name){
		Query query = manager.createQuery("SELECT name FROM Country");
		List<String> list=query.getResultList();
		return list;
		
	}
}
