package it.simo.thread.sincro;

public class ClienteNonSync extends Thread {
	private double sommaDaPrelevare;
	
	public ClienteNonSync(String nomeCliente, double sommaDaPrelevare) {
		super();
		this.setName(nomeCliente);
		this.sommaDaPrelevare = sommaDaPrelevare;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " arriva al bancomat");
		System.out.println("Quando arriva " + Thread.currentThread().getName() + " il saldo è: " + ContoCorrente.getInstance().getSaldo());
		System.out.println("La somma che vuole prelevare " + Thread.currentThread().getName() + " è: " + sommaDaPrelevare);
		
		try {
			ContoCorrente.getInstance().prelievoNonSync(sommaDaPrelevare);
			System.out.println(Thread.currentThread().getName() + " ha prelevato");
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " non può prelevare");
			e.printStackTrace();
		}
	}
}