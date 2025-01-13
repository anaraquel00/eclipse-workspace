import java.util.Scanner;
public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Entrada de dados
		System.out.println("Digite a base do triângulo: ");
		Double base = scanner.nextDouble();
		
		System.out.println("Digite a altura do triângulo: ");
		Double altura = scanner.nextDouble();
		
		// Cálculo da área do triângulo
		Double area = (base * altura) / 2;
		
		 // Saída do resultado
		System.out.println("A área do triângulo é: " + area);
		scanner.close();
		
		
		
		

	}

}
