package Revisao;

public class Operadores_Logicos {

	public static void main(String[] args) {
		
boolean res;
		
res = !( (4 + 3) != 17 );
System.out.println("Primeiro = " + res);
res = (4 > 3) && ( 4 != 2);
System.out.println("Segunda = " + res);
res = (2*3 > Math.pow(2, 3)) || (2 * 3 == 6); 
//Math.pow explica a potencia 2 à terceira.
System.out.println("Terceira = " + res);
	}

}
