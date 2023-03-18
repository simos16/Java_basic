package it.simo.thread.priority;

public class ThJoin extends Thread {
	
	/*
	 * Il metodo Join in Java consente a un thread di attendere fino al completamento 
	 * dell'esecuzione di un altro thread. 
	 * significa quindi che un thread è impostato per  attendere che l'altro thread arrivi a dead.
	 * 
	 * 
	 * */
	
	@Override
	public void run() {
		for(int i = 0; i <2; i++) {
			try {
			Thread.sleep(5000);
			System.out.println("Thread corrente: " + Thread.currentThread().getName());
			}catch(InterruptedException e) {
				System.out.println(e);			
			}
			System.out.println(i);
			
		}
	}
	
	

}
