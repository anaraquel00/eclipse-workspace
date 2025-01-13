import java.util.Scanner;
public class PinturaParede {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Altura da parede (em metros):");
	double altura = scanner.nextDouble();
	System.out.println("Largura da parede (em metros):");
    double largura = scanner.nextDouble();
    double area = altura * largura;
    double litrosTintaNecessarios = area / 2;
    System.out.printf("A área da parede é: %.2f m²%n", area);
    System.out.printf("Quantidade de tinta necessária: %.2f litros%n",litrosTintaNecessarios);
    scanner.close();
    
	}

}
