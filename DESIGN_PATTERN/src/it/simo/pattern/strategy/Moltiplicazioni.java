package it.simo.pattern.strategy;

public class Moltiplicazioni implements Strategia {

	@Override
	public int operazioni(int num1, int num2) {
		
		return num1 * num2;
	}

}
