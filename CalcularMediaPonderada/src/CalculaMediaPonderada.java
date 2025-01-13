import java.util.Scanner;
public class CalculaMediaPonderada {

	public static void main(String[] args) {
		double notaLab, notaAval, notaExame, mediaPonderada;
		Scanner scanner = new Scanner(System.in);
		 // Entrada de notas
		System.out.println("Digite a nota do Trabalho de Laboratório: ");
		notaLab = scanner.nextDouble();
		System.out.println("Digite a nota da Avaliação Semestral: ");
		notaAval = scanner.nextDouble();
		System.out.println("Digite a nota do Exame Final: ");
        notaExame = scanner.nextDouble();
        
        // Cálculo da média ponderada
        mediaPonderada = (notaLab * 2 + notaAval * 3 + notaExame * 5)/ 10;
        		
     //Exibição da média ponderada
       System.out.printf("Média ponderada: %.2f\n", mediaPonderada);
       
    // Atribuição de conceito com base na média ponderada
       if (mediaPonderada >= 8.0 && mediaPonderada <= 10.0) {
           System.out.println("Conceito: A");
       } else if (mediaPonderada >= 7.0 && mediaPonderada < 8.0) {
           System.out.println("Conceito: B");
       } else if (mediaPonderada >= 6.0 && mediaPonderada < 7.0) {
           System.out.println("Conceito: C");
       } else if (mediaPonderada >= 5.0 && mediaPonderada < 6.0) {
           System.out.println("Conceito: D");
       } else {
           System.out.println("Conceito: E");
       }

       scanner.close();
   }
}
