package com.Bootcamp.Asignaciones.TestDominio;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bootcamp.Asignaciones.Builders.StateBuilder;
import com.Bootcamp.Asignaciones.Dominio.Weather;

import junit.framework.Assert;

public class StateTest {
	StateBuilder sb = new StateBuilder();

	@Test
	public void IdStateTest(){
		assertTrue(sb.BuilderIdState(55).getIdState() == 55);
	}
	//Para variar un poco
	@Test
	public void CountryNameTest(){
		assertTrue(sb.BuilderCountryName("ARG").getCountry().equals("ARG")); 
	}
	@Test 
	public void NameTest(){
		assertTrue(sb.BuilderName("Cordoba").getName().contains("Cordoba"));
	}
	//**********
	@Test
	public void AbbrTest(){
		assertEquals("CBA",sb.BuilderAbbr("CBA").getAbbr());
	}
	@Test
	public void AreaTest(){
		assertTrue(sb.BuilderArea(500).getArea() == 500);
	}
	@Test
	public void LargestCityTest(){
		assertEquals("Villa del Totoral",sb.BuilderCity("Villa del Totoral").getLargest_city());
	}
	@Test
	public void CapitalTest(){
		assertTrue(sb.BuilderCapital("Cordoba").getCapital().equals("Cordoba"));
	}
	@Test
	public void IdWeatherTest(){
		assertTrue(sb.BuilderIdWeather(2).getIdWeather() == 2);
	}
	@Test
	public void StateWeatherTest(){
		Weather w = new Weather();
		Assert.assertNotNull(sb.BuilderWeather(w).getWeather());
	}

}
