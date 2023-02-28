package it.simona.util.math;

public class MathMethod {
	public static float numero = -78.67f;

	public static void main(String[] args) {
		
		
		
		
	System.out.println(Math.max(8, 10));
	
	System.out.println(Math.min(8, 10));
	System.out.println(Math.max(-8, -10));
	System.out.println(Math.sqrt(128));
	
	System.out.println(Math.pow(12, 3));
	
	System.out.println(Math.abs(-23.56));	
	System.out.println(Math.abs(numero));
	
	System.out.println(Math.random()); // da 0 1 
	
	System.out.println(Math.random() * 100); // da 0 99
	
	int numero1 = (int)(Math.random() * 101); // interi da 0 a 100 compreso
	System.out.println(numero1);
	
	System.out.println(Math.round(17.45));
	
	System.out.println(Math.ceil(17.45));
	System.out.println(Math.floor(17.45));
	System.out.println(Math.signum(-16));
	System.out.println(Math.signum(16));
	
	
	
	}

}
