package it.simo.innerclass.examples;

public class Persona {
	
	private String nome;
	private Indirizzo indirizzo;
	
	public Persona(String nome) {
		
		this.nome = nome;
			
	}
	
	private class Indirizzo{
		String via;
		String citta;
		String cap;
		
		public Indirizzo(String via, String citta, String cap) {
			this.via = via;
			this.citta = citta;
			this.cap = cap;
		}
		
		String stampaIndirizzo() {
			
			return nome + "abita in via: " + via + "al cap: " + cap + "della citta: " + citta;
		}
	}
		
		public void creaIndirizzo(String via, String citta, String cap) {
			
			indirizzo = new Indirizzo(via, citta, cap);
			
		}	
	
	
	
	public String stampa() {
		
		return indirizzo.stampaIndirizzo();
	}
	
	

}
