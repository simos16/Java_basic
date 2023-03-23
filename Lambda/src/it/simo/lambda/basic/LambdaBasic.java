package it.simo.lambda.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaBasic {

	public static void main(String[] args) {
		
		int lunghezza = 4;
		
		
		//senza lambda e con classe anonima
		Disegna d = new Disegna() {
			
		@Override
		public void disegna() {
			System.out.println("Sto diegnando una linea di: " + lunghezza + " cm" );
		}
		};
		
		d.disegna();
		
		
		Disegna d1 = ()->{System.out.println("Sto diegnando una linea di: " + lunghezza + " cm" );
		};
		
		d1.disegna();
		
		
		/*Saluta messaggio = () -> {
			
			return "sono una lambda senza parametri";
		};
		
		System.out.println(messaggio.saluta());*/
		
		
		/*Saluta messaggio1 = (nome) ->{
			
			return "Ciao " + nome;
		};
		
		System.out.println(messaggio1.saluta("Mario"));
		
		
		//le parentesi del parametro si possono omettere
		Saluta messaggio2 = nome ->{
			
			return "Ciao " + nome;
		};
		
		System.out.println(messaggio1.saluta("Giulia"));*/
		
		//lambda con più parametri
		Operazioni op1 = (num, num1) ->(num + num1);
		System.out.println(op1.somma(10, 10));
		
		//più parametri e return
		Operazioni op2 = ( int a,  int b) ->{
			return (a + b);
		};
		
		System.out.println(op1.somma(10, 10));
		
		System.out.println(op2.somma(30, 10));
		
		
		//lambda con più istruzioni
		Saluta avviso = (nome) ->{
			String s1 = "Per favore, saluta: ";
			String s2 = s1 + nome;
			
			return s2;
			
		};
		System.out.println(avviso.saluta("Federico"));
		
		
		//lambda e foreach
		 List<String> list=new ArrayList<String>();  
	        list.add("gatto");  
	        list.add("cane");  
	        list.add("criceto");  
	        list.add("coniglio");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
		
		
		//creare un thread con lambda
	        
		
	        //Thread senza lambda  
	        Runnable r1=new Runnable(){  
	            public void run(){  
	                System.out.println("Thread1 attivo");  
	            }  
	        };  
	        Thread t1=new Thread(r1);  
	        t1.start();  
	        
	        //Thread con lambda  
	        Runnable r2=()->{  
	                System.out.println("Thread2 attivo");  
	        };  
	        Thread t2=new Thread(r2);  
	        t2.start();  
	        
	        
	       
	        
	        List<Articoli> list1=new ArrayList<Articoli>();  
	          
	        list1.add(new Articoli(1,"mocassino", 200f));  
	        list1.add(new Articoli(3,"sandalo",80f));  
	        list1.add(new Articoli(2,"ciabatta",150f));  
	        list1.add(new Articoli(3,"mocassino rosso", 350));  
	        list1.add(new Articoli(4,"sandalo verde", 120f));  
	        list1.add(new Articoli(5,"ciabatta arancio",180f));  
	          
	        Stream<Articoli> filtro = list1.stream().filter(p -> p.prezzo >= 200);  
	          
	      
	       filtro.forEach(  
	                articoli -> System.out.println(articoli.nome+": "+ articoli.prezzo)  
	        );  
		
		
	}

}
