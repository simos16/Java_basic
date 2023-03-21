package it.simo.thread2.sincro;

public class Flussi extends Thread {
	
private Risorsa ris;
	
	public Flussi(Risorsa ris) {
		this.ris=ris;
	}
	
	@Override
	public void run() {
			for(int i=0; i<3; i++)
				ris.stampa();
	}

}
