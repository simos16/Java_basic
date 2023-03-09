package it.simo.pattern.dao;

public class Main {

	public static void main(String[] args) {
		StudentiImpl stud = new StudentiImpl();

		for (Studenti studenti : stud.getStudenti()) {
	         System.out.println("Studente: matricola : " + studenti.getMatricola() + ", nome : " + studenti.getNome());
	      }
	      


	      Studenti studenti = stud.getStudenti().get(1);
	      studenti.setNome("Giorgio");
	      stud.aggiornaStudenti(studenti);
	      stud.cancellaStudenti(studenti);
	      

	      
	      //stud.getStudenti(0);
	      //System.out.println("Studente matricola: " + studenti.getMatricola() + ", nome : " + studenti.getNome());	
	     

	}

}
