import java.util.Scanner;
public class CarroVeloz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a distância pecorrida pelo seu carro (em km): ");
		double distancia = scanner.nextDouble();
		System.out.println("Digite o tempo gasto do seu carro (em horas): ");
		double tempo = scanner.nextDouble();
		double velocidadeMedia = distancia / tempo;
		System.out.printf("A velocidade do carro é: %.2f km/h%n ", velocidadeMedia);
		scanner.close();
		
		
	}

}
