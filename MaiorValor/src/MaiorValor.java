import java.util.Scanner;
public class MaiorValor {

	public static void main(String[] args) {
int num1, num2, num3;
Scanner scanner = new Scanner(System.in);
System.out.println("Digite o primeiro número: ");
num1 = scanner.nextInt();
System.out.println("Digite o segundo número: ");
num2 = scanner.nextInt();
System.out.println("Digite o terceiro número: ");
num3 = scanner.nextInt();

// Inicializamos a variável maior com o primeiro valor e a atualizamos conforme necessário

int maior = num1;
if (num2 > maior) {
	maior = num2;}
if (num3 > maior) {
	maior = num3;}
System.out.println("O maior valor informado é: " + maior);
scanner.close();
	}
	

	}


