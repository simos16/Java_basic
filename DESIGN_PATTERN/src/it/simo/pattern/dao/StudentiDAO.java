package it.simo.pattern.dao;

import java.util.List;

public interface StudentiDAO {
	
		public List<Studenti> getStudenti();
	   
		public Studenti getStudenti(int matricola);
	   public void aggiornaStudenti(Studenti studente);
	   public void cancellaStudenti(Studenti studente);

}
