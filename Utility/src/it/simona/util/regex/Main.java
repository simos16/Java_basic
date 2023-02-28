package it.simona.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		
		//REGEX = regular expression
		
		Pattern modello = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
		Matcher confronto = modello.matcher("java è un bel linguaggio");
		
		boolean match = confronto.find();
		
		if(match) {
			System.out.println("Confronto positivo");
				
		}else {
			System.out.println("Confronto negativo");
		}
			
		
		
		
		
	}

}
