import java.util.Scanner;
public class VerificaTriangulo {

	public static void main(String[] args) {
	Double A , B , C;
Scanner scanner = new Scanner(System.in);
//Escrevendo os valores de A, B e C.
System.out.println("Digite o valor de A: ");
A = scanner.nextDouble();
System.out.println("Digite o valor de B: ");
B = scanner.nextDouble();
System.out.println("Digite o valor de C: ");
C = scanner.nextDouble();
//Verifica se os lados podem formar um triângulo 
if (A + B > C && A + C > B && B + C > A) {
	System.out.println("Os lados formam um triângulo");
} else { System.out.println("Os lados não formam um triângulo");
	}
scanner.close();
	}
}
