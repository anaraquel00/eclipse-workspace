package Revisao;

public class Incremento_Decremento {

	public static void main(String[] args) {
	/*	
		int x = 1;
		System.out.println(x);
		//x++; // x = x + 1
		++x;
		System.out.println(x);
		x = 1;
		//x--; // x = x - 1
		--x;
		System.out.println(x);
*/
		int x = 10, y, z;
		y = x++;
		System.out.println(y);
		System.out.println(x);
		
		x = 10;
		z = ++x;
		System.out.println(x);
		System.out.println(z);
	}

}
