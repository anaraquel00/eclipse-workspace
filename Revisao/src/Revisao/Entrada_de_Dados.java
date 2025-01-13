package Revisao;

import java.util.Scanner;

public class Entrada_de_Dados {
public static void main(String[] args) {
	
	//declaração de variáveis do tipo String
			String nome;
			String sobrenome;
			//entrada de dados - Scanner
			//declaração do objeto
			Scanner teclado;
			//construir o objeto
			teclado = new Scanner(System.in);
			
			System.out.print("Digite seu nome: ");
			//recebe a entrada de dados
			nome = teclado.next(); //o .next so lê a primeira palavra!!!
			System.out.print("Digite seu sobrenome: ");
			sobrenome = teclado.next(); //o .nextLine lê até dar enter no teclado!!
			
			//saída
			System.out.println(nome + " " + sobrenome);
	
  }
}
