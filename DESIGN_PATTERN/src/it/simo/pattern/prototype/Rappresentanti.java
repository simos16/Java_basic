package it.simo.pattern.prototype;

public class Rappresentanti extends Utente {
	
	   public Rappresentanti(){
		     codice = "Rappresentante";
		   }

		   @Override
		   public void creaUtente() {
		      System.out.println("Io sono il tipo Rappresentante");
		   }

}
