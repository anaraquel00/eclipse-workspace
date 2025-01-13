import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
	double salario, salarioReajustado;	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o salário do funcionário: ");
	salario = scanner.nextDouble();
	// Condição para verificar se o salário é inferior a 5000 e aplicar o aumento de 30%
	if (salario < 5000) { 
	salarioReajustado = salario *1.3;  // 30% de aumento 
	System.out.printf("Salário reajustado: R$ %.2f\n", salarioReajustado);
		} else {
			System.out.printf("O salario permanece o mesmo: R$ %.2f\n",salario);
		}
	scanner.close();

	}

}
