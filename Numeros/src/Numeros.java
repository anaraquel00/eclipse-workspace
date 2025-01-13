import java.util.Scanner;
public class Numeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int numero = scanner.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero1 = scanner.nextInt();
		if (numero > numero1) {
			System.out.println("O número " + numero + " é maior que o número " + numero1);
		}
		else {
			System.out.println("O número " + numero + " é menor que o número " + numero1);
		}
		scanner.close();
		}
			

	}


