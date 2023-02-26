package it.simona.eccezioni.no;


public class Main {

	public int divisione(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
			Main operazione = new Main();
		
		
			
			//codice da eseguire senza controllo delle eccezioni
			int divido = operazione.divisione(5, 0);
			System.out.println("Il risultato è " + divido);
			
			int divido1 = operazione.divisione(15, 3);
			System.out.println("Il risultato è " + divido1);
			
			int divido2 = operazione.divisione(10, 2);
			System.out.println("Il risultato è " + divido2);
	}

}
