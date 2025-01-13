package Revisao_Condicionais;

import java.util.Scanner;

public class Formar_Triângulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o comprimento a: ");
		double comprimento1 = scanner.nextDouble();
		System.out.println("Digite o compromento b: ");
		double comprimento2 = scanner.nextDouble();
		System.out.println("Digite o comprimento c: ");
		double comprimento3 = scanner.nextDouble();
		if (comprimento1 + comprimento2 > comprimento3 && comprimento2 + comprimento3 > comprimento1 && comprimento1 + comprimento3 > comprimento2) { 
			System.out.printf("Forma-se um triângulo %n");
		}
		if (comprimento1 == comprimento2 && comprimento2 == comprimento3) {
			System.out.printf("Forma-se um triângulo EQUILATERO");
			
		}
		else if (comprimento1 == comprimento2 || comprimento1 == comprimento3 || comprimento2 == comprimento3) {
			System.out.printf("Forma-se um triângulo ISOSCELES");
		}
		else if (comprimento1 != comprimento2 && comprimento1 != comprimento3 && comprimento2 != comprimento3) {
	    	System.out.printf("Forma-se um triângulo ESCALENO");
	    }
		else { System.out.printf("Nao forma um triângulo");
		}
	}
}
	

