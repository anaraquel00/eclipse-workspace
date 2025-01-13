package Revisao_LacoFor;

import java.util.Scanner;

public class Laco_For2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		System.out.print("Digite um valor para o somatório: ");
		
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i <= n; i++) {
			soma += i;
			//soma = soma + i
		}
		System.out.println("Soma = " + soma);

	}

}
