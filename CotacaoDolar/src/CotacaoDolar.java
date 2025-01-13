import java.util.Scanner;
public class CotacaoDolar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor em dólares (em US$):");
		double valorDolar = scanner.nextDouble();
		double valorReais = valorDolar * 5;
		System.out.printf("O valor em reais é: R$ %.2f%n", valorReais);
		scanner.close();
		

	}

}
