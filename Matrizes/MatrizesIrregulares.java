package Matrizes;

public class MatrizesIrregulares {

	public static void main(String[] args) {
		
		// Criando a matriz 3x? de inteiros
		int[ ][ ] irregular = new int[3][ ];
		
		// Alocando cada coluna da matriz
		irregular[0] = new int[2]; // 2 colunas
		irregular[1] = new int[4]; // 4 colunas
		irregular[2] = new int[3]; // 3 colunas
		
		// Preenchendo automaticamente
		int valor = 1;
		for (int i = 0; i < irregular.length; i++) {
			for (int j = 0; j < irregular[i].length; j++) {
				irregular[i][j] = valor++;
				System.out.print(irregular[i][j] + " ");
			}
			System.out.println(); // quebra de linha
		}

	}

}
