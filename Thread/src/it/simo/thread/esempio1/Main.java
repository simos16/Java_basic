package it.simo.thread.esempio1;

public class Main {

	
		public static void main(String[] args) {
			//uso con la classe estesa Thread - singolo processo
			/*Processo1 thread1 = new Processo1();
			thread1.setName("Th1");
			System.out.println("Il thread corrente è attivo? " + Thread.currentThread().isAlive());
			//metodo che invocherà il metodo run() quando il thread sarà in esecuzione
			thread1.start();
			System.out.println("Il thread corrente è attivo? " + Thread.currentThread().isAlive());
			System.out.println("Il thread corrente è attivo?" + thread1.isAlive());*/
			
	//uso con interfaccia Runnable - singolo processo
			ProcessoRun thread2 = new ProcessoRun();
			Thread th1 = new Thread(thread2);
			th1.setName("processo 2");
			th1.start();
			
			//Start di più processi => multithreading
			
			/*
			 * Multi thread1 = new Multi(); Multi thread2 = new Multi();
			 * 
			 * thread1.setName("Primo"); thread2.setName("Secondo");
			 * 
			 * thread1.start(); thread2.start();
			 * 
			 * System.out.println("Numeri di thread attivi: " + Thread.activeCount());
			 */
			
			
			
			
			
			
		}


	}

