package it.simo.thread.esempio1;

public class ProcessoRun implements Runnable {
	
	@Override
	public void run() {
		String threadName;
		int contatore  = 0;
		while(contatore < 5) {
			threadName = Thread.currentThread().getName();
			System.out.println("Nome del thread: " + threadName);
			contatore++;
			
		}
		
	}

}
