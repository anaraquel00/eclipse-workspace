import java.util.Scanner;
public class Calculo_do_Salario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Salário base do funcionário: R$ ");
double salarioBase = scanner.nextDouble();
        System.out.println("Número de horas trabalhadas (em horas): ");
double horasTrabalhadas = scanner.nextDouble();
        System.out.println("Valor da hora trabalhada: ");
double valorHoraTrabalhada = scanner.nextDouble(); 
double salarioBruto = salarioBase + horasTrabalhadas * valorHoraTrabalhada;
        System.out.printf("O salário do funcionário a receber é: R$ %.2f%n ", salarioBruto);
        scanner.close();
	}

}
