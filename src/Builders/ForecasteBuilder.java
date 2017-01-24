package Builders;

import Persistencia.Forecaste;

public class ForecasteBuilder {

	private Forecaste f = new Forecaste();
	
	public ForecasteBuilder() {
		super();
	}
	
	public Forecaste BuilderDate(String date){
		f.setDate(date);
		return f;
	}
	public Forecaste BuilderDay(String day){
		f.setDay(day);
		return f;		
	}
	public Forecaste BuilderHig(int hig){
		f.setHig(hig);
		return f;		
	}
	public Forecaste BuilderLow(int low){
		f.setLow(low);
		return f;		
	}
	public Forecaste BuilderText(String text){
		f.setText(text);
		return f;
	}
	public Forecaste BuilderIdState(int id){
		f.setIdState(id);
		return f;
	}
}
