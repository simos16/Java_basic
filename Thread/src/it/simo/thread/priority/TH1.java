package it.simo.thread.priority;

public class TH1 extends Thread{
	
	@Override
	
	//istruzione del thread
	public void run() {
		System.out.println("TH1 è avviato con priorità: " + this.getPriority());
		
		for(int i = 0; i <5; i++) {
			System.out.println("Il valore dell'indice è: " + i);
		}
		System.out.println("Thread TH1 uscito");
	}
	

}
