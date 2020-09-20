package br.com.udemy.classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto prod1 = new Produto("Notebook", 4356.89, 0.25);
		
		Produto prod2 = new Produto();
		prod2.nome = "Caneta Preta";
		prod2.preco = 12.56;
		prod2.desconto = 0.29;
		
		System.out.println(prod1.nome);
		System.out.println(prod2.nome);
		
		double precoFinal1 = prod1.precoComDeconto(0.05);
		double precoFinal2 = prod2.precoComDeconto(0.1);
		double precoFinal3 = prod2.precoComDeconto();
		
		double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3) / 3;
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		
		System.out.println();
	}

}
