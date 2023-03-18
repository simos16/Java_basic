package it.simo.thread.base;

public class EsempioRunnable  implements Runnable {
	
private String nameTh;

public EsempioRunnable(String nameTh) {
	this.nameTh = nameTh;
}
	


	@Override
	public void run() {
		System.out.println("sono un thread di runnable " + nameTh);
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println(i);
		}
		

	}

}
