package services;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import dominio.Country;
import persistencia.DBController;

@Path("/services")
@Produces("application/json")
public interface Servicios {
	public DBController db = new DBController();
	
	public Country InsertCountry(Country c);
}
