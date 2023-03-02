package it.simo.database.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* INTEGRIAMO NEL PROGETTO IL CONNETTORE PER USARE IL  JDBC
		 * JAVA DATABASE CONNECTIVITY
		 * */
		
		try {
			
			//connessione col database
			/* localhost descrive l'ambiente locale del server sul quale 
			 * stiamo lavorando -- 127.0.0.1  
			 * Ogni server ascolta su una porta che il server MySQL è la 3306
			 * Secpndo dato necessario è il nome del database sul quale voglio lavorare
			 * Terzo dato è il nome dell'utente accreditato nel server (root)
			 * Quarto dato è la password dell'utente accreditato
			 * */
			Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/TUO-DB", "TUO_USER", "TUA-PASSWORD");
			
			//creare l'istruzione
			Statement  myStat = connessione.createStatement();
			
			//sql query 
			ResultSet risposta = myStat.executeQuery("SELECT * FROM vetture ORDER BY marca ASC LIMIT 10");
			
			
			//gestiamo l'output dei dati dalla tabella vetture con un ciclo while
			while(risposta.next()) {
				System.out.println("Marca: " + risposta.getString("marca") + "-" + "Modello:" + risposta.getString("modello"));
			}
			
			if(risposta != null) {
				System.out.println("la query ha dato questi risultati.");
			}
			//
			risposta.close();
			
			System.out.println("=========ALTRA QUERY CON FILTRO======");
			
			ResultSet risposta1 = myStat.executeQuery("SELECT colore, prezzo FROM vetture WHERE colore = 'Crimson' ");
			while(risposta1.next()) {
				System.out.println(risposta1.getString("colore") + " " + risposta1.getString("prezzo"));
			}
			
			risposta1.close();
			
			/*OPERAZIONI CRUD SUI DATI CON JAVA SU MYSQL
			 * CRUD: CREATE / READ / UPDATE / DELETE
			 * */
			
			System.out.println("=========CREA UNA TABELLA======");
			/*Quando utilizzo istruzioni di creazione, update, delete, insert...
			 * posso eseguire la mia istruzione con la funzione execute() direttamente
			 * sull'oggetto che gestisce la mia connessione*/
			
			/*dobbiamo controllare l'istruzione di creazione per fare in 
			 * modo di non tentare di creare di nuovo la tabella
			 * Quindi in fase di creazione aggiungiamo l'opzione IF NOT EXISTS */
			myStat.execute("CREATE TABLE IF NOT EXISTS test (id_test INT NOT NULL AUTO_INCREMENT, titolo VARCHAR(100), testo VARCHAR(200), PRIMARY KEY(id_test))");
			
			//istruzioni di inserimento dati
			/*myStat.execute("INSERT INTO test(titolo,testo) VALUES('titolo 4', 'testo del quarto articolo'), "
					+ "('titolo 5', 'testo del quinto articolo'),"
					+ "('titolo 6', 'testo del sesto articolo') "); */
			
			
			//myStat.execute("UPDATE test SET titolo = 'articolo modificato' WHERE id_test = 3");
			myStat.execute("UPDATE test SET testo = 'testo modificato' WHERE titolo = 'articolo modificato' ");
			
			//myStat.execute("DELETE FROM test WHERE id_test = 6");
			
			//leggo la tabella test
			ResultSet leggoTabella = myStat.executeQuery("SELECT * FROM test");
			while(leggoTabella.next()) {
				System.out.println("Titolo articolo: " + leggoTabella.getString("titolo") + " "
						+ "Contenuto: " +  leggoTabella.getString("testo"));	
			}
			
			myStat.close();
			connessione.close();
			
		
			
			
		}catch(SQLException e) {
			System.out.println("Ops...qualcosa è andato storto" + " " + e.getMessage());
		}

	}

}
