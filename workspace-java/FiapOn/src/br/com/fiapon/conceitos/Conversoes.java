package br.com.fiapon.conceitos;

public class Conversoes {

	public static void main(String[] args) {
		
		int exemplo = 10;
		double d = exemplo;
		long l = exemplo;
		float f = exemplo;
		
		System.out.println(exemplo);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);
		
		// Conversão por meio de CAST
		
		double x = 10.5;
		int y = (int) x;
		
		System.out.println(x);
		System.out.println(y);
	}

}
