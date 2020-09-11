package br.com.marcelosouza.exercicio1;

public class Quadrado implements AreaCalculavel {

	private double lado, area;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		return area;
	}

	@Override
	public void calculaArea() {
		area = getLado() * getLado();
		System.out.println("O valor da área do quadrado é: " + area + "\n");
	}
	
}