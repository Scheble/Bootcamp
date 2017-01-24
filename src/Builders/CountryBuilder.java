package Builders;

import Persistencia.Country;

public class CountryBuilder {
	private Country c = new Country();
	
	public CountryBuilder() {
		super();
	}
	public CountryBuilder(Country c) {
		super();
		this.c = c;
	}
	public Country BuiderName(String name){
		c.setName(name);
		return c;
	}
	public Country BuilderCodeAlpha2(String code){
		c.setCodeAlpha2(code);
		return c;
	}
	public Country BuiderCodeAlpha3(String code){
		c.setCodeAlpha3(code);
		return c;
	}
	
}
