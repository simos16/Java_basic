package it.simo.thread.priority;

public class TH2 extends Thread{

	@Override
	public void run() {
		System.out.println("TH2 è avviato con priorità: " + this.getPriority());
		
		for(int i = 0; i <5; i++) {
			System.out.println("Il valore dell'indice è: " + i);
		}
		System.out.println("Thread TH2 uscito");
	}
}
