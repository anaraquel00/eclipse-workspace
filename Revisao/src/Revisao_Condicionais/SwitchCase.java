package Revisao_Condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor correspondente");
		System.out.println("Ao dia da semana (1 a 7):");
		int valor = scan.nextInt();

		/*if (valor == 1) {
			System.out.println("Domingo");
		}
		if (valor == 2) {
			System.out.println("Segunda-Feira");
		}
		if (valor == 3) {
			System.out.println("Terça-Feira");
	}
		if (valor == 4) {
			System.out.println("Quarta-feira");
}
		if (valor == 5) {
			System.out.println("Quinta-Feira");
		}
		if (valor == 6) {
			System.out.println("Sexta-Feira");
		}
		if (valor == 7) {
			System.out.println("Sabado");
		}
		if (valor > 7) {
		System.out.println("Informaçao Invalida");} */
		
		/*switch(valor) {
		/*case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda");
		case 3 -> System.out.println("Terça");
		case 4 -> System.out.println("Quarta");
		case 5 -> System.out.println("Quinta");
		case 6 -> System.out.println("Sexta");
		case 7 -> System.out.println("Sabado");
		default-> System.out.println("Dia invalido");*/
		/*
		switch(valor) {
		case 2,3,4,5,6 -> System.out.println("Dia util");
		case 1,7 -> System.out.println("Fim de semana");
		default -> System.out.println("Dia invalido");
		} */
		System.out.println("Digite um valor");
		valor = scan.nextInt();
	}
	
}
		
			