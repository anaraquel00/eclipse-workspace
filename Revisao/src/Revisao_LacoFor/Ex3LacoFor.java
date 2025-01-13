package Revisao_LacoFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex3LacoFor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i = 1; // representa o número de alunos
		double nota1, nota2, media;

		do {
			System.out.println("Aluno: " + i);
			System.out.print("Nota 1: ");
			nota1 = Double.parseDouble(sc.nextLine());
			// valida o intervalo da nota
			while (nota1 < 0 || nota1 > 10) {
				/*
				 * Enquanto vc digitar o que esta dentro do intervalo" while(nota1 < 0 || nota1
				 * > 10)", ele irar imprimir: "Nota deve ser entre 0 e 10. Nota 1: "
				 */
				System.out.print("Nota deve ser entre 0 e 10. Nota 1: ");
				nota1 = Double.parseDouble(sc.nextLine());
			}

			System.out.println("Nota 2:");
			nota2 = Double.parseDouble(sc.nextLine());
			// valida o intervalo da nota
			while (nota2 < 0 || nota2 > 10) {
				/*
				 * Enquanto vc digitar o que esta dentro do intervalo:
				 * "while(nota2 < 0 || nota2 > 10)", ele irar imprimir:
				 * "Nota deve ser entre 0 e 10. Nota 2:"
				 */
				System.out.println("Nota deve ser entre 0 e 10. Nota 2:");
				nota2 = Double.parseDouble(sc.nextLine());
			}

			// calcular a média
			media = (nota1 + nota2) / 2;
			System.out.println("Média: " + media);
			System.out.println("");
			// incremento de i
			i++;
		} while (i <= 3);

		System.out.println("Fim do Programa");

	}

}
