import java.util.Scanner; 

public class DescontoProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Entrada do preço do produto 
		
		System.out.println("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();
        
        // Calculo do desconto
        double desconto = preco * 0.10;
        Double novoPreco = preco - desconto;
        
        // Exibiçao do novo preço 
        System.out.printf("O novo preço com desconto de 10%% é: R$ %.2f%n", novoPreco);
        
        scanner.close();
        
		
	}

}
