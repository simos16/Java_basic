package it.simo.array.examples;

public class Main {

	public static void main(String[] args) {
		//array a singola dimensione
				int []  listaNumeri = {34,56,8,2,98};
				
				String [] listaFiori = {"viola", "geranio", "rosa"};
				
				System.out.println(listaNumeri[3]); //output => 2
				
				System.out.println(listaFiori[0]); //output viola
				
				listaFiori[1] = "margherita";
				
				System.out.println("Il mio array è composto di: " +  listaNumeri.length + " elementi");
				System.out.println("Il mio array è composto di: " +  listaFiori.length + " elementi");

				System.out.println("=========CICLARE ARRAY==========");
				
				
				//Ciclare un array per accedere a tutti gli elementi in lista
				for(int i = 0; i < listaFiori.length; i++) {
					System.out.println(listaFiori[i]);
				}
				
				for(int i = 0; i < listaNumeri.length; i++) {
					System.out.println(listaNumeri[i]);
				}
				
				//ciclo array con for each
				for(int i : listaNumeri) {
					System.out.println("Ciclo con for each: " + i);
				}
				
				for(String i : listaFiori) {
					System.out.println("Ciclo con for each: " + i);
				}
				
				System.out.println("=========ARRAY MULTIDIMENSIONALI==========");
				
				String cars[][]   = {{"panda", "fiat"},{"audi", "volvo"},{"chevrolet", "renault"}};
				
				//Accesso agli elementi dell'array multidimensionale 
				System.out.println(cars[1][0]);
				
				System.out.println(cars[0][2]); //fiat
	}

}
