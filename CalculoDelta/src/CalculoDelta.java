import java.util.Scanner;
public class CalculoDelta {

	public static void main(String[] args) {
	Double A,B,C, delta;	
Scanner scanner = new Scanner(System.in);
System.out.println("Digite o valor de A: ");
A = scanner.nextDouble();
System.out.println("Digiter o valor de B: ");
B = scanner.nextDouble();
System.out.println("Digite o valor de C: ");
C = scanner.nextDouble();
//Cálculo do delta

delta = B * B - 4 * A * C;

//Verifica a quantidade de raízes reais com base no delta
if (delta < 0) { System.out.println("A equação não possui raízes reais");
	} else if (delta == 0) {
		System.out.println("A equação possui uma única raiz real");
	} else { System.out.println("A equação possui duas raízes reais.");

}
scanner.close();
	}
}
