package it.simo.portamonete.esercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PortaMonete p = new PortaMonete();
		boolean add = true;
		System.out.println("Inserire una moneta nel borsellino, oppure 0(zero) per terminare."); 
		
		while (add) {
		String s = in.next(); 
		if(s.equals("0"))
		     add = false;
		   else
		p.addCoin(s); 
		}
		System.out.println(p.toString());
	}

}
