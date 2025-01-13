package Condicionais_Compostas;

import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tamanho do terreno (em m²): ");
		double terreno = scanner.nextDouble();
		if (terreno < 100) { 
			System.out.println("TERRENO POPULAR");}
		if (terreno >= 100 && terreno <= 500) {	
			System.out.println("TERRENO MASTER");
		}
		else if (terreno > 500)  {
			System.out.println("TERRENO VIP");
		}
	}

}
