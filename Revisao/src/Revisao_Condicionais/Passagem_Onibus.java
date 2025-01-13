package Revisao_Condicionais;

import java.util.Scanner;

public class Passagem_Onibus {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int kmDesejado =0;
double valor =0;
System.out.println("Distância à pecorrer (em Km): ");
kmDesejado = scanner.nextInt();


if (kmDesejado < 200) { 
	valor = kmDesejado * 0.5; }
	else if (kmDesejado >=200) {
	valor = kmDesejado * 0.45;}

  
System.out.printf("A passagem ficou com o valor de R$ %.2f%n",valor);	
}


	}


