package it.simo.pattern.observer;

public class Main {
	public static void main(String[] args) {
		Soggetto soggetto = new Soggetto();
		
		  new Binario(soggetto);
	      new Ottale(soggetto);
	      new Esadecimale(soggetto);
	      
	      System.out.println("Primo step");	
	      soggetto.setState(15);
	      System.out.println("Secondo step");	
	      soggetto.setState(10);
	      System.out.println("Terzo step");	
	      soggetto.setState(16);
	      
		
	}

}
