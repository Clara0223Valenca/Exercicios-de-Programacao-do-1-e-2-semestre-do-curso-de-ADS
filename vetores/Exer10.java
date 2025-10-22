package vetores;
//10. Crie um vetor que receba 10 números inteiros digitados pelo usuário. Depois defina e mostre na tela o percentual de números pares e ímpares recebidos e armazenados no vetor.

import java.util.*;
public class Exer10 {

	public static void main(String[] args) {
		
		int par = 0, impar = 0;
		Scanner scanner = new Scanner(System.in);
		
		int nums[] = new int[10];
	
		for(int i = 0; i < 10; i++ ) {
		
			System.out.println("Digite o número inteiro da posição " + (i+1));
			nums[i] = scanner.nextInt();
			
			if(nums[i] % 2 == 0 ) {
				
				par++;
			} else {
				
				impar++;
			}
			
		}
		
		System.out.println( "O percentual de números pares é: " + (par * 10) +" %" +
		"\n O percentual de números ímpares é: " + (impar *  10) + " %");
		
		
		
	scanner.close();	
	}

}
