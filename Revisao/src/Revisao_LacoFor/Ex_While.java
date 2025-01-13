package Revisao_LacoFor;

import java.util.Locale;
import java.util.Scanner;

public class Ex_While {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner scan = new Scanner(System.in);
	        //laço while - loop
			//sintaxe
			//inicialização
	     	//critério de parada
	
	int soma = 0;
	System.out.println("Digite o primeiro número: ");	
	int num =Integer.parseInt(scan.nextLine());
	soma += num;
	
	while (num!=0) {
	System.out.println("Digite o próximo número: ");
	soma += num;
	num =Integer.parseInt(scan.nextLine());
	
	
	}
	System.out.println("O somatorio dos numeros aleatorios é: " + soma);
	}


	
}	


