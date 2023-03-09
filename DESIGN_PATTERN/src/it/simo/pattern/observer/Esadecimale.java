package it.simo.pattern.observer;

public class Esadecimale extends Observer {
	
	public Esadecimale(Soggetto soggetto) {
		this.soggetto = soggetto;
	      this.soggetto.attach(this);
		
	}

	@Override
	public void aggiorna() {
		System.out.println( "Stringa in esadecimale: " + Integer.toHexString( soggetto.getState() ) );
		
		
	}

}
