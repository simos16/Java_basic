package it.simo.portamonete.esercizio;

import java.util.ArrayList;

public class PortaMonete {
	
	private ArrayList<String> monete;
	
	public PortaMonete() {
	monete = new ArrayList<String>(); 
	}
	
	
	public void addCoin(String coinName) {
	monete.add(coinName); 
	}
	
	
	public String toString() {
	if (monete.size() == 0) 
		return "Il portamonete è vuoto";
	
	else {
	String conteggio = "Portamonete:";
	
	for (int i = 0; i < monete.size(); i++) {
	conteggio = conteggio + monete.get(i);
	if (i < monete.size() -1) conteggio = conteggio + "/";
	}
	return conteggio;
	}
	}
}


