package Matrizes;

public class MatrizesFor {

	public static void main(String[] args) {
		
		
		
		//Loops for aninhados:
		
		/*int[ ][ ] matriz = { {1,2,3},{4,5,6}};
		
		for (int i = 0; i < 3; i++) { // itera sobre as linhas
			for (int j = 0; j < 2; j++) { // itera sobre as colunas
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(); // quebra de linha
		} ?*/


		//Exemplo com for aprimorado:
			
		//inicialização explícita
			int[ ][ ] matriz = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
			};
			
			//Percorre a matriz -> quando você não precisa dos índices
			
			for (int[ ] linha : matriz) { // cada "linha" é um vetor
				for (int valor : linha) { // percorre os elementos da linha
					System.out.print(valor + " ");
				}
			System.out.println();
			
			}
			
	}

}
