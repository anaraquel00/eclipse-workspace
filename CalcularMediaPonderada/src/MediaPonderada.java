import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		//Entrada de dados
		System.out.println("Digite a primeira nota: ");
        Double nota1 = scanner.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        Double peso1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        Double nota2 = scanner.nextDouble();
        System.out.println("Digite o peso da segunda nota: ");
        Double peso2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        Double nota3 = scanner.nextDouble();
        System.out.println("Digite o peso da terceira nota: ");
        Double peso3 = scanner.nextDouble();
        
        //Cálculo da média ponderada
        
        Double somaPeso = peso1 + peso2 + peso3;
        Double mediaPonderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 /somaPeso;
        
     // Saída do resultado
        System.out.printf("A média ponderada é: %.2f", mediaPonderada);
        scanner.close();
        
	}

}
