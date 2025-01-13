import java.util.Scanner;
public class AreaQuadrado {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	  // Entrada de dados
	System.out.println("Digite o valor lado do quadrado: ");
    Double lado = scanner.nextDouble();
    
      // Cálculo da área do quadrado
    Double area = lado * lado;
    
      // Saída do resultado
    System.out.println("A área do quadrado é : " + area);
    scanner.close();
    
	}

}
