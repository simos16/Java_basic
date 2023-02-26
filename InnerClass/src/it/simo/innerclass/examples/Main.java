package it.simo.innerclass.examples;

import it.simo.innerclass.examples.Outer.Lista;

public class Main {

	public static void main(String[] args) {
		Outer objOut = new Outer();
		//indico il percorso della classe e creo un oggetto della classe contenitore 
		//per mettere a disposizione la classe innestata stessa
		Outer.Inner objInner = objOut.new Inner();
		
		objInner.valore = 12;
		objInner.recupera();
		
		
		System.out.println(objInner.recupera()); // output 7
		
		objOut.numero = 13;
		
		System.out.println(objOut.numero + objInner.valore);
		
		Outer.InnerStatic objStatic = new Outer.InnerStatic();
		objStatic.val = 20;
		
			System.out.println("=======ENUMS========");
		//richiamo enum da file esterno
		MyList items = MyList.ALTO;
		System.out.println("Valore della lista: " + items);

		
		//questa lista è definita all'interno della classe
		Lista itemLista = Lista.SMALL;

		switch(itemLista) {
			case LARGE:
				System.out.println("LARGE: Taglia troppo grande");
				break;
			case SMALL:
				System.out.println("SMALL: Taglia giusta");
				break;
			case XLARGE:
				System.out.println("XL: Taglia eccessiva");
				break;	
		}

		for(Lista items1 : Lista.values()) {
			System.out.println("Elenco elementi della enum Lista: " + items1);
	
		}


System.out.println("=========USO CLASSE INTERNA PRIVATE=======");
Persona person = new Persona("Mario Rossi");

person.creaIndirizzo("via delle strade", "Roma", "5678");

System.out.println(person.stampa());

	}

}
