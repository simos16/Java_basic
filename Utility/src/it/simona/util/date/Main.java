package it.simona.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		//prende la data attuale
		LocalDate myDate = LocalDate.now();
		
		//leggo la data
		System.out.println(myDate);
		
		//prende l'orario attuale
		LocalTime myTime = LocalTime.now();
		//leggo l'orario
		System.out.println(myTime);
		
		LocalDateTime orario = LocalDateTime.now();
		System.out.println(orario);

		//metodi di formattazione
		DateTimeFormatter orarioFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		String data = orario.format(orarioFormat);
		System.out.println("Data formattata modello 1: " + data);
		
		DateTimeFormatter orarioFormat1 = DateTimeFormatter.ofPattern("E,dd/MM/yyyy");
		String data1 = orario.format(orarioFormat1);
		System.out.println("Data formattata modello 2 " + data1);
		
		DateTimeFormatter orarioFormat2 = DateTimeFormatter.ofPattern("E,dd MMM yyyy HH");
		String data2 = orario.format(orarioFormat2);
		System.out.println("Data formattata modello 3: " + data2);
	}

}
