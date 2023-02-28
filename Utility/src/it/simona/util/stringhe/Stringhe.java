package it.simona.util.stringhe;

public class Stringhe {

	public static void main(String[] args) {
		String saluto = "Java è un linguaggio solido";
	
		
		String nome = "pinco";
		String cognome = "paLLino";
		
		String nome1 = "Pinco";
		String sub = "linguaggio";
		String vuota = "";
		
		String esempio = "Java è un linguaggio solido e sicuro";
		
		String a = "aa";
		String b = "aA";
		String c = "a a";
		
		String esempio1 = "  Ciao a tutti  ";
		
		System.out.println(saluto.length());
		
		System.out.println(saluto.toUpperCase());
		System.out.println(saluto.toLowerCase());
		
		System.out.println(saluto.charAt(8));
		
		System.out.println(saluto.indexOf("Java")); //first elements
		System.out.println(esempio.lastIndexOf("Java"));
		
		System.out.println(nome.concat(" " + cognome));
		
		//System.out.println(nome.compareTo(nome1));  //result 0 = stringhe uguali
		
		//System.out.println(nome.compareTo(cognome));
		
		//System.out.println(nome.compareToIgnoreCase(saluto));
		
		System.out.println(nome.equals(nome1));
		System.out.println(nome.equalsIgnoreCase(nome1));
		System.out.println(nome.equals(cognome));
		
		System.out.println(saluto.contains("un"));
		System.out.println(saluto.contains(sub));
		
		System.out.println(saluto.startsWith("java")); //case sensitive
		System.out.println(saluto.endsWith(sub));

		System.out.println(saluto.getBytes()); //allocazione di memoria
		System.out.println(nome.getBytes());
		
		System.out.println(saluto.isEmpty());
		System.out.println(vuota.isEmpty());
		
		
	    System.out.println(saluto.matches(esempio));
	   
	    System.out.println(a.matches(b));
	    System.out.println(a.matches(c));
	    
	    System.out.println(cognome.replace("l","r"));
	    System.out.println(cognome.replaceFirst("l","r"));
	    
	    String[] sub1 = cognome.split("a",2);
		
	    for(String x : sub1) {
	    	System.out.println(x);
	    }
	    	
	    System.out.println(cognome.substring(2,4));
	    
	    System.out.println(esempio1);
	    System.out.println(esempio1.trim());
	    
	    System.out.println(cognome.codePointAt(3)); //unicode

	}

}
