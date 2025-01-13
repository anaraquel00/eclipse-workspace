import java.util.Scanner;

public class CalculosNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Digite um número inteiro positivo: ");
        n = scanner.nextInt();
        // Variáveis para armazenar o somatório, soma dos quadrados e média
        int somatorio = 0;
        int somaQuadrados = 0;
        // Loop para calcular o somatório e a soma dos quadrados dos primeiros n números
        
		for (int i = 1; i <= n; i++) {
        somatorio += i;    // Somatório de n primeiros números
        somaQuadrados += i * i;   // Soma dos quadrados de n primeiros números
        }
		 // Cálculo da média
		double media = (double) somatorio / n;
		
		 // Exibindo os resultados
		
		System.out.println("Somatório dos primeiros " + n + " números: " + somatorio);
		System.out.println("Soma dos quadrados dos primeiros " + n + " números: " + somaQuadrados);
		System.out.println("Média dos primeiros " + n +" números: " + media);
		scanner.close();
		
		
        
	}

}
