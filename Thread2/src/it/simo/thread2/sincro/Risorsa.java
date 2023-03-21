package it.simo.thread2.sincro;

public class Risorsa {
	public synchronized void stampa()
	{
		System.out.println("Entra "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Esce "+Thread.currentThread().getName());
	}
}
