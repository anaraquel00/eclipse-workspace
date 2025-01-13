import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
//Entrada de dados
System.out.println("Digite o ano de nascimento: ");
int anoNascimento = scanner.nextInt();

System.out.println("Digite o ano atual: ");
int anoAtual = scanner.nextInt();

//Cálculo da idade
int idadeAnos = anoAtual - anoNascimento;
int idadeMeses = anoAtual * 12;
int idadeDias = anoAtual * 365;
int idadeSemanas = anoAtual * 52;

// Exibição dos resultados
System.out.println("A idade em anos é: "  + idadeAnos);
System.out.println("A idade em meses é: "  + idadeMeses);
System.out.println("A idade em dias é: "  + idadeDias);
System.out.println("A idade em anos é: "  + idadeSemanas);
scanner.close();




	}

}
