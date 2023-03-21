package it.simo.thread2.example;

import java.util.Random;

public class Cliente implements Runnable {
	private int numeroTicket;

	public Cliente(int numeroTicket) {
		System.out.println("E' arrivato un nuovo cliente ed ha preso il numero " + numeroTicket);

		this.numeroTicket = numeroTicket;
	}

	public void run() {
		
		richiediProdotti();
	}

	private void richiediProdotti() {
		System.out.println("Viene servito il cliente numero " + numeroTicket);

		
		Random r = new Random();

		
		int tempoImpiegatoPerAcquisto = (r.nextInt(15) + 5)*1000;

		try {
			/* 
			 * il thread viene sospeso per tempoImpiegatoPerAcquisto millisecondi.
			 * Quest'attesa equivale al cliente che sta effettuando la sua scelta con il commesso
			 */
			Thread.sleep(tempoImpiegatoPerAcquisto);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Il cliente che aveva il numero " + numeroTicket + " ha completato il suo acquisto in " + tempoImpiegatoPerAcquisto/1000 + " secondi");
	}
}