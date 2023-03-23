package it.simo.transact.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;



public class EsempioTransact {
	
	private static final String SQL_INSERT = "INSERT INTO studenti (nome, corso, CREATED_DATE) VALUES (?,?,?)";
	private static final String SQL_UPDATE = "UPDATE studenti SET corso = ? WHERE nome = ?";
	private static final String SQL_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS studenti "
            + "("
            + " id INT NOT NULL AUTO_INCREMENT,"
            + " nome varchar(100) NOT NULL,"
            + " corso varchar(50) NOT NULL,"
            + " CREATED_DATE timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP,"
            + " PRIMARY KEY (id)"
            + ")";
	
	
	@SuppressWarnings("unused")
    private static final String SQL_TABLE_DROP = "DROP TABLE studenti";
	
	public static void main(String[] args) {
		
		

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/importo", "root", "simodev20");
             Statement statement = conn.createStatement();
             //PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT);
             
        	PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE)) {

            //statement.execute(SQL_TABLE_DROP);
            statement.execute(SQL_TABLE_CREATE);

            // blocco di transazione
            conn.setAutoCommit(false); 

          
            /*psInsert.setString(1, "Dario");
            psInsert.setString(2, "Matematica");
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();

            psInsert.setString(1, "Alberto");
            psInsert.setString(2, "Fisica");
            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            psInsert.execute();*/

            

            
           
            psUpdate.setString(1, "Astronomia");
            psUpdate.setString(2, "Dario");
       
            psUpdate.execute();

            // Chiudere con commit
            conn.commit();

            // si può prevedere di riabilitare il commit
            conn.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
