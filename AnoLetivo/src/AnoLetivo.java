import java.util.Scanner;
public class AnoLetivo {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o número do mês (1 a 12):");
	int mes = scanner.nextInt();
	int dias;
	switch (mes) {
	case 1 :  case 3 :  case 5 :  case 7 :
	case 8 :  case 10 :case 12 :
		dias = 31;
		break;
		case 4: case 6 :case 9 :  case 11 :
		dias = 30;
		break;
		case 2 :
		dias = 28;
		break;
		default:
		dias = -1; 	
		
	}
	if (dias == -1) {
		System.out.println("Mês inválido! Digite um número entre 1 e 12.");}
	else {System.out.println("O mês " + mes + " tem " + dias + " dias.");}
	scanner.close();	
	}

	}


