package interfaces;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import modelJson.CountryModel;

@Path("/")
public interface CountryInter {

	@GET
	@Path("country/get/all")
	@Produces({MediaType.APPLICATION_JSON})
	public ArrayList<CountryModel> findAll();
	
	
}
