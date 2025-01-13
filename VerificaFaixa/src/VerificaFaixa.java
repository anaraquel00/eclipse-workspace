import java.util.Scanner;
public class VerificaFaixa {

	public static void main(String[] args) {
		int valor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
        valor = scanner.nextInt();
        if (valor >= 1 && valor <= 9);{
        System.out.println("O valor está na faixa permitida");	
        }  
        
scanner.close(); 
	}
}

