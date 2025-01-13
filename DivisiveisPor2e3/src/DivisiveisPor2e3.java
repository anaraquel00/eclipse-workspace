import java.util.Scanner;
public class DivisiveisPor2e3 {

	public static void main(String[] args) {
 int num1, num2, num3, num4;
 Scanner scanner = new Scanner(System.in);
 System.out.println("Digite o primeiro número: ");
 num1 = scanner.nextInt();
 System.out.println("Digite o segundo número: ");
 num2 = scanner.nextInt();
 System.out.println("Digite o terceiro número: ");
 num3 = scanner.nextInt();
 System.out.println("Digite o quarto número: ");
num4 = scanner.nextInt();
System.out.println("Os números divisíveis por 2 e 3");
//Verifica cada número e imprime se ele é divisível por 2 e 3
if (num1 %2 == 0 && num1 %3 == 0) {
	System.out.println(num1);}
if (num2 %2 == 0 && num2 %3 == 0) {
	System.out.println(num2);}
if (num3 %2 == 0 && num3 %3 == 0) {
	System.out.println(num3);}
if (num4 %2 == 0 && num4 %3 == 0) {
	System.out.println(num4);
	scanner.close();
	
}
	}

}
