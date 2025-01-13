import java.util.Scanner;
public class apresentacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		System.out.printf("Olá, %s! \nBem vindo ao nosso Programa!", nome);
		scanner.close();

	}

}
