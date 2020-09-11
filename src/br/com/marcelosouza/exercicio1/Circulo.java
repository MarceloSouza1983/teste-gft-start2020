package br.com.marcelosouza.exercicio1;

public class Circulo implements AreaCalculavel {

	private double raio, area;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return area;
	}
	
	@Override
	public void calculaArea() {
		area = getRaio() * getRaio() * Math.PI;
		System.out.println("O valor da área do cículo é: " + area + "\n");
	}
	
}