package com.Bootcamp.Asignaciones.TestDominio;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bootcamp.Asignaciones.Builders.ForecasteBuilder;

public class ForecasteTest {
	private ForecasteBuilder fb = new ForecasteBuilder();

	@Test
	public void DateTest(){
		assertEquals("11/11/2011",fb.BuilderDate("11/11/2011").getDate());
	}
	@Test
	public void DayTest(){
		assertEquals("Lunes",fb.BuilderDay("Lunes").getDay());
	}
	@Test
	public void HigTest(){
		assertTrue(fb.BuilderHig(120).getHig() == 120);
	}
	@Test
	public void LowTest(){
		assertTrue(fb.BuilderLow(159).getLow() == 159);
	}
	@Test
	public void TextTest(){
		assertEquals("Texto de prueba",fb.BuilderText("Texto de prueba").getText());
	}
	@Test
	public void IdStateTest(){
		assertTrue(fb.BuilderIdState(1).getIdState() == 1);
	}

}
