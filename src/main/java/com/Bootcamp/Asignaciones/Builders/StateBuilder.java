package com.Bootcamp.Asignaciones.Builders;

import com.Bootcamp.Asignaciones.Dominio.State;
import com.Bootcamp.Asignaciones.Dominio.Weather;

public class StateBuilder {

	private State s = new State();

	public StateBuilder() {
		super();
	}
	public State BuilderIdState(int id){
		s.setIdState(id);
		return s;		
	}
	public State BuilderCountryName(String name){
		s.setCountry(name);
		return s;		
	}
	public State BuilderName(String name){
		s.setName(name);
		return s;
	}
	public State BuilderAbbr(String ab){
		s.setAbbr(ab);
		return s;
	}
	public State BuilderArea(int area){
		s.setArea(area);
		return s;
	}
	public State BuilderCity(String city){
		s.setLargest_city(city);
		return s;
	}
	public State BuilderCapital(String capital){
		s.setCapital(capital);
		return s;
	}
	public State BuilderIdWeather(int id){
		s.setIdWeather(id);
		return s;
	}
	public State BuilderWeather(Weather w){
		s.setWeather(w);
		return s;
	}
}
