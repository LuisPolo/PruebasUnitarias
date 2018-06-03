package com.devopsTest.calculadora.restfulcalculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.devops.calculadora.restfulcalculadora.Calculadora;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class ParameterizedTestFields {

	// fields used together with @Parameter must be public
    /*@Parameter(0)
    public int m1;
    @Parameter(1)
    public int m2;
    @Parameter(2)
    public int result;*/
    
    private int m1;
    private int m2;
    private int result;

    
    public ParameterizedTestFields(int m1, int m2, int result) {
    	this.m1 = m1;
    	this.m2 = m2;
    	this.result = result;
	}

    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
        return Arrays.asList(data);
    }


    @Test
    public void testMultiplyException() {
    	Calculadora tester = new Calculadora();
        assertEquals("Result", result, tester.multiplicacion(m1, m2));
    }


    
}
