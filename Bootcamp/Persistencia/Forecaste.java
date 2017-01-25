package Persistencia;

public class Forecaste {
	
	private String date;
	private String day;
	private int hig;
	private int low;
	private String text;
	private int idState;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getHig() {
		return hig;
	}
	public void setHig(int hig) {
		this.hig = hig;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getIdState() {
		return idState;
	}
	public void setIdState(int idState) {
		this.idState = idState;
	}
	public Forecaste(String date, String day, int hig, int low, String text, int idState) {
		super();
		this.date = date;
		this.day = day;
		this.hig = hig;
		this.low = low;
		this.text = text;
		this.idState = idState;
	}
	public Forecaste() {
		super();
	}
	@Override
	public String toString() {
		return "Max: " + hig + "\nMin: " + low + "\nText: " + text+"\n";
	}
	
	
}
