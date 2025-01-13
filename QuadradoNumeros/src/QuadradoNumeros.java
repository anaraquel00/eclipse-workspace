import java.util.Scanner;
public class QuadradoNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;
System.out.println("Digite números para ver seus quadrados. Para encerrar, digite um número negativo.");
while (true) {
	System.out.println("Digite um número: ");
	numero = scanner.nextInt();
	 // Verifica se o número é negativo para encerrar o loop
	if (numero < 0) {
		System.out.println("Número negativo digitado. Programa encerrado.");
		break;
	}
	// Calcula e exibe o quadrado do número
	int quadrado = numero * numero;
	System.out.println("O quadrado de " + numero + " é: " + quadrado);
}
scanner.close();
	}

	}


