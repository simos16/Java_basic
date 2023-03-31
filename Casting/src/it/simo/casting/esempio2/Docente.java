package it.simo.casting.esempio2;

public class Docente extends Persona{
	
	private String materia;
	
	public Docente(String n, String c, String materia)
	{
		super(n, c);
		this.materia = materia;
	}
	
	@Override
	public String toString()
	{
		return "Prof. "+getNome()+" "+getCognome()+" (insegna "+materia+")";
	}
	

}
