package Revisao2;

import java.util.Locale;
import java.util.Scanner;

public class Ex_Cond_Aninhada {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Locale.setDefault(Locale.US);
		//Exercicio para calcular a média escolar de um aluno. 
        //Apresentar as variaveis
 Double nota1,nota2,media;
       //Digitar as entradas das notas:
 System.out.println("Digite a primeira nota: ");
 nota1 = Double.parseDouble(scan.nextLine());
 System.out.println("Digite a segunda nota: ");
 nota2 = Double.parseDouble(scan.nextLine());
 media = (nota1 + nota2)/2;
 
 //Aplicar as condicionais de aprovacao:
 if (media >= 9) {
 System.out.println(String.format("Média: %.2f\nCONCEITO: A\nAprovado com louvor!!", media));}
 else if (media >= 8) {
 System.out.println(String.format("Média: %.2f\nCONCEITO: B\nAprovado! Parabéns!! ", media));}
   else if (media >= 7) {
	System.out.println(String.format("Média: %.2f\nCONCEITO: C\nAprovado", media)); }
   else if (media >=6) {
	   System.out.println(String.format("Média: %.2f\nCONCEITO: D\nAluno em recuperaçao!", media));}
   else { 
	   System.out.println(String.format("Média: %.2f\nCONCEITO: E\nReprovado!! Estude mais e boa sorte.", media));
   }
	scan.close();   
 }
	 
 
		
	

}
