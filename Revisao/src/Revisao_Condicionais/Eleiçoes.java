package Revisao_Condicionais;

import java.util.Scanner;

public class Eleiçoes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int anoAtual = 2024;
		int anoNascimento = 0;
		System.out.println("Informe o ano de nascimento: ");
		int anoNascimento1 = scanner.nextInt();
		if (anoAtual - anoNascimento1 >=16) {
			System.out.println("Apto à votar");}
			else { 
				System.out.println("Inapto à votar");}
	}
}
			
		
		
		
	       
	


			
			
			
		
	

