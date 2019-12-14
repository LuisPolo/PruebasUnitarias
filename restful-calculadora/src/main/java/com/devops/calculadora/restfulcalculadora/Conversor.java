package com.devops.calculadora.restfulcalculadora;

public class Conversor {

	public int convertidor(int[] arreglo) {
		
		int result = 0;
	    for(int i=arreglo.length - 1; i>=0; i--)
	        if(arreglo[i]==1)
	            result += Math.pow(2, (arreglo.length-i - 1));
	    return result;
	}

}
