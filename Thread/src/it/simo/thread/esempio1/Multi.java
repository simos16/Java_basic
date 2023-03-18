package it.simo.thread.esempio1;

public class Multi extends Thread{
String nome;
	
	@Override
	public void run() {
		int i = 0;
		while( i < 5) {
			nome = Thread.currentThread().getName();
			System.out.println(nome);
			i++;
			try {
			Thread.sleep(7000);
			}catch(InterruptedException e) {
				System.out.println(e);
				break;
				
			}
			
		}
	}
}
