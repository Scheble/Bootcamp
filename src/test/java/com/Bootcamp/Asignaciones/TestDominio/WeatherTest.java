package com.Bootcamp.Asignaciones.TestDominio;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bootcamp.Asignaciones.Builders.WeatherBuilder;

public class WeatherTest {
	private WeatherBuilder wb = new WeatherBuilder();

	@Test
	public void TestDate(){
		assertEquals("07-08-2013",wb.BuilderDate("07-08-2013").getDate());
	}
	@Test
	public void TestTemp(){
		assertTrue(wb.BuilderTemp(12).getTemp() == 12);
	}
	@Test
	public void TestText(){
		assertTrue(wb.BuilderText("Despejado").getText().contains("Despejado"));
	}
	@Test
	public void TestChill(){
		assertTrue(wb.BuilderChill(3).getChill() == 3);
	}
	@Test
	public void TestDirection(){
		assertTrue(wb.BuilderDirection(6).getDirection() == 6);
	}
	@Test
	public void TestSpeed(){
		assertTrue(wb.BuilderSpeed(8).getSpeed() == 8);
	}
	@Test
	public void TestHumidity(){
		assertTrue(wb.BuilderHumidity(40).getHumidity() == 40);
	}
	@Test
	public void TestPressure(){
		assertTrue(wb.BuilderPressure(1600.369).getPressure() == 1600.369);
	}
	@Test
	public void TestRising(){
		assertTrue(wb.BuilderRising(6).getRising() == 6);
	}
	@Test
	public void TestVisibility(){
		assertTrue(wb.BuilderVisibility(10).getVisibility() == 10);
	}
	@Test
	public void TestSunR(){
		assertEquals("11:30 am",wb.BuilderSunR("11:30 am").getSunrise());
	}
	@Test
	public void TestSunS(){
		assertTrue(wb.BuilderSunS("22:00 pm").getSunset().equals("22:00 pm"));
	}
	

}
