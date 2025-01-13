import java.util.Scanner;
public class ConversaoPes {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	 // Entrada de dados
	System.out.println("Digite uma medida em pés: ");
	Double pes = scanner.nextDouble();
	
	 // Conversões
	Double polegadas = pes * 12;
	Double jardas = pes * 0.333;
	Double milhas = pes * 0.000189394;
	
	// Saída dos resultados
	System.out.println("A medida em polegadas é: " + polegadas);
	System.out.println("A medida em jardas é: " + jardas);
	System.out.println("A medida em milhas é: " + milhas);
	
	scanner.close();
	

	}

}
