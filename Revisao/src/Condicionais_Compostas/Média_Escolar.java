package Condicionais_Compostas;

import java.util.Scanner;

public class Média_Escolar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		double nota = scanner.nextDouble();	
		System.out.println("Digite a segunda nota");
		double nota1 = scanner.nextDouble();
		
		double media = (nota + nota1)/ 2;
		System.out.println("Média das notas: "+ media );
        if (media >= 7.0) {
        	System.out.println("Aluno Aprovado!");
        }
        if (media < 7.0 && media >= 5.0) {
        	System.out.println("Aluno em recuperaçao");
        }
        else if (media < 5.0) {
        	System.out.println("Aluno Reprovado");
        }
	}

}
