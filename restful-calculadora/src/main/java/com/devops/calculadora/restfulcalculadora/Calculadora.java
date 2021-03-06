package com.devops.calculadora.restfulcalculadora;

public class Calculadora {
	
	public int suma(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	    return x+y;
	  }
	
	public int resta(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	    return x-y;
	  }
	
	public int multiplicacion(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	    return x*y;
	  }
	
	public int division(int x, int y) {
	    // the following is just an example
	    if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	    return x/y;
	  }
	
	public double multiplicacionYSuma(int a, int b) {
		try {
			
			double vMultiplicacion = this.multiplicacion(a, b);
			double vSuma = this.suma(a, b);
					
			return vMultiplicacion + vSuma;
					
		}catch(Exception ex) {
			throw ex;
		}
	}
}
