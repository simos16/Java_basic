package it.simo.pattern.composite;

public class Main {

	public static void main(String[] args) {
		Impiegati CEO = new Impiegati("Carla","CEO", 30000);

		Impiegati manager = new Impiegati("Federica","Manager", 20000);

		Impiegati marketing = new Impiegati("Giulia","Capo Marketing", 20000);

		Impiegati imp1 = new Impiegati("Roberta","Supervisore", 10000);
		Impiegati imp2 = new Impiegati("Chiara","Supervisore", 10000);

		Impiegati socio1 = new Impiegati("Camilla","Customer Care", 10000);
		Impiegati socio2 = new Impiegati("Rossella","Customer Care", 10000);

	      CEO.add(manager);
	      CEO.add(marketing);

	      manager.add(socio1);
	      manager.add(socio2);

	     marketing.add(imp1);
	     marketing.add(imp2);

	      //print all employees of the organization
	      System.out.println(CEO); 
	      
	      for (Impiegati managerImp : CEO.getDipendenti()) {
	         System.out.println(managerImp);
	         
	         for (Impiegati employee : managerImp.getDipendenti()) {
	            System.out.println(employee);
	         }
	      }		
	}

}
