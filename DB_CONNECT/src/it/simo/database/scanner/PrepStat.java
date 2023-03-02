package it.simo.database.scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PrepStat{
    public static void main(String[] args){
        Scanner insert =new Scanner(System.in);
         try {
             System.out.println("Inserisci titolo:");
             String titolo = insert.nextLine();
             System.out.println("Inserisci testo:");
             String testo = insert.nextLine();
      
           
             Connection connessione = DriverManager.getConnection("jdbc:mysql://localhost:3306/TUO-DB", "TUO-USER", "TUA-PASSWORD");
             Statement  myStat = connessione.createStatement();
             myStat.execute("CREATE TABLE IF NOT EXISTS demo (id_test INT NOT NULL AUTO_INCREMENT, titolo VARCHAR(100), testo VARCHAR(200), PRIMARY KEY(id_test))");
  
   
             PreparedStatement pst = connessione.prepareStatement("insert into demo(titolo,testo) values(?,?)");
 
             pst.setString(1,titolo);
             pst.setString(2, testo);
      
             int i = pst.executeUpdate();
      
             if(i!=0){
            	 System.out.println("record aggiunto");
             }
             else{
            	 System.out.println("problema con l'inserimento");
             }
             ResultSet leggoTabella = pst.executeQuery("SELECT * FROM demo");
             while(leggoTabella.next()) {
            	 System.out.println("Titolo articolo: " + leggoTabella.getString("titolo") + " "
					+ "Contenuto: " +  leggoTabella.getString("testo"));	
             }
		
             pst.close();
             connessione.close();
      
         }
         catch (Exception e){
        	 System.out.println(e);
    }
  }
}
