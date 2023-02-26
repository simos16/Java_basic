package it.simo.innerclass.examples;

public class Outer {
	
		int numero = 7;
		String parola = "Ciao";
		
		
		
		//classe innestata
		class Inner{
			int valore = 6;	
			public int recupera() {
				return numero;
			}
		}
		
		
		
		static class InnerStatic{
			int val = 10;	
		}
		
		
		
		enum Lista{
			LARGE,
			SMALL,
			XLARGE	
		}

}
