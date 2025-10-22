package vetores;
//6. Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor. No final, mostre quais são os números pares que foram digitados e 
//em que posições eles estão armazenados.

import java.util.*;
public class Exerc06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nums[] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite o " + (i+1) + "°" + " número");
			nums[i] = scanner.nextInt();
			
		}
		
		
		for(int i = 0; i < 10; i++) {
			
			if(nums[i] % 2 == 0 ) {
				System.out.println(nums[i] + " - é PAR e está na posição " + i);
			} 
		}
	
		

	}

}
