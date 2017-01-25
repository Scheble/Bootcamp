package Servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Dominio.DBController;
import Dominio.GetDatosController;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import Persistencia.*;

@Path("/Servicios")
public class Servicio {
	DBController db = new DBController();

	@POST
	@Path("/InsertCountry")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Country ServicioCountry(Country c){
			if(db.InsertCountry(c)){
				System.out.println("Exito");
			}
			else
				System.out.println("Fallo");
			
		return c;
				
	}
	@POST
	@Path("/InsertState")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public State ServicioState(State s){
			if(db.InsertState(s)){
				System.out.println("Exito");
			}
			else
				System.out.println("Fallo");
		return s;
	}
	@POST
	@Path("/InsertWeather")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Weather ServicioWeather(Weather w){
			if(db.InsertWeather(w)){
				System.out.println("Exito");
			}
			else
				System.out.println("Fallo");
		return w;
	}
	@POST
	@Path("/InsertForecaste")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Forecaste ServicioForecaste(Forecaste f){
			if(db.InsertForecaste(f)){
				System.out.println("Exito");
			}
			else
				System.out.println("Fallo");
		return f;		
	}
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path(value = "/GetWeather/{alpCode}/state/{idState}/weather/{date}")	
	public WeatherStateConsulta GetWeather(@PathParam("alpCode") String alpCode,
			@PathParam("idState") int idState, @PathParam("date") String date)
	{		
			GetDatosController gd = new GetDatosController();
			WeatherStateConsulta ws = gd.GetTerceraAsignacion(alpCode, idState, date);
			return ws;
	}
	
}
