package it.simo.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Impiegati {
	
	private String nome;
	   private String dipartimento;
	   private int salario;
	   private List<Impiegati> dipendenti;

	   // constructor
	   public Impiegati(String nome,String dipartimento, int salario) {
	      this.nome = nome;
	      this.dipartimento = dipartimento;
	      this.salario = salario;
	      dipendenti = new ArrayList<Impiegati>();
	   }

	   public void add(Impiegati e) {
		   dipendenti.add(e);
	   }

	   public void remove(Impiegati e) {
		   dipendenti.remove(e);
	   }

	   public List<Impiegati> getDipendenti(){
	     return dipendenti;
	   }

	   public String toString(){
	      return ("Impiegati: Nome : " + nome + ", DIP: " + dipartimento + ", salario :" + salario );
	   }   

}
