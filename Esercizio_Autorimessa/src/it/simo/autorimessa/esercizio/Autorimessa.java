package it.simo.autorimessa.esercizio;

import java.util.ArrayList;

public class Autorimessa {
	
	private ArrayList<String> box;
	
	public Autorimessa() {
	box = new ArrayList<String>(); 
	}
	
	private int cercaTarga(String targa) {
	int result = -1;
	for(int i=0;i<box.size();i++) {
	if(box.get(i).equals(targa)) 
		result=i;
	}
	return result; }
	
	
	public void parcheggia(String targa) {
	if(cercaTarga(targa)!= -1) 
		return;
	box.add(targa); }
	
	
	public void rimuovi(String targa)
	{
	if(cercaTarga(targa)==-1) return;
	box.remove(cercaTarga(targa));
	}
	
	public int numeroAuto()
	{
	
	return box.size();
	}

}
