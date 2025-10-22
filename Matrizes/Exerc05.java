package Matrizes;
/*5. Leia uma matriz 5 x 5. Leia também um valor "X". O programa deverá fazer uma busca desse valor na matriz e, ao final, escrever a localização 
(linha e coluna) ou uma mensagem de “não encontrado”.
06/10/2025 */
import java.util.*;

public class Exerc05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		//matriz
		int matriz[][] = new int [5][5];
		int x, linha = 0, coluna = 0;
	    boolean encontrado = false;
		
	    
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				System.out.print("Digite o valor da linha " + i + " e da coluna " + j + ":");
				matriz[i][j] = scanner.nextInt();
				
			}
		}
		
		System.out.println("Digite o valor que deseja localizar");
		x = scanner.nextInt();
		
				 
		//inicializa a variavel
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if (matriz[i][j] == x) {
					encontrado = true;
					linha = i;
					coluna =j;
				}
				
			}
		}
		
		//exibe na tela
	
		System.out.println("A localização de " + x + " esta na linha " + linha + " e na coluna " + coluna );
		
		
	}

		
	//pode usar flag e colocar 'encontrado++'
	// encontrado != 0

}
