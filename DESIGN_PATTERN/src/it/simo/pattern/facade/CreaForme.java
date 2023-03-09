package it.simo.pattern.facade;

public class CreaForme {

	   private Forme rettangolo;
	   private Forme quadrato;
	   

	   public CreaForme() {
	      rettangolo = new Rettangolo();
	      quadrato = new Quadrato();
	     
	   }

	   public void disegnaRettangolo(){
	      rettangolo.disegnaForme();
	   }
	   public void disegnaQuadrato(){
	      quadrato.disegnaForme();
	   }
	  
}
