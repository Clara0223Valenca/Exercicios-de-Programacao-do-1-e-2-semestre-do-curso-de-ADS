package vetores;

import java.util.*;

/*15. Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e 15 sorteados pelo computador. Depois disso, peça para o usuário digitar um número (chave) e 
 seu programa deve mostrar em que posições essa chave foi encontrada. Mostre também quantas vezes a chave foi sorteada.
*/
public class Exerc15 {

	public static void main(String[] args) {
		 
		Random sorteia = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int chave;
		int posicao = 0, qntdChave = 0;
	
		int nums[] = new int[30];
		
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = sorteia.nextInt(15)+1; //para não contar o zero
			
		}
		
		
		System.out.print("Digite o número chave e descubra em qual posição ela está e quantas vezes foi repetida"); 
		chave = scanner.nextInt(); 
		
		while (posicao < nums.length){
			
			if (nums[posicao] == chave) {
				qntdChave++;
				
				if (qntdChave == 1) System.out.print ("A chave existe na posição: "  );
				
				System.out.print(posicao + " ");
				
			} 
			
			posicao++;
 
		} 
		
	}

}
