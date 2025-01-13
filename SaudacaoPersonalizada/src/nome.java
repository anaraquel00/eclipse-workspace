import java.util.Scanner; 

public class nome {

	public static void main(String[] args) {
		//Cria um objeto Scanner para ler a entrada do usuário
	Scanner scanner = new Scanner(System.in);  	

	    // Solicita o nome do usuário
	System.out.println("Entre com o seu nome: ");
	String nome = scanner.nextLine();
	
	 // Exibe a saudação personalizada
	System.out.println("Olá, " + nome + ", Bem vindo ao nosso programa!");
	
	// Fecha o Scanner
	scanner.close();
	}

}
