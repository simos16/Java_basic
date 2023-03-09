package it.simo.pattern.mvc;

public class Main {

	public static void main(String[] args) {
		//fetch student record based on his roll no from the database
	      Studenti model  = prendiDati();

	      //Create a view : to write student details on console
	      StudentiView view = new StudentiView();

	      StudenteController controller = new StudenteController(model, view);

	      controller.aggiornaView();

	      //update model data
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
