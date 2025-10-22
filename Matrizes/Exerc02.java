package Matrizes;
/*2. Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva ao final a matriz obtida.
30/09/2025 */
public class Exerc02 {

	public static void main(String[] args) {
		
		int matriz[][] = new int [5][5];
		
		
		//preenche a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) { 
				
				if (i == j) {
					
					matriz[i][j] = 1;
					
				} else {
					
					matriz[i][j] = 0;
				}
			}
		}
		
		for (int[ ] linha : matriz) { // cada "linha" é um vetor
			for (int valor : linha) { // percorre os elementos da linha
				System.out.print(valor + " ");
			}
		System.out.println();
		
		}
	}

}
 