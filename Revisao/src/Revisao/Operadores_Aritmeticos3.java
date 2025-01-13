package Revisao;

import java.util.Locale;
import java.util.Scanner;

/**
 *   @author Ana Raquel
 *   Programa que mostra como se usa os operadores aritmeticos no Java:
 *  " + , - , * , / "
 * 
 */

public class Operadores_Aritmeticos3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	scan.useLocale(Locale.US);
		/*
		int x = 5;
		int y = 3;
		
		int resultado1 = x / y;
		System.out.println("Resultado1: " + resultado1);
		int resto = x % y;
		
		System.out.println("Resto: " + resto);
		float resultado2 = x / y;
		System.out.println("Resultado2: " + resultado2);
		
		double resultado3 = (double)x / (double)y; //converte int em double
		System.out.println("Resultado3: " + resultado3);
                                                          */
		//Exercicios:
		
		/*
		int a = -78;  //colocar os numeros que deseja fazer os calculos!!
		int b = 10;   //em a e b.
		int soma = a + b;
		int subt = a - b;
		int mult = a * b;
		int div = a / b;
		System.out.print("O resultado dos 4 operadores aritméticos sao: "
		+ " " + soma + " , "
		+ subt + " , " + mult + " e " + div + "." );
		*/
		
		//utilizar os separadores "+" pra separar todos os parametros de 
		//respostas no console.
	
	//Pratica:
	//1° Passo: Digitar as entradas dos valores numericos. 
    double num1;
	double num2;
	double soma, subtracao, multiplicacao, divisao;
	
	//2° Passo: Digitar o print para perguntar os numeros desejados.
	System.out.print("Digite o primeiro numero: ");
	num1  = scan.nextDouble();
	System.out.print("Digite o segundo numero: ");
	num2 = scan.nextDouble();
	//3° Passo: Processamento
	soma = num1 + num2;
	subtracao = num1 - num2;
	multiplicacao = num1 * num2;
	divisao = num1 / num2;
	
	//4° Passo: Saida de dados. 
	System.out.println("Soma: " + soma);
	System.out.println("Subtracao: " + subtracao);
	System.out.println("Multiplicacao: " + multiplicacao);
	System.out.println("Divisao: " + divisao);
	
	
	
	
	
	
	
	
	}

}
