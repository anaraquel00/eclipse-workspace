import java.util.Scanner;
public class SalarioReceber {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 // Entrada de dados
	System.out.println("Digite o número de horas trabalhadas: ");
	Double horasTrabalhadas = scanner.nextDouble();
	System.out.println("Digite o valor do salário mínimo: ");
	Double salarioMinino = scanner.nextDouble();
	
	// Cálculo do valor da hora trabalhada (um décimo do salário mínimo)
	Double valorHoraTrabalhada = salarioMinino / 10;
	
	// Cálculo do salário bruto
	Double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
	
	// Cálculo do imposto (3% do salário bruto)
	Double imposto = salarioBruto * 0.03;
	
	 // Cálculo do salário a receber
	Double salarioReceber = salarioBruto - imposto;
	
	 // Exibição dos resultados
	System.out.printf("Valor da hora trabalhada: R$ %.2f%n",valorHoraTrabalhada);
	System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
	System.out.printf("Imposto: R$ %.2f%n", imposto);
	System.out.printf("Salário a Receber: R$ %.2f%n",salarioReceber);
	scanner.close();
	


			
	
	
			
				
	}

}
