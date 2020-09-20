package br.com.udemy.classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();
		
		Data data2 = new Data(16, 01, 1985);
		
		System.out.println(data1.obterDataFormatada());
		System.out.printf("\n");
		System.out.println(data2.obterDataFormatada());

	}

}
