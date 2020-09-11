package br.com.marcelosouza.exercicio4;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe um número para a música do elefante:\n");
		n = ler.nextInt();
		
		if (n == 1) {
			System.out.println("Um elefante incomoda muita gente.");
		} else {
			repete(n);
		}
		
	}
	
	public static void repete(int n) {
		String mensagem = "incomoda, ";
		String texto = "";
		
		for (int i = 0; i < n; i++) {
			texto += mensagem;
		}
		
		System.out.println(n + " elefantes " + texto + "muito mais");
		
	}

}