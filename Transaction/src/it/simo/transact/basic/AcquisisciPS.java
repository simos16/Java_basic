package it.simo.transact.basic;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AcquisisciPS {

	public static void main(String[] args) throws SQLException {
		
		try {
		Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/importo", "root", "simodev20");
		connessione.setAutoCommit(false);
		
		PreparedStatement myStatPrep= connessione.prepareStatement("INSERT INTO test(titolo,testo) VALUES(?,?)"); 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			System.out.println("inserisci titolo");  
			
				String titolo= reader.readLine();
		 
			  
			  
			System.out.println("inserisci un testo");  
			
				String testo= reader.readLine();
			 
			  
			myStatPrep.setString(1, titolo);  
			myStatPrep.setString(2, testo);  
			myStatPrep.executeUpdate();  
			
			System.out.println("commit/rollback");  
			String answer = reader.readLine();
				
			if(answer.equals("commit")){  
					connessione.commit();  
					}  
				if(answer.equals("rollback")){  
					connessione.rollback();  
					}  
		 //while
		
		System.out.println("Want to add more records y/n");  
		String ans= reader.readLine();  
		if(ans.equals("n")){  
		break;  
		} 
		}
		connessione.commit();  
		System.out.println("record successfully saved");  
		  
		connessione.close(); 
			} catch (IOException e) {
			
				e.printStackTrace();
			}  
			
			
		
		
	}

}
