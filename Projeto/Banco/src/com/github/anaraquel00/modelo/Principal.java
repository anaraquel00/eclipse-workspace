package com.github.anaraquel00.modelo;

import com.github.anaraquel00.Conta_Bancaria;

public class Principal {
	public static void main(String[] args) {
		Conta_Bancaria bk = new Conta_Bancaria();	
		
		bk.nome = "Ana Raquel";
		bk.agencia = "Banco do Brasil";
		bk.numeroDaConta = 64899-3;
		bk.saldo = 1000;
		System.out.println("Ola, me chamo "+bk.nome+" tenho uma conta n° " +bk.numeroDaConta+" na agencia do \n"+bk.agencia+"\n"+bk.saldo+" é o saldo da minha conta.");
		
		
		
	}
}
	
