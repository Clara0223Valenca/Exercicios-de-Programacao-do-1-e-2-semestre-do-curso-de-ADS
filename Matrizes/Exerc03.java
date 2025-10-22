package Matrizes;
/*3. Faça um programa que preencha uma matriz 4 x 4 com o produto do valor da linha e da coluna de cada elemento. Em seguida, imprima na tela 
a matriz.
 30/09/2025 */
public class Exerc03 {

	public static void main(String[] args) {

		int matriz[][] = new int [4][4];
		 
		//preenche a matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) { 
				
				matriz[i][j] = (i*j);
			}
		}
		
		//exibe na tela
		for (int[ ] linha : matriz) {
			for (int valor : linha) { 
				System.out.print(valor + " ");
			}
		System.out.println();
		
		}
		
	}

}
