package Revisao_Condicionais;

import java.util.Scanner;

public class Estruturas_condicionais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
/*
		System.out.println("Velocidade do carro (em Km/h): ");
double velocidade = scanner.nextDouble();
double multa = velocidade * 5;

if (velocidade > 80) {
	System.out.printf("Carro multado em R$ " + multa);}
	else { 
		System.out.printf("Carro regular");}
	scanner.close();	*/
int velocidade;
double valorMulta =0;
int calculoMulta =0;
int n=80;
System.out.println("Qual a velocidade do carro?");
velocidade = scanner.nextInt();
if (velocidade > n) {
	System.out.println("Motorista multado ");
calculoMulta = (velocidade -80) * 5;
System.out.println("O valor da multa é de R$" + calculoMulta);
}
else { 
	System.out.println("Velocidade Permitida. Siga respeitando as leis de trânsito");
}

}
	}


