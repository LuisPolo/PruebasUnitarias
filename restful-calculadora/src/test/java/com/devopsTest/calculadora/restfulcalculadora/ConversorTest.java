package com.devopsTest.calculadora.restfulcalculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.devops.calculadora.restfulcalculadora.*;

public class ConversorTest {
	
	Conversor tester = new Conversor();
	
	@Test
	void testGenerar_Binario_0001_A_Entero_Numero1() {    
		
	    int[ ] arreglo = {0, 0, 0, 1}; 
	    
		assertEquals(1, tester.convertidor(arreglo), "Debe salir 1");		
	}
	
	@Test
	void testGenerar_Binario_0010_A_Entero_Numero2() {    
		
	    int[ ] arreglo = {0, 0, 1, 0}; 
	    
		assertEquals(2, tester.convertidor(arreglo), "Debe salir 2");		
	}
	
	@Test
	void testGenerar_Binario_0101_A_Entero_Numero5() {    
		
	    int[ ] arreglo = {0, 1, 0, 1}; 
	    
		assertEquals(5, tester.convertidor(arreglo), "Debe salir 5");		
	}
	
	@Test
	void testGenerar_Binario_1001_A_Entero_Numero9() {    
		
	    int[ ] arreglo = {1, 0, 0, 1}; 
	    
		assertEquals(9, tester.convertidor(arreglo), "Debe salir 9");		
	}	
}
