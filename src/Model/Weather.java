package Model;

public class Weather {	
	//Today
	private String date;
	private int temp;
	private String text;
	//Wind
	private int chill;
	private int direction;
	private int speed;
	//Atmosphere
	private int humidity;
	private float pressure;
	private int rising;
	private int visibility;
	private String sunrise;
	private String sunset;
	
	
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
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
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
	public Weather(String date, int temp, String text, int chill, int direction, int speed, int humidity,
			float pressure, int rising, int visibility, String sunrise, String sunset) {
		super();
		
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
	public Weather() {
		super();
	}
	@Override
	public String toString() {
		return "Weather \nDate: " + date + "\nTemp: " + temp + "\nText: " + text +"\nWind \nChill: " + chill + "\nDirection: "
				+ direction + "\nSpeed: " + speed + "\nAtmosphere \nHumidity: " + humidity + "\nPressure: " + pressure + "\nRising: "
				+ rising + "\nVisibility: " + visibility + "\nAstronomy \nSunrise: " + sunrise + "\nSunset: " + sunset;
	}
	
	
	
		
}
