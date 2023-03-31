package it.simo.casting.esempio2;

public class Studente extends Persona{
	
	private String matricola;
	
	public Studente(String n, String c, String matricola)
	{
		super(n, c);
		this.matricola = matricola;
	}

	@Override
	public String toString()
	{
		return getNome()+" "+getCognome()+", matricola "+matricola;
	}
	

}
