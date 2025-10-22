package vetores;
/*14. Crie um programa que preencha automaticamente um vetor numérico com 7 números, entre 1 e 50, gerados aleatoriamente pelo computador e depois mostre os valores gerados na tela.
Dica: use a classe Random*/
import java.util.*;

public class Exer14 {

	public static void main(String[] args) {
		 
		Random sorteia = new Random();
		
		int nums[] = new int[7];
		
		for (int i = 0; i < nums.length; i++) {
			
			nums[i] = sorteia.nextInt(50)+1;
			
		}
		
		for( int num : nums) {
			System.out.println(num);
		}
		
	}

}
