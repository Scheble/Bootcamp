package dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Forecaste {
	@Id
	@GeneratedValue( strategy= GenerationType.AUTO )
	private int id;
	private String date;
	private String day;
	private int hig;
	private int low;
	private String text;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idState")
	private State State;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public State getIdState() {
		return State;
	}
	public void setIdState(State idState) {
		this.State = idState;
	}
	public Forecaste(String date, String day, int hig, int low, String text, State idState) {
		super();
		this.date = date;
		this.day = day;
		this.hig = hig;
		this.low = low;
		this.text = text;
		this.State = idState;
	}
	public Forecaste() {
		super();
	}
	@Override
	public String toString() {
		return "Max: " + hig + "\nMin: " + low + "\nText: " + text+"\n";
	}
	
	
}
