package com.devops.calculadora.restfulcalculadora;

import com.devops.calculadora.restfulcalculadora.*;

/*Imports para usar el Junit*/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*Imports para poder ser usados desde un app externo*/
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class calculadoraTest {

	@Test
	void testSuma() {
	
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testResta() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	void testMultiplicacion() {
		Calculadora tester = new Calculadora();
		
		// assert statements
        assertEquals(0,tester.multiplicacion(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiplicacion(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiplicacion(0, 0), "0 x 0 must be 0");
		
	}

	@Test
	void testDivision() {
		fail("Not yet implemented"); // TODO
	}

}
