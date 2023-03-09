package it.simo.database.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch {
	static String nomi[]= {"Giulia", "Carlo", "Elena","Chiara", "Paolo","Federico"};
	static String cognomi[]= {"Rossi", "Bianchini", "Verdetti","Brini", "Rossetti","Verdi"};
	static int eta[]= {12,67,54,43,23,98};
	static String citta[]= {"Roma", "Firenze", "Milano","Roma", "Palermo","Modena"};
	
	public static void main(String[] args) 
	{
		
		
		try
	    {
		  
			
		  Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/TUO-DB", "TUO-UTENTE", "TUA-PASSWORD");
		  Statement  myStat = connessione.createStatement();
          myStat.execute("CREATE TABLE IF NOT EXISTS persone (id_persone INT NOT NULL AUTO_INCREMENT, "
          		+ "cognome VARCHAR(100), "
          		+ "nome VARCHAR(100), "
          		+ "eta INT, "
          		+ "citta VARCHAR(100), "
          		+ "PRIMARY KEY(id_persone))");
		  
		  
	      PreparedStatement stm=connessione.prepareStatement("INSERT INTO persone (cognome, nome, eta, citta) VALUES (?,?,?,?)");
	      
	      for(int i=0; i<=5; i++)
	      {
		      stm.setString(1, nomi[i]);
		      stm.setString(2, cognomi[i]);
		      stm.setInt(3, eta[i]);
		      stm.setString(4, citta[i]);
		      stm.addBatch();
	      }
	      
	     
	      
	       stm.executeBatch();
	     
	          ResultSet leggoTabella = stm.executeQuery("SELECT * FROM persone");
	          while(leggoTabella.next()) {
	         	 System.out.println("Cognome: " + leggoTabella.getString("cognome") + " "
						+ "Nome: " +  leggoTabella.getString("nome"));	
	          }
	      
	      
	      connessione.close();
	      
	    }
		catch (SQLException e) {
			e.printStackTrace();
		}
	   
	  }

}
