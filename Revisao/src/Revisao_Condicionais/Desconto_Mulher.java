package Revisao_Condicionais;

import java.util.Scanner;


public class Desconto_Mulher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		String genero = "";
        double valorCompra;
        int desconto;
        double valorDesconto = 0;
        System.out.println("Digite seu nome: ");
     	nome = scanner.nextLine();     
        System.out.println("Digite seu gênero (M/F): ");
        genero = scanner.nextLine();
        System.out.println("Valor total das compras: ");
        valorCompra = scanner.nextDouble();
        System.out.printf("Olá, %s! ",nome);
        if (genero.equalsIgnoreCase("m")) {
        desconto = 5;
        valorDesconto = (valorCompra * desconto)/100;
        valorCompra -= valorDesconto;
        System.out.printf("O valor da compra teve um desconto de R$ %.2f%n e fica no total de R$ %.2f%n",valorDesconto, valorCompra);
        }
        if (genero.equalsIgnoreCase("f")) {
        desconto = 13;	
        valorDesconto = (valorCompra * desconto)/100;
        valorCompra -= valorDesconto;
        System.out.printf("O valor da compra teve um desconto de R$ %.2f%n e fica no total de R$ %.2f%n",valorDesconto, valorCompra);
        }
        }
         
        }
        
        
        
		
		

		

