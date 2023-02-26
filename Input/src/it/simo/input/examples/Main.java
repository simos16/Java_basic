package it.simo.input.examples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Vuoi andare avanti? (s/n)");

		//creo una variabile per memorizzare il dato da input
		String response = in.nextLine();

		InputUtente inputUser = new InputUtente(response);
		System.out.println(inputUser.risposta());

	}

}
