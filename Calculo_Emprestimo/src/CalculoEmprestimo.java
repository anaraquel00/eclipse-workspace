import java.util.Scanner;
public class CalculoEmprestimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor do empréstimo (em reais): ");
		double valorEmprestimo = scanner.nextDouble();
		System.out.println("Taxa de juros mensal (em %): ");
		double taxaJuros = scanner.nextDouble();
		System.out.println("Número de meses: ");
		int numeroMeses = scanner.nextInt();
		double taxaJurosDecimal = taxaJuros / 100;
		double parcelaMensal = calcularParcela(valorEmprestimo, taxaJurosDecimal, numeroMeses);
		System.out.printf("O valor da parcela mensal é: %.2f%n", parcelaMensal);
        scanner.close();
	}

	private static double calcularParcela(double valorEmprestimo, double taxaJuros, int numeroMeses) {
		if (taxaJuros == 0) {
		return valorEmprestimo / numeroMeses;
				// Caso a taxa de juros seja 0, a parcela é o valor total dividido pelo número de meses
		}
		return (valorEmprestimo * taxaJuros) / (1 - Math.pow(1 + taxaJuros, -numeroMeses));
	}

		
		
	}


