import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
   // Entrada de dados
  System.out.println("Digite a temperatura em Celsius: ");
  Double celsius = scanner.nextDouble();
  
  // Cálculo da temperatura em Fahrenheit
  Double fahrenheit = (9 * celsius / 5) + 32;
  
  // Exibição do resultado
  System.out.printf("A temperatura em Fahrenheit é: %.2f°F%n",fahrenheit);
  scanner.close();
	}

}
