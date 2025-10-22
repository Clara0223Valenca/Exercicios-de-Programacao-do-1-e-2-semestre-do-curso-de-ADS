package vetores;
//7. Faça um programa que leia 10 números inteiros e armazene em um vetor. Após, some estes valores e mostre o resultado.

import java.util.*;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num[] = new int [10];
		int soma = 0;
		
	
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + " número");
			num[i]= scanner.nextInt();
			soma += num[i];
		}
		
		System.out.println("O total é " + soma);
	}

}
