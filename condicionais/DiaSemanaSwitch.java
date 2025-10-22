package condicionais;

/*4. Construa um programa que lê um número de 1 a 7 e informa o dia da semana correspondente, sendo domingo o dia de número 1. 
Se o dia não corresponder ao dia da semana, é mostrada uma mensagem de erro.*/

import java.util.*;

public class DiaSemanaSwitch {

	public static void main(String[] args) {
		Scanner scannear =  new Scanner(System.in);
		int dia;
		
		System.out.print("Digite um dia da semana em numerais");
		dia = scannear.nextInt();
		
	/*	switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda");
			break;
			
		case 3:
			System.out.println("Terça");
			break;
			
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Dia inválido");
		} */
		
		
		switch(dia) {
		
		case 1,7:
			System.out.println("Final de semana");
		
		case 2,3,4,5,6 :
			System.out.println("Dia útil");
		

		}

	}

}
