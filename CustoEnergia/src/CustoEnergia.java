import java.util.Scanner;
public class CustoEnergia {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
	// Entrada de dados
	System.out.println("Digite o valor do salário mínimo: ");
	Double salarioMinimo = scanner.nextDouble();
	System.out.println("Digite a quantidade de quilowatts consumida: ");
    Double quilowattsConsumidos = scanner.nextDouble();
    
    // Cálculo do valor de cada quilowatt (um quinto do salário mínimo)
    Double valorQuilowatt = salarioMinimo / 5;
    
 // Cálculo do valor a ser pago pela residência
    Double valorTotal = quilowattsConsumidos * valorQuilowatt;
    
 // Cálculo do valor com desconto de 15%
    Double valorComDesconto = valorTotal * 0.85;
    
 // Exibição dos resultados    
    System.out.printf("Valor de cada quilowatt: R$ %.2f%n", valorQuilowatt);
    System.out.printf("Valor a ser pago pela residência: R$ %.2f%n",valorTotal);
    System.out.printf("Valor a ser pago com desconto de 15%%: R$ %.2f%n",valorComDesconto);
    scanner.close();
    
    
	}

}
