package br.com.fiapon.conceitos;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println(imc);
		
		if (imc <= 18.4) {
			System.out.println("Você está abaixo do seu peso ideal.");
		} else if (imc >= 18.5 && imc <= 25) {
			System.out.println("Você está com o seu peso ideal.");
		} else {
			System.out.println("Você está acima do seu peso ideal.");
		}
		
		sc.close();

	}

}
