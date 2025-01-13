package Revisao_Condicionais;

import java.util.Scanner;

public class MédiaEscolar {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("Digite a primeira nota:");
	double nota = scanner.nextDouble();	
	System.out.println("Digite a segunda nota");
	double nota1 = scanner.nextDouble();
	
	double media = (nota + nota1)/ 2;
	System.out.println("Média das notas: "+ media );
	if (media >= 7) {
		System.out.println("Aluno aprovado");
		
	}
	else { System.out.println("Aluno reprovado");
	}
    
  }
}