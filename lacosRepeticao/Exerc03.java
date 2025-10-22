package lacosRepeticao;
/*3. Faça um programa que leia um número e imprima a sua tabela de multiplicação de 1 até 10. 
 * O programa deve parar quando o número informado for 0. */

import java.util.*;
public class Exerc03 {

	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
		int num;
		
		do {
			
			System.out.println("Digite um número inteiro para obter sua tabuada");
			num = scannear.nextInt();
			
			for(int i = 0; i <= 10; i++) {
				if(num == 0) break;
				System.out.println(num + " x " + i + " = " + (num*i));
			}
			
		} while (num != 0);
		
	}

}
