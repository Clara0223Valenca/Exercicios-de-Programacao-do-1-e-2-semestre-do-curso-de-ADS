package atividade;

import java.util.Scanner;

public class AtividadeNove {
	
	public static void main(String[] args)
	{
		Scanner scannear = new Scanner(System.in);
		
		float saldo = 500, cheque;
		float saldoAtual;
		
		System.out.print("Valor do cheque que será descontado: ");
		cheque = scannear.nextFloat();
		
		saldoAtual = saldo - cheque;
	 
		System.out.println("Seu saldo atual é " + saldoAtual);
	}
}
