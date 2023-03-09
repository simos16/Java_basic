package it.simo.pattern.observer;

public class Ottale extends Observer {

	public Ottale(Soggetto soggetto) {
		this.soggetto = soggetto;
	      //this.soggetto.attach(this);
		
	}
	@Override
	public void aggiorna() {
		System.out.println( "Stringa in ottale: " + Integer.toOctalString( soggetto.getState() ) );
		
	}

}
