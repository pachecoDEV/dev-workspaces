package br.com.udemy.classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dtDia, int dtMes, int dtAno){
		dia = dtDia;
		mes = dtMes;
		ano = dtAno;
	}
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
