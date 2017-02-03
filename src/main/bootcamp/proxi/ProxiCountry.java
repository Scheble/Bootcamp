package proxi;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dominio.Country;
import interfaces.CountryInter;
import modelJson.CountryModel;

@Controller
public class ProxiCountry{
	@Autowired
	CountryInter countryInter;
		
	public ArrayList<Country> findAll(){
		
	ArrayList<Country> lista = new ArrayList<Country>();
	ArrayList<CountryModel> listCm = countryInter.findAll();
	
		for(CountryModel cm : listCm){
			Country c = new Country();
			c.setName(cm.getName());
			c.setCodeAlpha2(cm.getAlpha2_code());
			c.setCodeAlpha3(cm.getAlpha3_code());
			lista.add(c);
			
		}
		return lista;
	}
	
	}
	
	

