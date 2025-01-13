import java.util.Scanner;
public class CalculoMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		double media = (nota1 + nota2 + nota3)/ 3;
		if (media >= 7) {
			System.out.printf("Aluno aprovado");}
			if (media <= 7 && media >= 4) {
			System.out.printf("Aluno em recuperaçao");}
			if (media < 4) { System.out.printf("Reprovado");}
			scanner.close();
		
			}
		}
		

	


