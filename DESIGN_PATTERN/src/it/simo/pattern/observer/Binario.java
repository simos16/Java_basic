package it.simo.pattern.observer;

public class Binario extends Observer{
	
        public Binario(Soggetto soggetto) {
                this.soggetto = soggetto;
                this.soggetto.attach(this);

        }

	@Override
	public void aggiorna() {
		System.out.println( "Stringa in binario: " + Integer.toBinaryString( soggetto.getState() ) );
		
	}

}
