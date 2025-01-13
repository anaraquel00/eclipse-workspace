package Revisao;

import java.util.Scanner;

public class Ex_2_numeros_int {

	public static void main(String[] args) {
		//declaracao de variaveis
		
		Scanner scan = new Scanner(System.in);
		//ler 2 inteiros
		//somar 
		//apresentar a soma
		/*int a;
		int b;
		System.out.println("Digite o primeiro numero: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = scan.nextInt();
		int soma = a + b;
		System.out.print("Resultado da soma: " + soma);*/
	
	   
		int num1,num2, soma;
	    //ler 2 iteiros
	    System.out.print("Digite o primeiro numero: ");
	    num1 = scan.nextInt(); //o que o scan vai ler
	    System.out.print("Digite o segundo numero: ");
	    num2 = scan.nextInt(); //o que o scan vai ler
	    
	    //somar
	   //soma = num1 + num2;   
	    
	    //apresentar a saida
	    System.out.println("Soma = " + num1 + num2); //num1num2 ex: 62
	    System.out.println("Soma = "+ (num1 + num2));//num1 + num2 = ex: 6+2=8 precisa de colocar o "()".
		
	}

}
