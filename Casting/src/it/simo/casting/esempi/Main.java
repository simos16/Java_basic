package it.simo.casting.esempi;

public class Main {

	public static void main(String[] args) {
		
		
		Super sup = new Sub();
		Super sup1 = new Super();
		
		sup.numero = 3;
		//sup.valore = 2; 
		
		sup.metodo(); //=> override da classe Sub
		sup1.metodo();
		
		System.out.println(sup.numero);
		
		//Sub sb = new Super(); //=> down implicito
		
		Sub sb1 = (Sub)sup;
		//Sub sb2 = (Sub)sup1;
		
		sb1.valore = 2;
		sb1.numero = 10;
		System.out.println(sb1.valore + " " + sb1.numero);
		
		//sb2.numero = 5;
		//System.out.println(sb2.numero);
		
		sb1.metodo();
		
		
		Sub sb3 = new Sub();
		
		sb3.numero = 12;
		sb3.valore = 56;
		sb3.metodo();
		
		System.out.println(sb3.valore + " " + sb3.numero);
		
		
		
		
		
	}

}
