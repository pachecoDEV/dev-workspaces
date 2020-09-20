package br.com.udemy.classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial,
			double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDeconto(){
		double precoDesconto = preco * (1 - desconto); 
		return precoDesconto;
	}
	
	double precoComDeconto(double descontoDoGerente){
		double precoDesconto = preco * (1 - desconto + 
				descontoDoGerente); 
		return precoDesconto;
	}
	
}
