import java.util.Scanner; 
public class CalcularCompra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro produto: ");
        double valorProduto1 = scanner.nextDouble();
        
        System.out.println("Digite o valor do segundo produto:");
        double valorProduto2 = scanner.nextDouble();
        
        double valorTotal = valorProduto1 + valorProduto2;
        
        System.out.printf("O valor total dos produtos é: R$ %.2f.%n", valorTotal);
        scanner.close();
        
	}

}
