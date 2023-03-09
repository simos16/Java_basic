package it.simo.pattern.dao;

public class Studenti {
	
		private String nome;
	   private int matricola;

	   Studenti(String nome, int matricola){
	      this.nome = nome;
	      this.matricola = matricola;
	   }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

}
