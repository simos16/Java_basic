package it.sim.collections.examples;


import java.util.ArrayList;

import java.util.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList<String> fiori = new ArrayList<String>();
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		//aggiungo elementi  metodo add()
		fiori.add("rosa");  // 0
		fiori.add("geranio");  //1
		fiori.add("ciclamino");
		fiori.add("ciclamino"); 
		fiori.add("viola"); // 3
		fiori.add("margherita"); //4
		System.out.println(fiori);
		
		//accesso al singolo elemento metodo get()
		
		  System.out.println(fiori.get(3));
	
		  
		  //modifico un elemento set()
		  fiori.set(0, "orchidea");
		  System.out.println(fiori);
		
		  //rimuovere elemento remove()
		  System.out.println(fiori.remove(3));
		  System.out.println(fiori);
		  
		  //rimuovere tutti gli elementi clear()
		  //fiori.clear();
		  //System.out.println("Lista svuotata: " + fiori);
		  
		  //misurare array size()
		  //fiori.size();
		  System.out.println(fiori.size());
		  
		  //ciclo for su array
		  for(int i = 0; i < fiori.size(); i++) {
			  System.out.println(fiori.get(i));	  
		  }
		  
		  //ciclo for/each su array
		  for(String i : fiori) {
			  System.out.println("Ciclo for / each " + i);	  
		  }
		  
		  //Float / Double / Boolean
		  ArrayList<Integer> numeri = new ArrayList<Integer>();
		  
		  //metodo sort() per odinamento alfabetico tramite la classe Collections
		  Collections.sort(fiori);
		  System.out.println(fiori);	
		  
		  for(String i : fiori) {
			  System.out.println(i);	  
		  }
		  
		 // ciclo su array da dato primitivo 
		  for(int i : numeri) {
			  System.out.println(i);	  
		  }
		  
		  System.out.println("=========LINKEDLIST===========");
		  // LinkedList => utilizzare per manipolare i dati
		  
		  LinkedList<Integer> numero = new LinkedList<Integer>();
		  numero.add(4);
		  numero.add(7);
		  numero.add(78);
		  numero.add(25);
		  System.out.println("LinkedList intero: " + numero);
		  
		
		  //LinkedList ha suoi metodi specifici
		 numero.addFirst(5);  // parametro = valore che vogliamo aggiungere
		 System.out.println("Valore aggiunto all'inizio:" + numero);
		
		 numero.addLast(90);
		 System.out.println("Valore aggiunto alla fine:" + numero);
		 
		 numero.removeFirst();
		 numero.removeLast();
		 
		 numero.get(1);  // 
		 System.out.println(numero.get(1));  //output del secondo elemento
		 System.out.println(numero);
		 
		 numero.getFirst();
		 numero.getLast();
		 
		 System.out.println("=========HASHMAP===========");
		 
		 //String => key  ---- String => value
		 HashMap<String,String> pet = new HashMap<String,String>();
		 pet.put("coniglio","gigante");
		 pet.put("uccello","canarino"); //key=>value
		 pet.put("gatto","soriano");
		 pet.put("gatto1","soriano");
		 pet.put("cane","labrador");
		 pet.put("coniglio1","gigante");
		 //pet.put("cane","retriever"); //la lista leggerà una sola chiave
		
		 //pet.put("uccello","aquila");
		//attenzione all'ordine di lettura degli elementi
		 System.out.println("HashMap string/string " + pet);
		 
		 // lettura singolo elemento
		 //cosa succede se accedo con il valore? qui viene restituito un null
		 pet.get("soriano");
		 System.out.println("Leggi il valore: " + pet.get("soriano"));
		 
		 //get() si imposta sulla chiave della lista
		 pet.get("cane");
		 System.out.println("Leggi il valore dalla chiave: " + pet.get("cane"));
		 
		 pet.remove("gatto");
		 System.out.println(pet);
		 
		 //rimozione totale elementi
		 //pet.clear();
		 
		 //metodo che restituisce la grandezza dell'array = numeri elementi
		 System.out.println(pet.size());
		 
		 //ciclo col for / each 
		 for(String i : pet.keySet()) {
			 System.out.println("Chiave:" + i);	 
		 }
		 
		 for(String i : pet.values()) {
			 System.out.println("Valore:" + i);	 
		 }
		 
		 //
		 for(String i : pet.keySet()) {
			 System.out.println("Chiave: " + i + " valore corrispondente: " + pet.get(i));			 
		 }
		 
		 //HashMap con datatype differenti
		 //è necessario rispettare l'ordine:  chiave (primo attributo) e valore (secondo attributo)
		 HashMap<Integer, String> listaMista = new HashMap<Integer, String>();
		 
		 listaMista.put(12345, "Mario");
		 //listaMista.put("Carla", 76543); // ordine non rispettato
		 
		 
		 for(Integer i : listaMista.keySet()) {
			 System.out.println("Chiave:" + i);	 
		 }
		 
		 for(String i : listaMista.values()) {
			 System.out.println("Valore:" + i);	 
		 }
		 
		 System.out.println("=========HASHSET===========");
		 
		 //collection che accetta solo dati unici
		 HashSet<String> car = new HashSet<String>();
		 car.add("Fiat");
		 car.add("BMV");
		 car.add("Audi");
		 car.add("Fiat");
		 System.out.println("Elementi HashSet: " + car);	 
		 
		 //metodo ritorna un booleano
		 System.out.println(car.contains("Renault"));
		 
		 //metodi add(parametro) / remove(parametro) / clear() / size()
		 car.remove("BMV");
		 System.out.println(car);	 
		 
		 for(String i : car) {
			 System.out.println(i);	 
		 }
		 
		 //car.clear();
		//System.out.println(car);	 
		 car.size();
		 System.out.println(car.size());	 		
		 
		 HashSet<Integer> listaNum = new HashSet<Integer>();
		 listaNum.add(10);
		 listaNum.add(3);
		 listaNum.add(7);
		 listaNum.add(12);
		 
		 for(int i = 0; i <= 10; i++) {
			 
			 if(listaNum.contains(i)) {
				 System.out.println(i + " presente  nella lista");
				 
			 		}else {
				 System.out.println(i + " non presente nella lista");
			 			}		  
		 }
		 
		 System.out.println("=========ITERATOR===========");
		 
		 ArrayList<String> fioriBis = new ArrayList<String>();
			fioriBis.add("rosa");  // 0
			fioriBis.add("geranio");  //1
			fioriBis.add("ciclamino");
			fioriBis.add("orchidea"); 
			
			Iterator<String> loopItem = fioriBis.iterator();
			
			//mostra il funzionamento di next()
			System.out.println(loopItem.next());
			
			while(loopItem.hasNext()) {
				System.out.println(loopItem.next());
			}
			
			HashSet<Integer> listaNumeri = new HashSet<Integer>();
			 listaNumeri.add(10);
			 listaNumeri.add(3);
			 listaNumeri.add(7);
			 listaNumeri.add(12);
			 
			 Iterator<Integer> loopNum = listaNumeri.iterator();
			 
			 while(loopNum.hasNext()) {
				 Integer i = loopNum.next(); 
				 if(i >= 10) {
					 loopNum.remove();			 
				 }		 
			 }
			 
			 System.out.println(listaNumeri);
		
	}

}
