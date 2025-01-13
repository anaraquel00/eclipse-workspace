import java.util.Scanner;

public class CalculoSalarioFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Entrada do salário base do funcionário
System.out.println("Digite o salário base do funcionário: R$ ");
 double salarioBase = scanner.nextDouble();
 
        //Cálculo da gratificação de 5%
 double gratificacao = salarioBase * 0.05;
 
        //Cálculo do salário com gratificação
 double salarioComGratificacao = salarioBase + gratificacao;

        //Cálculo do imposto de 7% sobre o salário com gratificação
 double imposto = salarioComGratificacao * 0.07; 
 
        //Cálculo do salário final (salário a receber)
 double salarioAReceber = salarioComGratificacao - imposto;
 
        // Exibição do salário a receber
 System.out.printf("O salario a receber é: R$ %d%n", (int) salarioAReceber);
 
 scanner.close();
		
	}

}
