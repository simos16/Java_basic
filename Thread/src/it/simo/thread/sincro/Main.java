package it.simo.thread.sincro;

public class Main {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		  Cliente c1 = new Cliente("Giulia", 30); 
		  Cliente c2 = new Cliente("Chiara",30);
		  
		  c1.start(); 
		  c2.start();
		  
		  c1.join(); 
		  c2.join();
		 
		 
	 
		
		
		
			
			  /*ClienteNonSync c3 = new ClienteNonSync("Giulia", 30); 
			  ClienteNonSync c4 = new ClienteNonSync("Chiara", 30);
			  
			  c3.start(); 
			  c4.start();
			  
			  c3.join(); 
			  c4.join();*/
			 
		 
	}
}
