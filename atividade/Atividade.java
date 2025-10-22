package atividade;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) 
	{
		
		Scanner scannear = new Scanner(System.in);
		
		float valor, taxa = 50, prestacao, tempo;
		
		System.out.print("digite o valor:");
		valor = scannear.nextFloat();
		
		System.out.print("digite o tempo:");
		tempo = scannear.nextFloat();
		
		prestacao = valor + (valor * (taxa/100) * tempo);
		
		
		System.out.println(" A prestação em atraso é:"+ prestacao);
	}
}
