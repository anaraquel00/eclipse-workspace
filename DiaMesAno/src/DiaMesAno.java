import java.util.Scanner;
public class DiaMesAno {
	public static Scanner scanner = new Scanner(System.in);

	private static String nomMes(int mes) {
		
		String nomeDoMes = "";
		
		switch (mes) {
		case 1:
			nomeDoMes = "janeiro";
		break;
		case 2: 
		    nomeDoMes = "fevereiro";
		break;
		case 3:
			nomeDoMes = "março";
		break;	
		case 4:
			nomeDoMes = "abril";
		break;
		case 5:
			nomeDoMes = "maio";
		break;
		case 6:
			nomeDoMes = "junho";
		break;
		case 7: 
			nomeDoMes = "julho";
		break;
		case 8:
			nomeDoMes = "agosto";
		break;
		case 9:
			nomeDoMes = "setembro";
		break;
		case 10: 
			nomeDoMes = "outubro";
		break;
		case 11:
			nomeDoMes = "novembro";
		break;
		case 12:
			nomeDoMes = "dezembro";
		break;
		default:
			System.out.println("Mês invalido.");
		scanner.close();
		}
		return nomeDoMes;
	}
	public static void main(String[] args) {
		System.out.println("Qual o dia?");
		int dia = scanner.nextInt();
		System.out.println("Qual mês?");
		int mes = scanner.nextInt();
		System.out.println("Qual ano?");
		int ano = scanner.nextInt();
		String nomeDoMes = DiaMesAno.nomMes(mes);
		System.out.printf(dia + " de " + nomeDoMes + " de " + ano);
		scanner.close();
		}
}
	
		
	
		

	


