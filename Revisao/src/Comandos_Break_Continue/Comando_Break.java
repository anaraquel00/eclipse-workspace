package Comandos_Break_Continue;

public class Comando_Break {

	public static void main(String[] args) {
int x = 0;
		
		while(true) {
			System.out.println("Valor de x = " + x);
			x++;
			if(x == 10) {
				System.out.println("Laço de repetição interrompido");
				break;
			}			
		}
		System.out.println("Depois do laço de repetição");

	}

}
