package it.simo.pattern.mvc;

public class Main {

	public static void main(String[] args) {
		
	      Studenti model  = prendiDati();

	     
	      StudentiView view = new StudentiView();

	      StudenteController controller = new StudenteController(model, view);

	      controller.aggiornaView();

	     
	      controller.setNomeStudente("Gianni");

	      controller.aggiornaView();
	   }

	   private static Studenti prendiDati(){
	      Studenti student = new Studenti();
	      student.setNome("Roberta");
	      student.setMatricola("10");
	      return student;

	}

}
