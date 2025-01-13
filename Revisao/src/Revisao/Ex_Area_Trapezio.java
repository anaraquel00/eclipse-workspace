package Revisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex_Area_Trapezio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		Double area, baseMaior, baseMenor, altura;
        System.out.print("Qual o valor da base maior? ");
        baseMaior = scan.nextDouble();
        System.out.print("Qual o valor da base menor? ");
        baseMenor = scan.nextDouble();
        System.out.print("Qual o valor da altura? ");
        altura = scan.nextDouble();
        area = ((baseMaior + baseMenor) / 2)* altura;
        System.out.println("A area do trapézio é: "+ area);
	}

}
