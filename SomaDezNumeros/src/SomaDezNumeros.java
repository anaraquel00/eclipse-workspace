import java.util.Scanner;
public class SomaDezNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		
		System.out.println("Esse programa calcula a soma de dez números fornecidos por você.");
		  
		// Loop para ler e somar os 10 números
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o número" + i + " :");
			int numero = scanner.nextInt();
			soma += numero;
		}
           System.out.println("A soma dos dez números é: " + soma);
           scanner.close();
	}

}
