package it.simo.pattern.mvc;

public class StudenteController {
	
	   private Studenti model;
	   private StudentiView view;

	   public StudenteController(Studenti model, StudentiView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setNomeStudente(String nome){
	      model.setNome(nome);		
	   }

	   public String getNomeStudente(){
	      return model.getNome();		
	   }

	   public void setMatricolaStud(String matricola){
	      model.setMatricola(matricola);		
	   }

	   public String getMatricolaStud(){
	      return model.getMatricola();		
	   }

	   public void aggiornaView(){				
	      view.dettaglioStudenti(model.getNome(), model.getMatricola());
	   }	

}
