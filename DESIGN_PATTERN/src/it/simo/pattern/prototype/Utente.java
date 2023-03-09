package it.simo.pattern.prototype;

public abstract class Utente implements Cloneable {
	
	   protected String codice;
	   private String id;
	   
	   public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	abstract void creaUtente();
	   
	   
	public Object clone() {
		
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}

}
