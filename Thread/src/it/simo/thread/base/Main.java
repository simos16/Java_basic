package it.simo.thread.base;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * EsempioThread t1 = new EsempioThread();
		 * 
		 * t1.start();
		 * 
		 * 
		 * Thread t2 = new Thread(new EsempioRunnable());
		 * System.out.println("==============="); t2.start();
		 */
		
	
		
		EsempioThread t1 = new EsempioThread();
		t1.setName("Multi 1");
		EsempioThread t2 = new EsempioThread();
		t2.setName("Multi 2");
		EsempioThread t3 = new EsempioThread();
		t3.setName("Multi 3");
		EsempioThread t4 = new EsempioThread();
		
		t4.setName("Multi 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("===============");
		try {
			Thread.sleep(5000);
			System.out.println("Ho fatto un sonno");
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		
		Thread r1 = new Thread(new EsempioRunnable("Run 1"));
		Thread r2 = new Thread(new EsempioRunnable("Run 2"));
		Thread r3 = new Thread(new EsempioRunnable("Run 3"));
		Thread r4 = new Thread(new EsempioRunnable("Run 4"));
		
		r1.start();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		r2.start();
		r3.start();
		r4.start();
	}	
	
}
