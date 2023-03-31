package it.simo.casting.esempio2;

public class EsempioUpcasting2 {

	public static void main(String[] args) {
		
		String onomastico="Matteo";
		Persona[] persone= {
				new Studente("Alessia", "Verdi", "S128599"),
				new Studente("Ivan", "Rossi", "S834728"),
				new Docente("Matteo", "Gialli", "Storia"),
				new Docente("Enrico", "Arancioni", "Latino"),
				new Studente("Matteo", "Verdi", "S219047")
		};
		
		System.out.println("Auguri di buon onomastico a:");
		for(Persona p:persone)
		{
			if (p.getNome().equals(onomastico))
				System.out.println(p);
		}
		
	}

}
