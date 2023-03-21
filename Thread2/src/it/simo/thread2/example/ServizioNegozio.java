package it.simo.thread2.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServizioNegozio {
	private final static int CLIENTI_DA_SERVIRE = 5;
	private final int COMMESSI = 3;
	
	private BlockingQueue<Runnable> codaClienti = new ArrayBlockingQueue<Runnable>(30, true);
	private ExecutorService dipendentiDisponibili = Executors.newFixedThreadPool(COMMESSI);

	public static void main(String[] args) {
		System.out.println("Nel negozio ci sono " + CLIENTI_DA_SERVIRE + " clienti in attesa del servizio");

		ServizioNegozio commessoDispo = new ServizioNegozio();
		commessoDispo.arrivoClienti();
		commessoDispo.servizioClienti();
	}

	private void arrivoClienti() {
		for (int i = 1; i <= CLIENTI_DA_SERVIRE; i++) {
			try {
				/* il cliente viene inserito in coda */
				codaClienti.put(new Cliente(i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void servizioClienti() {
		new Thread(new Runnable() {
			public void run() {
				while(true) {
					try {
						/* il primo cliente disponibile viene servito ... */
						dipendentiDisponibili.execute(codaClienti.take());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
