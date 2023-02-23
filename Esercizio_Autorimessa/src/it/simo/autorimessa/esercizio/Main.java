package it.simo.autorimessa.esercizio;

public class Main {

	public static void main(String[] args) {
		Autorimessa prova = new Autorimessa(); 
		prova.parcheggia("BB56743"); 
		prova.parcheggia("CC76542");
		prova.parcheggia("GG67897");
		prova.parcheggia("HH65439"); 
		prova.parcheggia("SS76543");
		prova.parcheggia("RR76890"); 
		System.out.println(prova.numeroAuto()); 
		prova.rimuovi("SA100TA"); 
		System.out.println(prova.numeroAuto());
	}

}
