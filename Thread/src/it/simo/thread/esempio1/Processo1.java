package it.simo.thread.esempio1;

public class Processo1 extends Thread{
	
String threadName;
	
	//il metodo fondamentale della classe Thread
	@Override
	public void run() {
		int num = 0;
		while(num <=3) {
		System.out.println("E' attivo un thread: " + Thread.activeCount());
		threadName = Thread.currentThread().getName();
		num++;
		System.out.println("Il thread corrente è: " + threadName);
		if(threadName.equals("Th1")) {
			System.out.println("Io sono il primo thread");
		}else {
			System.out.println("Nessun thread");
		}
		}
	}
	

}
