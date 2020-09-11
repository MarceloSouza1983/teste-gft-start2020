package br.com.marcelosouza.exercicio2;

public abstract class Pessoa {

	private String nome, rg;
	
	public Pessoa(String nome, String rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
    
	
}