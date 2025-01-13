import java.util.Scanner;

public class PrecoVeiculo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Entrada de dados
	System.out.println("Digite o preço de fábrica do veículo: R$ ");
	Double precoFabrica = scanner.nextDouble();
	
	System.out.println("Digite o percentual de lucro do distribuidor (%): ");
	Double percentualLucro = scanner.nextDouble();
	
	System.out.println("Digite o percentual de impostos (%): ");
	Double percentualImpostos = scanner.nextDouble();
	
	// Cálculo dos valores
	
	Double valorLucroDistribuidor = precoFabrica * (percentualLucro/100);
	Double valorImpostos = precoFabrica * (percentualImpostos/100);
	Double precoFinal = precoFabrica + valorLucroDistribuidor + valorImpostos;
	
	 // Exibição dos resultados
	System.out.printf("Valor do lucro do distribuidor: R$ %.2f%n", valorLucroDistribuidor);
	System.out.printf("Valor dos impostos: R$ %.2f%n", valorImpostos);
	System.out.printf("Preço final do veiculo: R$ %.2f%n", precoFinal);
	

    scanner.close();
	
    
	}

}
