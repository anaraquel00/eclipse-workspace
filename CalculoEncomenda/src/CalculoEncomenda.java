import java.util.Scanner;
public class CalculoEncomenda {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Peso da mercadoria (em Kg): ");
double pesoMercadoria = scanner.nextDouble();
double valorFrete = pesoMercadoria * 5.0;
System.out.printf("Valor do frete: R$ %.2f%n",valorFrete);
scanner.close();


	}

}
