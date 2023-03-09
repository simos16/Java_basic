package it.simo.pattern.strategy;

public class Main {
	public static void main(String[] args) {
		
		Operazioni operazione = new Operazioni(new Somma());		
	      System.out.println("Strategia di somma: " + operazione.eseguiStrategia(20, 5));
	      
	      operazione = new Operazioni(new Moltiplicazioni());
	      System.out.println("Strategia di moltiplicazione: " + operazione.eseguiStrategia(20, 5));
	            
	}

}
