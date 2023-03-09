package it.simo.pattern.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentiImpl implements StudentiDAO{
	
	
	List<Studenti> studenti;

	   public StudentiImpl(){
	      studenti = new ArrayList<Studenti>();
	      Studenti studente1 = new Studenti("Carlo",0);
	      Studenti studente2 = new Studenti("Giuseppe",1);
	      Studenti studente3 = new Studenti("Carla",2);
	      studenti.add(studente1);
	      studenti.add(studente2);	
	      studenti.add(studente3);	
	   }

	@Override
	public List<Studenti> getStudenti() {
		
		return studenti;
	}

	@Override
	public Studenti getStudenti(int matricola) {
		return studenti.get(matricola);
	}

	@Override
	public void aggiornaStudenti(Studenti studente) {
		studenti.get(studente.getMatricola()).setNome(studente.getNome());
		System.out.println("Studente: matricola " + studente.getMatricola());
		
	}

	@Override
	public void cancellaStudenti(Studenti studente) {
		  studenti.remove(studente.getMatricola());
	      System.out.println("Studente: matricola " + studente.getMatricola());
		
	}

	

}
