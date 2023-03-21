package it.simo.thread2.sincro;

public class Main {

	public static void main(String[] args) {
		
		Risorsa objRis = new Risorsa();
		
		//new Flussi(objRis).start();
		
		Flussi obj1 = new Flussi(objRis);
		obj1.setName("Primo");
		
		Flussi obj2 = new Flussi(objRis);
		obj2.setName("Secondo");
		
		obj1.start();
		obj2.start();
		
		

	}

}
