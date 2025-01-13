import java.util.Scanner;
public class DiferencaEntreValores {

	public static void main(String[] args) {
		//Colocar os valores numéricos 
int valor1 , valor2 , diferenca;
Scanner scanner = new Scanner(System.in);
System.out.println("Digite o primeiro valor inteiro: ");
valor1 = scanner.nextInt();
System.out.println("Digite o segundo valor inteiro: ");
valor2 = scanner.nextInt();
if (valor1 == valor2) {
	diferenca = 0;
	
} else { 
	diferenca = Math.abs(valor1- valor2);
}
	System.out.println("A diferença entre o maior e o menor valor é: " + diferenca);
	scanner.close();
	}

}
