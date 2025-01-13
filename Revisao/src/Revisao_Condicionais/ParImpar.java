package Revisao_Condicionais;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int numero = scanner.nextInt();
		if (numero %2 == 0) {
			System.out.printf("O número %d é par",numero);}
		else { System.out.printf("O número %d é impar",numero);
		}
		
		

	}

}
