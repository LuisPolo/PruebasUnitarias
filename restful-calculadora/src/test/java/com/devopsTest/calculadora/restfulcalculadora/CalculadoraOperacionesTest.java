package com.devopsTest.calculadora.restfulcalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.devops.calculadora.restfulcalculadora.*;

class CalculadoraOperacionesTest {

	Calculadora tester = new Calculadora();
	
	@Test
	void multiplicacionySuma() {
		assertEquals(8, tester.multiplicacionYSuma(2, 2), "2 y 2 en multiplicacion y suma debe ser 8");
	}

}
