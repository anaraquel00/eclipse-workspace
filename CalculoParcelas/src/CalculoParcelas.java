import java.util.Scanner;
public class CalculoParcelas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor à vista: R$ ");
double valorAVista = scanner.nextDouble();
        System.out.println("Número de parcelas: ");
int numeroParcelas = scanner.nextInt();  
double taxaDeJuros = 0.02;
double totalComJuros = valorAVista + (valorAVista * taxaDeJuros *numeroParcelas);
double valorParcela = totalComJuros / numeroParcelas;
System.out.printf("Valor total com juros: R$ %.2f%n",totalComJuros);
System.out.printf("Valor de cada parcela: R$ %.2f%n",valorParcela);
scanner.close();
	}

}
