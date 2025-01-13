package Revisao;

import java.lang.constant.Constable;
import java.util.Locale;
import java.util.Scanner;

public class ExCircunferencia {

	private static final int math = 0;

	public static void main(String[] args) {
		
		//Obj Scanner - ler a entrada de dados
				Scanner scan = new Scanner(System.in);
				scan.useLocale(Locale.US);
				
				/*
				//Constante PI
				// final double PI = 3.14159;
				
				double area, comprimento, raio;
				
				System.out.print("Valor do raio? ");
				raio = scan.nextDouble();
				area = Math.PI * Math.pow(raio, 2) ;
				comprimento = 2 * Math.PI * raio;
				
				//saída
				System.out.println("Área = " + area);
				System.out.println("Comprimento = " + comprimento);
				*/
    
	double volume,raio;
	
	System.out.print("Qual é o valor do raio? ");
	raio = scan.nextDouble();
	
	volume = 4.0/3.0 * Math.PI * Math.pow(raio, 3); //Tem que converter em double
	System.out.print("O volume da esfera é: "+ volume);
		
	}

}
