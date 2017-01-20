package com.Bootcamp.Asignaciones.Dominio;

public class State {	
	private int idState;
	private String country;
	private String name;
	private String abbr;
	private int area;
	private String largest_city;
	private String capital;
	private int idWeather;
	private Weather weather;
	private Forecaste[] forecast;
	
	
	
	
	public int getIdState() {
		return idState;
	}
	public void setIdState(int idState) {
		this.idState = idState;
	}
	public Forecaste[] getForecast() {
		return forecast;
	}
	public void setForecast(Forecaste[] forecast) {
		this.forecast = forecast;
	}
	public Weather getWeather() {
		return weather;
	}
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbr() {
		return abbr;
	}
	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getLargest_city() {
		return largest_city;
	}
	public void setLargest_city(String largest_city) {
		this.largest_city = largest_city;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getIdWeather() {
		return idWeather;
	}
	public void setIdWeather(int idWeather) {
		this.idWeather = idWeather;
	}
	public State(int idState,String country, String name, String abbr, int area, String largest_city, String capital,
			int idWeather,Weather weather,Forecaste[] forecast) {
		super();
		this.idState = idState;
		this.country = country;
		this.name = name;
		this.abbr = abbr;
		this.area = area;
		this.largest_city = largest_city;
		this.capital = capital;
		this.idWeather = idWeather;
		this.weather = weather;
		this.forecast = forecast;
	}
	public State() {
		super();
	}
	@Override
	public String toString() {
		return "State \ncountry:" + country + "\nname: " + name + "\nabbr: " + abbr + "\narea:" + area+" KM"+"\nlargest_city: "
				+ largest_city + "\ncapital: " + capital+"\n";
	}
	
	
}
