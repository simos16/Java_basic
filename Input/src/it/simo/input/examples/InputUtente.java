package it.simo.input.examples;

public class InputUtente {
	
	private String domande;
	
	public InputUtente(String domande) {
		this.domande = domande;
	}
	
	public String risposta() {
		//Sì, S, Certo, Perchè no
		if(domande.equalsIgnoreCase("S") || domande.equalsIgnoreCase("Sì") || domande.equalsIgnoreCase("Certo")) {
			
			return "Sono contenta che vuoi proseguire";
		}
		//No, N
		else if(domande.equalsIgnoreCase("No") || domande.equalsIgnoreCase("N")) {
			
			return "Peccato che te ne vada";
			
		}else {
			
			return "Inserimento dati non corretto";
		}
		
	}

}
