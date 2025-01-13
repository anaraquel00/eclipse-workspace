package Revisao_Condicionais;

import java.util.Scanner;

public class Alistamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    System.out.println("Informe o ano de nascimento: ");
		int anoNascimento = scanner.nextInt();
	    int anoAtual = java.time.Year.now().getValue();
		int idadeAtual = anoAtual - anoNascimento;
		int anoAlistamento = anoNascimento +18;
		
	        if (idadeAtual == 18 ) {
	    	System.out.printf("Alistamento obrigatório esse ano");}
	        else if (idadeAtual > 18) {
	        int anosPassados = idadeAtual -18;	
	    		System.out.printf("Alistamento obrigatório! %nPassou de %d anos pra se alistar%n(ano de alistamento: %d).%n",anosPassados,anoAlistamento);}
	        else {
	        int anosRestantes = idadeAtual - 18; 
	        System.out.printf("Alistamento obrigatório! %nFaltam %d anos pra se alistar%n(ano de alistamento: %d).%n",anosRestantes,anoAlistamento);}
	}
	}	
	        

	        
	


	
	

	


