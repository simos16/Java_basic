package it.simo.thread2.lock;


public class Main {
	public static void main(String[] args) {
		LockEsempio counter = new LockEsempio();
		
		Contatore c1 = new Contatore(counter, 5, 1000);
		Contatore c2 = new Contatore(counter, 5, 1000);
		
		c1.start();
		c2.start();
	}
}
