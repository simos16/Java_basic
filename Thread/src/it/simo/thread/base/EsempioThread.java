package it.simo.thread.base;

public class EsempioThread extends Thread {

	@Override
	public void run() {	
		super.run();
		
		System.out.println("sono un thread eseguito con classe Thread " + getName());
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(i);
		}
		
		
		
	}
	
	

}
