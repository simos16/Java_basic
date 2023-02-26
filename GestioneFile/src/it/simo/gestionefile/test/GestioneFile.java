package it.simo.gestionefile.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GestioneFile {

	public static void main(String[] args) {
		//WIN: C:\\Users\\risorse\\nomefile.txt
		//creo un oggetto per la risorsa che devo utilizzare
				File text = new File("/Users/simona/Desktop/cartella/utente.txt");
				//creo un file
				try {
				
					if(text.createNewFile()) {
						System.out.println("Il file è stato creato correttamente: " + text.getName());			
						}
					else {
						System.out.println("Il file esiste già");			
						}
					}
				catch(IOException exc) {
					System.out.println("Creazione non avvenuta correttamente");
					System.out.println(exc);			
				}
				
				//scrivo sul file
				try {
				FileWriter textScrivi = new FileWriter("/Users/simona/Desktop/cartella//utente.txt");
				textScrivi.write("Sto imparando Java per web application");
				textScrivi.close();
				System.out.println("il File è stato correttamente scritto");
				}catch(IOException e) {
					System.out.println("Problema nella scrittura del file");
					System.out.println(e);			
				}
				try {
				
				Scanner leggiTesto = new Scanner(text);
				while(leggiTesto.hasNextLine()) {
					String data  = leggiTesto.nextLine();
					System.out.println(data);		
				}
				leggiTesto.close();
				}
				catch(FileNotFoundException exc) {
					System.out.println("File letto correttamente");
					System.out.println(exc);	
				}
				
				//cancella la risorsa
				/*if(text.delete()) {
					System.out.println("E' stato cancellato il file:" + text.getName() );
				}else {
					System.out.println("errore nella cancellazione del file");
				}*/
				
				//per essere cancellate le cartelle devono essere vuote
				/*File folder = new File("/Users/simona/Desktop/cartella");
				if(folder.delete()) {
					System.out.println("E' stata cancellata la cartella:" + folder.getName() );
				}else {
					System.out.println("errore nella cancellazione della cartella");
				}*/
			
				//classi dello stream dei dati senza buffer
				/*try {
				FileInputStream input = new FileInputStream("/Users/simona/Desktop/cartella/utente.txt");
				FileOutputStream output = new FileOutputStream("/Users/simona/Desktop/cartella/text1Copia.txt");
				byte[] stream = new byte[1024];
				int lunghezza = 0;
				
				while( (lunghezza = input.read(stream) ) > 0 ){
					System.out.println("letti: " + lunghezza + " bytes");
					output.write(stream, 0,lunghezza);
					System.out.println("scritti: " + lunghezza + " bytes");	
				}
				input.close();
				output.close();
				}catch(Exception e) {
					System.out.println("Operazioni  eseguite correttamente");
					System.out.println(e);			
				}*/
				
				//classi dello stream dei dati con buffer
				try {
				BufferedInputStream inputBuf = new BufferedInputStream(new FileInputStream("/Users/simona/Desktop/cartella/utente.txt"));
				BufferedOutputStream outputBuf = new BufferedOutputStream(new FileOutputStream("/Users/simona/Desktop/cartella/text2Copia.txt"));
				byte[] stream = new byte[1024];
				int lunghezza = 0;
				
				while( (lunghezza = inputBuf.read(stream) ) > 0 ){
					System.out.println("letti con buffer: " + lunghezza + " bytes");
					outputBuf.write(stream, 0,lunghezza);
					System.out.println("scritti con buffer: " + lunghezza + " bytes");	
				}
				inputBuf.close();
				outputBuf.close();
				}catch(FileNotFoundException e) {
					System.out.println("Operazioni  eseguite correttamente");
					System.out.println(e);	
				}catch(IOException e) {
					System.out.println("Operazioni  eseguite correttamente");
					System.out.println(e);	
				}
				
				//uso della classe PrintWriter
				try {
				BufferedReader readBuf = new BufferedReader(new FileReader("/Users/simona/Desktop/cartella/text2Copia.txt"));
				PrintWriter printText = new PrintWriter(new FileWriter("/Users/simona/Desktop/cartella/utente.txt"));
				String linea;
				while( (linea = readBuf.readLine()) != null ) {
					System.out.println("letta la riga: " + linea);
					printText.println(linea);
				}
				readBuf.close();
				printText.close();
				}
				//eccezione tipica delle operazioni di ricerca dei file: file not found
				catch(FileNotFoundException e) {
					System.out.println("Operazioni  eseguite correttamente");
					System.out.println(e);	
				}
				//eccezione tipica delle operazioni sui flussi di dati
				catch(IOException e) {
					System.out.println("Operazioni  eseguite correttamente");
					System.out.println(e);	
				}

	}

}
