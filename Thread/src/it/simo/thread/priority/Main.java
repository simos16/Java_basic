package it.simo.thread.priority;

public class Main {
	
	public static void main(String[] args) {
		
		/*TH1 thread1 = new TH1();  //default ha priorità 5
		TH2 thread2 = new TH2();
		TH3 thread3 = new TH3();
		
		//NORM_PRIORITY => 5
		
		thread3.setPriority(Thread.MAX_PRIORITY); // 10
		thread2.setPriority((Thread.MIN_PRIORITY) + 2); 
		thread1.setPriority(thread2.getPriority() + 1);  
		//thread1.setPriority((Thread.MIN_PRIORITY ) + 1);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		//join()
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	
		
		// Gestione ottmizzata del join sui thread
		ThJoin th1 = new ThJoin();
		ThJoin th2 = new ThJoin();
		ThJoin th3 = new ThJoin();
		ThJoin th4 = new ThJoin();
	
		
		th1.start();
		try {
			System.out.println("Thread corrente: " + Thread.currentThread().getName());
			th1.join();  //esaurisci l'attivit� ed esegui l'altro thread
	}catch(InterruptedException e) {
		System.out.println(e);
	} 
		
		th2.start();
		try {
			System.out.println("Thread corrente: " + Thread.currentThread().getName());
			th2.join();  //esaurisci l'attività ed esegui l'altro thread
	}catch(InterruptedException e) {
		System.out.println(e);
	} 
	
		th3.start();
		try {
			System.out.println("Thread corrente: " + Thread.currentThread().getName());
			th3.join();  //esaurisci l'attività ed esegui l'altro thread
	}catch(InterruptedException e) {
		System.out.println(e);
	} 
		
		th4.start();
		try {
			System.out.println("Thread corrente: " + Thread.currentThread().getName());
			th4.join();  //esaurisci l'attività ed esegui l'altro thread
	}catch(InterruptedException e) {
		System.out.println(e);
	} 
		
		
		
}

}
