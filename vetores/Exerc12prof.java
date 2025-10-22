package vetores;
/* 09/09/2025
12. Crie um programa que receba e armazene em um vetor 5 números pares. Se o usuário digitar um número ímpar, deve ser informado para digitar novamente
até que um número par seja registrado no vetor. Após, exiba o vetor resultante na tela.
forma de resolução do professor:*/

import java.util.Scanner;

public class Exerc12prof {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num[] = new int[5];
		for(int i = 0; i <5; i++) {

			while(true) {
				System.out.println("Digite números pares");
				int n = scanner.nextInt();
				if( n % 2 == 0) {
					num[i] = n;
					break;
			     }
			}//fim do while
			
		}//fim do for
		
		System.out.println("Números pares digitados: ");
		for( int numero : num) {
			System.out.println(numero);
		}

	}

}
