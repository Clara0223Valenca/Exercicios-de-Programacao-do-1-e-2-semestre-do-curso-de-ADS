package Matrizes;

/*4. Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna) do maior valor.
30/09/2025 */

import java.util.*;

public class Exerc04 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		//matriz
		int matriz[][] = new int [4][4];
		int maior, linha = 0, coluna = 0;
		
	
		//preenche a matriz   
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				System.out.print("Digite o valor da linha " + i + " e da coluna " + j + ":");
				matriz[i][j] = scanner.nextInt();
				
			}
		}
		
				 
		//inicializa a variavel
		maior = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					coluna =j;
				}
				
			}
		}
		
		//exibe na tela
		for (int[] line : matriz) {
			for (int valor : line) { 
				System.out.print(valor + " ");
			}
		System.out.println();
		
		}
		System.out.println("O maior valor dessa matriz esta na linha " + linha + " e na coluna " + coluna );
		
	}

}
