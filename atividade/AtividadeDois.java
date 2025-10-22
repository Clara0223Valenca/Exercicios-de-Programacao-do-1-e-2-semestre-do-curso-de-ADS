package atividade;

import java.util.Scanner;

public class AtividadeDois {
 
	public static void main(String[] args)
	{
		Scanner scannear = new Scanner(System.in);
		float comprimento;
		float altura; 
		float largura;
		
		System.out.print("Digite o comprimento: ");
		comprimento = scannear.nextFloat();
	
		System.out.print("Digite a altura: ");
		altura = scannear.nextFloat();

		System.out.print("Digite a largura: ");
		largura = scannear.nextFloat();
		
		float volume = comprimento * altura * largura;
		
		System.out.println("Descubra o volume da sua caixa retangular é: " + volume );
		
		
	}
}
