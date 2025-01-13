package Revisao;

import java.util.Locale;
import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
	scan.useLocale(Locale.US);
	
	//Entrada de variaveis:
	
    int idProduto;
    double precoUnitario,quantidade, taxaImposto;
    double valorImposto, valorProduto,valorTotal;
    String nomeProduto, descricaoProduto;
    
    System.out.print("Id produto: ");
    idProduto = Integer.parseInt(scan.nextLine());
    System.out.print("Nome do produto: ");
    nomeProduto = scan.nextLine();
    System.out.print("Descricao do produto: ");
    descricaoProduto = scan.nextLine();
    System.out.print("Quantidade: ");
    quantidade = Double.parseDouble(scan.nextLine());
    System.out.print("Preco unitario: ");
    precoUnitario = Double.parseDouble(scan.nextLine());
    System.out.print("Taxa de imposto (em %): ");
    taxaImposto = Double.parseDouble(scan.nextLine());
    
    //Processamento
    valorProduto = quantidade * precoUnitario;
    valorImposto = (valorProduto * taxaImposto)/100;
    valorTotal = valorProduto + valorImposto;
    
    System.out.println("Resumo da compra: \nNome do Produto: "+ nomeProduto);
    System.out.println("Descricao do produto: "+ descricaoProduto);
    System.out.println("Quantidade: "+ quantidade);
    System.out.println("Preco unitario: "+"R$ "+ precoUnitario);
    System.out.println("Taxa de imposto: "+ taxaImposto+" %");
    System.out.println("Valor do imposto: "+"R$ "+ valorImposto);	
    System.out.println("Valor do Produto: "+"R$ "+ valorProduto);    
    System.out.println("Valor Total da compra: "+"R$ "+ valorTotal);

    
    
    
	
	}

}
