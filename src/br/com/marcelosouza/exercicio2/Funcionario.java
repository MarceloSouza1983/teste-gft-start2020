package br.com.marcelosouza.exercicio2;

public class Funcionario extends Pessoa {
	
	private double salario_inicial, percentual, salario_total;
	
	public Funcionario(String nome, String rg, double salario_inicial, double percentual, double salario_total) {
		super(nome, rg);
		this.salario_inicial = salario_inicial;
		this.percentual = percentual;
		this.salario_total = salario_total;
	}

	public double getSalario_inicial() {
		return salario_inicial;
	}

	public void setSalario_inicial(double salario_inicial) {
		this.salario_inicial = salario_inicial;
	}

	public double getPercentual() {
		return percentual;
	}

	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}

	public double getSalario_total() {
		return salario_total;
	}

	public void setSalario_total(double salario_total) {
		this.salario_total = salario_total;
	}
	
	

}