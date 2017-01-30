package dominio;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class State {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idState;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "codeAlpha3")
	private Country country;
	private String name;
	private String abbr;
	private int area;
	private String largest_city;
	private String capital;
	@OneToMany(mappedBy = "state")
	private Set<Weather> Weather;
	@OneToMany
	private Set<Forecaste> forecaste;
	
	
	public void setIdState(int idState) {
		this.idState = idState;
	}
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
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
	public State(int idState,Country country, String name, String abbr, int area, String largest_city, String capital) {
		super();
		this.idState = idState;
		this.country = country;
		this.name = name;
		this.abbr = abbr;
		this.area = area;
		this.largest_city = largest_city;
		this.capital = capital;		
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
