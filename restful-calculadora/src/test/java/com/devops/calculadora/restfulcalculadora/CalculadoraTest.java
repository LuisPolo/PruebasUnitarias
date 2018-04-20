package com.devops.calculadora.restfulcalculadora;

import com.devops.calculadora.restfulcalculadora.*;

/*Imports para usar el Junit*/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class calculadoraTest {

	Calculadora tester = new Calculadora();
	
	@Test
	void testSuma() {
	    System.out.println("Entre a suma");
		assertEquals(15, tester.suma(10, 5), "10 + 5 debe ser 15");
	}

	@Test
	void testResta() {
		assertEquals(5, tester.resta(10, 5), "10 - 5 debe ser 10");
	}

	@Test
	void testMultiplicacion() {		
		
		// assert statements
        assertEquals(0,tester.multiplicacion(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiplicacion(5, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiplicacion(0, 0), "0 x 0 must be 0");
		
	}

	@Test
	void testDivision() {
		assertEquals(2, tester.division(3, 5), "10/5 debe ser 2");
	}

}
