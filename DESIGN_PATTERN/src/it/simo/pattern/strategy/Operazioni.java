package it.simo.pattern.strategy;

public class Operazioni {
	
	private Strategia strategia;

	public Operazioni(Strategia strategia) {
		
		this.strategia = strategia;
	}
	
	public int eseguiStrategia(int num1,int num2) {
		
		return strategia.operazioni(num1,num2);
	}
	
	

}
