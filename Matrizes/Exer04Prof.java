package Matrizes;

import java.util.Scanner;

public class Exer04Prof {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// matriz
		int[][] m = new int[4][4];
		int maior, linha=0, coluna=0;
		
		// Preenche a matriz
		for(int i=0; i < m.length; i++) { 
			for(int j=0; j < m.length; j++) { 
				System.out.print("Digite um valor ("+i+j+"):");
				m[i][j] = sc.nextInt();				
			}
		}
		
		//Exibe e analisa a matriz
		maior = m[0][0]; // inicializa a variável
		for(int i=0; i < m.length; i++) { 
			for(int j=0; j < m.length; j++) { 
				System.out.print(m[i][j]+" ");
				if(m[i][j] > maior) { // se encontrou um valor maior...
					maior = m[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println(); // quebra de linha
		}
		
		// Mostra a localização do maior valor
		System.out.println("Maior valor encontrado em (L"+linha+"- C"+coluna+") - "+maior);
		
		
	}

}
