package Builders;

import Persistencia.Weather;

public class WeatherBuilder {
	private Weather w = new Weather(); 
	
	public Weather BuilderDate(String date){
		w.setDate(date);
		return w;
	}
	public Weather BuilderTemp(int temp){
		w.setTemp(temp);
		return w;
	}
	public Weather BuilderText(String text){
		w.setText(text);
		return w;		
	}
	public Weather BuilderChill(int c){
		w.setChill(c);
		return w;
	}
	public Weather BuilderDirection(int d){
		w.setDirection(d);
		return w;		
	}
	public Weather BuilderSpeed(int s){
		w.setSpeed(s);
		return w;
	}
	public Weather BuilderHumidity(int h){
		w.setHumidity(h);
		return w;
	}
	public Weather BuilderPressure(double d){
		w.setPressure(d);
		return w;
	}
	public Weather BuilderRising(int r){
		w.setRising(r);
		return w;
	}
	public Weather BuilderVisibility(int v){
		w.setVisibility(v);
		return w;
	}
	public Weather BuilderSunR(String sr){
		w.setSunrise(sr);
		return w;
	}
	public Weather BuilderSunS(String ss){
		w.setSunset(ss);
		return w;
	}
	
	
}
