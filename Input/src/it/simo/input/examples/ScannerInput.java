package it.simo.input.examples;

import java.util.Scanner;

public class ScannerInput {


		public static String titolo;
		public static String autore;
		public static String editore;
		public static int numPagine;
		public static float prezzo;
		public static double prezzoIva;
		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inserisci il titolo");
			titolo = input.nextLine();
			System.out.println("Inserisci l'autore");
			autore = input.nextLine();
			System.out.println("Inserisci l'editore");
			editore = input.nextLine();
			
			System.out.println("Inserisci il num di pagine");
			numPagine = input.nextInt();
			System.out.println("Inserisci il prezzo");
			prezzo = input.nextFloat();
			System.out.println("Inserisci il prezzo con iva");
			prezzoIva = input.nextDouble();
			
			
			
			//output dei dati
			System.out.println("Ecco il tuo libro");
			System.out.println(titolo + 
					"\n" + autore + 
					"\n" + editore +
					"\n"+  numPagine +
					"\n"+  prezzo +
					"€\n" +
						   prezzoIva + "€");
			
			
			//chiudo tutto il flusso dei dati
			input.close();
			
			
		}

}
