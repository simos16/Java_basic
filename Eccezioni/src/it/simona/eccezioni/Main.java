package it.simona.eccezioni;

public class Main {
	
	public int divisione(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		/*
		 * Gestire le eccezioni con blocco try / catch
		 * ............
		 * try {
		 *     blocco di codice
		 * 
		
		 * }catch(Exception e){
		 * 			blocco per la gestione del messaggio
		 * 
		 * }
		 * 
		 * */
		
		//sintassi base
		try {
			
			int[] listaNumeri = {3,4,6};
			System.out.println(listaNumeri[2]);
			
		}catch(Exception e) {
			System.out.println("Ops..., qualcosa è andato storto");
	
		}finally {
			System.out.println("Ok, il controllo è terminato");	
		}
		
		System.out.println("========================");
		
		Main operazione = new Main();
		
		
		
		try {
			
			//codice da eseguire
			int divido = operazione.divisione(5, 0);
			System.out.println("Il risultato è " + divido);
			
		} catch (ArithmeticException exc) {
			exc.printStackTrace();
			
			System.out.println(exc);
			System.out.println("Attenzione!!!");
		}catch(Exception e) {
			
			System.out.println(e);
			System.out.println("eccezione generica");
		}finally {
			System.out.println("Controllo del metodo divisione: tutto ok! Fine");
		}
		
		//codice seguente
		int divido1 = operazione.divisione(10, 2);
		System.out.println("Il risultato è " + divido1);
		
		
	
	
	}

}
