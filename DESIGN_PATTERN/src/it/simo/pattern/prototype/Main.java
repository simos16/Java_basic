package it.simo.pattern.prototype;

public class Main {

	public static void main(String[] args) {
		
		  ScriviUtenti.caricaUtenti();

	      Utente cloneObj1 = (Utente) ScriviUtenti.getUtente("1");
	      System.out.println("Codice : " + cloneObj1.getCodice());	
	      cloneObj1.creaUtente();

	      Utente clonedObj2 = (Utente) ScriviUtenti.getUtente("2");
	      System.out.println("Codice : " + clonedObj2.getCodice());		
	      

	}

}
