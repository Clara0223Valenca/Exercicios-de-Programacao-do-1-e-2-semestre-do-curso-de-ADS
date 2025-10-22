package Matrizes;
/*6. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição das matrizes lidas. Exiba cada uma delas na tela.
07/10/2025 */
import java.util.*;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m1[][] = new int[4][4];
		int m2[][] = new int[4][4];
		int m3[][] = new int[4][4];
		
		
		// preenche a 1° e a 2° matriz 
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				
				System.out.print("Digite o valor  (L"+ i + " - C"+ j + ")" + " da primeira tabela:");
				m1[i][j] = scanner.nextInt();
				
			}
		}
		
		System.out.println(); //espaço
		
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++) {
				
				System.out.print("Digite o valor  (L"+ i + " - C"+ j + ")" + " da segunda tabela:");
				m2[i][j] = scanner.nextInt();
				
			}
		}
		
		
		//compara os valores e coloca o maior na 3° matriz
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				
				if (m1[i][j] >= m1[i][j] ) {
					
					m3[i][j] = m1[i][j];
				} else {
					
					m3[i][j] = m2[i][j];
				}
			}
		}
		
		
		//Exibe a primeira matriz
		System.out.println("\t1° matriz");
		for(int i=0; i < m1.length; i++) { 
			for(int j=0; j < m1.length; j++) {
				
				System.out.print(m1[i][j]+" ");
			}
			
			System.out.println(); // quebra de linha
		}
		
		//Exibe a segunda matriz
		System.out.println("\n\t2° matriz");
		for(int i=0; i < m3.length; i++) { 
			for(int j=0; j < m3.length; j++) {
				
				System.out.print(m2[i][j]+" ");
			}
			
			System.out.println(); // quebra de linha
		}
		
		
		
		//Exibe a terceira matriz
		System.out.println("\n\t3° matriz");
		for(int i=0; i < m3.length; i++) { 
			for(int j=0; j < m3.length; j++) {
				
				System.out.print(m3[i][j]+" ");
			}
			
			System.out.println(); // quebra de linha
		
		}
		
		
	}

}
// o laço for de dentro repete o dobro do for mais externo
