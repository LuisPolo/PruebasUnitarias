package com.devops.calculadora.restfulcalculadora;

public class Calculadora {
	
	public int multiply(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	    return x / y; //x*y; //
	  }
}
