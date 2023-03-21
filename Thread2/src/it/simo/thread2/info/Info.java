package it.simo.thread2.info;

public class Info extends Thread {
	
	
	public Info(String nominativo) {
		super(nominativo);
	}
	
	@Override
	public void run() {
		System.out.println("\nInizio Thread: " + getName());
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getPriority());
		System.out.println("\nFine Thread: " + getName());
	}

	public static void main(String[] args) {
		
		Thread threadCorrente=Thread.currentThread();
		System.out.println(threadCorrente.getId());
		System.out.println(threadCorrente.getName());
		System.out.println(threadCorrente.getPriority());
		
		Thread secondo = new Info("Secondo thread");
		//secondo.setPriority(10);
		secondo.start();
		
		
	}

}
