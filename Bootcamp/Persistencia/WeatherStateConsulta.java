package Persistencia;

public class WeatherStateConsulta {

	private String country;
	private String name;
	private String abbr;
	private int area;
	private String largest_city;
	private String capital;
	private String date;
	private int temp;
	private String text;	
	private int chill;
	private int direction;
	private int speed;	
	private int humidity;
	private double pressure;
	private int rising;
	private int visibility;
	private String sunrise;
	private String sunset;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getChill() {
		return chill;
	}
	public void setChill(int chill) {
		this.chill = chill;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public int getRising() {
		return rising;
	}
	public void setRising(int rising) {
		this.rising = rising;
	}
	public int getVisibility() {
		return visibility;
	}
	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public WeatherStateConsulta(String country, String name, String abbr, int area, String largest_city, String capital,
			String date, int temp, String text, int chill, int direction, int speed, int humidity, double pressure,
			int rising, int visibility, String sunrise, String sunset) {
		super();
		this.country = country;
		this.name = name;
		this.abbr = abbr;
		this.area = area;
		this.largest_city = largest_city;
		this.capital = capital;
		this.date = date;
		this.temp = temp;
		this.text = text;
		this.chill = chill;
		this.direction = direction;
		this.speed = speed;
		this.humidity = humidity;
		this.pressure = pressure;
		this.rising = rising;
		this.visibility = visibility;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public WeatherStateConsulta() {
		super();
	}
	
	
	
}
