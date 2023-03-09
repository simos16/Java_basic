package it.simo.pattern.prototype;

public class Clienti extends Utente {
	public Clienti() {
	codice = "Cliente";
}
	
	
	@Override
	void creaUtente() {
		// TODO Auto-generated method stub
		System.out.println("Io sono il tipo Cliente");
	}

}
