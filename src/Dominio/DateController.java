package Dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateController {
	private Calendar date = Calendar.getInstance();
	private String[] days = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
	

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public DateController() {
		super();
	}
	
	
	public String Today(){
		return new Date().toString();
	}	
	@SuppressWarnings("deprecation")
	public String DateForecast(int d, int opc){
		Date dt = new Date();
		date.setTime(dt);
		date.add(Calendar.DATE,d);		
		dt = date.getTime();
		
		if(opc == 0)
			return dt.getDate()+" "+new SimpleDateFormat("MMMM").format(dt)+" "+(dt.getYear()+1900);
		else
			return days[dt.getDay()];
		
	}
	
}
