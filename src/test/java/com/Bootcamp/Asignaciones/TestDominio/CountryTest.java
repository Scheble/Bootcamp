package com.Bootcamp.Asignaciones.TestDominio;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Bootcamp.Asignaciones.Builders.CountryBuilder;

import junit.framework.Assert;

public class CountryTest {
	CountryBuilder cb = new CountryBuilder();

	@Test
	public void NameTest() {
		Assert.assertEquals("Argentina", cb.BuiderName("Argentina").getName());
	}
	@Test
	public void CodeAlpha2Test(){
		assertEquals("AR",cb.BuilderCodeAlpha2("AR").getCodeAlpha2());
	}
	@Test
	public void CodeAlpha3Test(){
		assertEquals("ARG",cb.BuiderCodeAlpha3("ARG").getCodeAlpha3());
	}
	

}
