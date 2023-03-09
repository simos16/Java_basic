package it.simo.pattern.prototype;

import java.util.HashMap;

public class ScriviUtenti {

	private static HashMap<String, Utente> utenteMap  = new HashMap<String, Utente>();

	   public static Utente getUtente(String objId) {
	      Utente objUtente = utenteMap.get(objId);
	      return (Utente) objUtente.clone();
	   }

	   
	   public static void caricaUtenti() {
	      Rappresentanti rap = new Rappresentanti();
	      rap.setId("1");
	      utenteMap.put(rap.getId(), rap);

	      Clienti cl = new Clienti();
	      cl.setId("2");
	      utenteMap.put(cl.getId(),cl);

	     
	   }
	
	
}
