package it.simo.transact.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class AcquisisciDati {
	public static void main(String[] args) throws SQLException {
	
		Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/importo", "root", "simodev20");
		connessione.setAutoCommit(false);
		
		Statement  myStat = connessione.createStatement();
		
		
		myStat.executeUpdate("INSERT INTO test(titolo, testo) VALUES('titolo 8', 'testo 8')");  
		myStat.executeUpdate("INSERT INTO test(titolo, testo) VALUES('titolo 6', 'testo 6')");  
		myStat.executeUpdate("INSERT INTO test(titolo, testo) VALUES(titolo 9, 'testo 9')");  
		
		connessione.commit();
		
		ResultSet data = myStat.executeQuery("SELECT * FROM test");
		while(data.next()) {
			System.out.println("Titolo articolo: " + data.getString("titolo") + " "
					+ "Contenuto: " +  data.getString("testo"));	
		}
		
		
		connessione.close();
		
	}

}
