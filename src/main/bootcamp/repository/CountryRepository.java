package repository;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.repository.CrudRepository;

import dominio.Country;


public interface CountryRepository extends CrudRepository<Country, String>{
	
	
	public ArrayList<Country> findAll();
	
	@POST
	@Path("/country/save")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Country save(Country c);
}
