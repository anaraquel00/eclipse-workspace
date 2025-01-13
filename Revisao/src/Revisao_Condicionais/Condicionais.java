package Revisao_Condicionais;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//Ctrl+shitf+o = automatiza o "import java.util.Scanner";
		/*System.out.println("Digite o nome do funcionario: ");
		String nome = scan.nextLine(); //capturar uma string
		System.out.println("Informe o valor da hora trabalhada: ");
	    double valorHora = scan.nextDouble(); //capturar um double
	    scan.nextLine(); //limpar o buffer
	    System.out.println("Informe o total de horas trabalhadas: ");
	    int horasTrabalhadas = scan.nextInt(); //capturar um int
	    scan.nextLine(); //limpar o buffer
	    double salario = valorHora * horasTrabalhadas;
	    double imposto = 0;
	    if(salario >= 3000) { //bloco de codigos
	    	imposto = salario * 0.1;
	    	salario = salario - imposto;
	    		    }
	    else if(salario >= 2000) {
	    	imposto = salario * 0.05;
	    	salario = salario - imposto;
	    }
	    else { 
	    	System.out.println("Isento de imposto");
	    }
	    /*
		-se o trabalhador receber mais de 3000,
		devera pagar 10% de imposto; ----> salario >= 3000
	    -se o trabalhador receber mais de 2000,
	    devera pagar 5% de imposto; -----> salario >= 2000
	    -se nao, sera isento de imposto.
	    ** operadores relacionais: " >, <, >=, <=, ==, != " **
	    
	    */
		/*
	    System.out.printf("Nome: %s %n",nome);
	    System.out.printf("Salario: R$ %.2f %n",salario);
	    System.out.printf("Valor dos impostos: R$ %.2f",imposto); 
	    */
	   
		double salario = 1999;
	    String isento = salario < 2000 ? "isento" : "tributado";
	    System.out.println(isento);
			   
	    
		
	    
	    
	}
	

}
