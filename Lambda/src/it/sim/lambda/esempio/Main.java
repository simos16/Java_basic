package it.sim.lambda.esempio;

import java.util.ArrayList;
import java.util.function.Consumer;



public class Main implements  FunzioniStringa  {

	public static void main(String[] args) {
		

		//uso base 
		ArrayList<Integer> codici = new ArrayList<Integer>();
	    codici.add(789);
	    codici.add(543);
	    codici.add(456);
	   
	    codici.forEach( (i) -> { System.out.println(i); } );
	    
	    
	    ArrayList<Float> matricole = new ArrayList<Float>();
	    
	    matricole.add(45.67f);
	    matricole.add(87.34f);
	    matricole.add(23.42f);
	    
	    Consumer<Float> varLambda = (i) -> {System.out.println(i);};
	    matricole.forEach(varLambda);
	    
	    
	    
	    
	    
	    FunzioniStringa giorno = (str) -> str + "buona giornata";
	    FunzioniStringa sera = (str) -> str + "buona serata";
	    stringaStampata("Ciao, ", giorno);
	    stringaStampata("Ciao, ", sera);
	}

	
	//creo un metodo per gestire le stringhe
	 public static void stringaStampata(String str, FunzioniStringa format) {
		    String risultato = format.scrivi(str);
		    System.out.println(risultato);
		  }


	 



	@Override
	public String scrivi(String str) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
