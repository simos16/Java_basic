package it.simo.gestionefile.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileTest {

	public static void main(String[] args) {
		//File obj = new File("folder/utente.txt");
		
		//percorso per Windows => C:\cartella\persone.txt

		
		//String path = "/Users/simona/folder/utente.txt";
		//File obj = new File(path);
		
		//Windows = File("C:"+ File.separator + "utente.txt");

		
		File obj = new File(File.separator +"/Users/simona/folder/utente.txt" );
		
		
		System.out.println("File esiste? " + obj.exists());
		System.out.println("E' un file? " + obj.isFile());
		System.out.println("Il percorso? " + obj.getPath());
		System.out.println("Il percorso? " + obj.length() + " byte");
		System.out.println("il nome? " 	+ 	 obj.getName());
		System.out.println("Scrivere? " 	+ 	 obj.canWrite());
		System.out.println("Leggere? " 	+ 	 obj.canRead());
		
		
		//FILE CREATO NEL PROGETTO
		File obj1 = new File("demo.txt");
		System.out.println("File esiste? " + obj1.exists());
		System.out.println("Il percorso? " + obj1.getPath());
	
		System.out.println("Il percorso? " + obj1.length() + " byte");
		System.out.println("il nome? " 	+ 	 obj1.getName());
		 
		
		File folder = new File( "/Users/simona/folder"); 
		for (File file:folder.listFiles()) 
		{ if (file.isDirectory()) 
			System.out.println(file.getName()+ " :cartella)"); 
		else 
			System.out.println(file.getName() + " e occupa " + file.length() + " byte");
					 }
		
		
		//SERIALIZZARE E DESERIALIZZARE STRUTTURE
		
		List<String> lista = List.of("pippo", "pluto", "paperino", "paperone");
		
		try(
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/Users/simona/folder/salvataggio.dat"))) 
		{ 
			out.writeObject(lista); 
		} catch(IOException io) 
		{ 
			io.printStackTrace(); 
			}

		try(
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("/Users/simona/folder/salvataggio.dat"))) 
		{ 
			List<String> lista1=(List<String>) in.readObject(); 
		lista1.stream().forEach(System.out::println); 
		} catch(IOException io) {
			io.printStackTrace(); 
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}

		
		//CREAZIONE FILE NEL PROGETTO
		/*System.out.println("=====CREAZIONE DEL FILE NEL PROGETTO=====");
		File text = new File("testo1.txt");
		

		try {
			if(text.createNewFile()) {
				System.out.println("Il file è stato creato correttamente" + text.getName());
			}else {
				System.out.println("il file " + text.getName() +  " esista già");
			}
		} catch (IOException exc) {
			System.out.println("Il file è non stato creato correttamente");
			System.out.println(exc);
		}
 


		System.out.println("=====CREAZIONE DI UN FILE IN UNA CARTELLA NEL PROGETTO=====");
		File text2 = new File("folder/testo3.txt");
		
		
		try {
			if(text2.createNewFile()) {
				System.out.println("Il file è stato" + text2.getName() + " creato correttamente");
			}else {
				System.out.println("il file " + text2.getName() +  " esista già");
			}
		} catch (IOException exc) {
			System.out.println("Il file è non stato creato correttamente");
			System.out.println(exc);
		}*/

			

		
		
		}
}

