package it.simo.thread2.lock;

public class Contatore extends Thread {
	
	private LockEsempio counter;
	private int limite;
	private int sleep;
	
	public Contatore(LockEsempio counter, int limite, int sleep) {
		super();
		this.counter = counter;
		this.limite = limite;
		this.sleep = sleep;
	}

	@Override
	public void run() {
		while (counter.conta() < limite) {
			try {
				counter.somma();
				Thread.sleep(sleep);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
