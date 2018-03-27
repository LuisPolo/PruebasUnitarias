package com.devops.calculadora.restfulcalculadora;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Test;

public class CalculadoraTest {

	@Test(expected = IllegalArgumentException.class)
	  public void testExceptionIsThrown() {
		Calculadora tester = new Calculadora();
	    tester.multiply(1000, 5);
	  }

	  @Test
	  public void testMultiply() {
		  Calculadora tester = new Calculadora();
	    assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	  }

}
