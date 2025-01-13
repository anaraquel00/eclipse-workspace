import java.util.Scanner;
public class ConsumoAgua {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantidade do litros consumidos em um mês (em litros): ");
		double consumoLitro = scanner.nextDouble();
		double custoLitro = 0.02;
		double valorConta = consumoLitro * custoLitro;
		System.out.printf("Valor da conta de àgua (em reais): R$ %.2f%n", valorConta);
		scanner.close();
	}

}
