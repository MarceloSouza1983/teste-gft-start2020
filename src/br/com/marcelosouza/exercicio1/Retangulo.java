package br.com.marcelosouza.exercicio1;

public class Retangulo implements AreaCalculavel {
	
private double largura, altura, area;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getArea() {
		return area;
	}

	@Override
	public void calculaArea() {
		area = getLargura() * getAltura();
		System.out.println("O valor da �rea do ret�ngulo �: " + area + "\n");
	}
		
}