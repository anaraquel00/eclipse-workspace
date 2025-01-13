import java.util.Scanner;
public class Detran {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual é a placa do carro (4digitos)?");
		int placa = scanner.nextInt();
		int ultimoDigito = placa % 10;
		String mesVistoria;
		
		switch (ultimoDigito) {
			case 0:
				mesVistoria = "Janeiro do próximo ano";
			break;
			case 1:
				mesVistoria = "Fevereiro do próximo ano";
			break;
			case 2:
				mesVistoria = "Março do próximo ano";
			break;
			case 3:
				mesVistoria = "Abril do próximo ano";
			break;
			case 4:
				mesVistoria = "Maio do próximo ano";
			break;
			case 5:
				mesVistoria = "Junho do próximo ano";
			break;
			case 6:
				mesVistoria = "Setembro desse ano";
			break;
			case 7:
				mesVistoria = "Outubro desse ano";
			break;
			case 8:
				mesVistoria = "Novembro desse ano";
			break;
			case 9:
				mesVistoria = "Dezembro desse ano";
			break;
			default:
				mesVistoria = "mês inválido";
			break;
		}
		System.out.println("O veículo tem que fazer a vistoria em: " + mesVistoria);
		
		scanner.close();

	}

}
