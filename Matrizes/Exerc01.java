package Matrizes;
/*1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
29/09/2025 */

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//matriz
		int[][] m =  new int[4][4];
		
		int contador = 0;
		
		//preenchendo a matriz 
		for (int i = 0; i < m.length; i++) { // itera sobre as linhas
			for (int j = 0; j < 3; j++) { // itera sobre as colunas
			System.out.print("Digite um valor ([" + i + j + "])");
			m[i][j] = scanner.nextInt();
			}
		}
		
		// faz contagem 
		for (int i = 0; i < m.length; i++) { // itera sobre as linhas
			for (int j = 0; j < 3; j++) { // itera sobre as colunas
			
				if(m[i][j] > 10) {
					System.out.println(m[i][j]);
					contador++;
				}
			}
		}
		System.out.println("Foram encontrados " + contador + " números");
		
	}

}
