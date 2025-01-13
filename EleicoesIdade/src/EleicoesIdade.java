import java.util.Scanner;
public class EleicoesIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade = scanner.nextInt();
		if (idade > 18 && idade < 70) {
			System.out.println("Voto obrigatório!!!");}
		if (idade < 16) {	
			System.out.println("Não habilitado à votar!!");}
		if ((idade >= 16 && idade < 18)|| idade > 70) {
			System.out.println("Voto facultativo!! :D");}
		
		scanner.close();
		}
			

	}


