import java.util.Scanner;

public class comissaovendas {

	public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
      
 //Calculo da venda de um produto
System.out.println("Valor do Produto:" );
Double valorProduto = scanner.nextDouble();
     //Entrada da taxa de comissão
System.out.println("Taxa de comissão: (em %): ");
Double taxaComissao = scanner.nextDouble();
      //Cálculo da comissão
Double comissao = valorProduto * (taxaComissao / 100);
//Exibe o resultado formatado com duas casas decimais
System.out.println("Valor da comissão em reais: R$ " + comissao);

//Entrada do salário base do funcionário
System.out.println("Salário base do funcionário: R$ ");

double salarioBase = scanner.nextDouble();
     //Salario + comissao sob as vendas
Double salarioComComissao = salarioBase + comissao;

     //Exibição do salário a receber
Double salarioAReceber = salarioComComissao;

System.out.printf("O Salário a receber é: R$ %.2f%n", salarioAReceber);

scanner.close();

	}

}
