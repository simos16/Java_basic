package it.simo.thread2.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[ ] args) {
		/* creo il thread pool */
		ExecutorService pool = Executors.newCachedThreadPool();

		/* aggiunge i thread al pool */
		pool.execute(new SitePage("http://www.google.it"));
		pool.execute(new SitePage("http://www.google.it"));
		pool.execute(new SitePage("http://www.google.it"));
		
		pool.shutdown();
		
	
		
		/*
		 * proviamo  ad aggiungere un nuovo thread dopo aver invocato il metodo shutdown 
		 * 
		 * 
		*/
		
	
	}
}
