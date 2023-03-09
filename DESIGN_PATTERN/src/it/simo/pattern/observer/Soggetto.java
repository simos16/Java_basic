package it.simo.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Soggetto {
	
	   private List<Observer> observers = new ArrayList<Observer>();
	   private int stato;

	   public int getState() {
	      return stato;
	   }

	   public void setState(int state) {
	      this.stato = state;
	      notifyAllObserver();
	   }

	   public void attach(Observer observer){
	      observers.add(observer);		
	   }

	   public void notifyAllObserver(){
	      for (Observer observer : observers) {
	         observer.aggiorna();
	      }
	   } 	
	

}
