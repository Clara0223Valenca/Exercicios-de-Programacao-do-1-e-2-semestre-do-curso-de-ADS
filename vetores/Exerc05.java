package vetores;
//5. Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No final, mostre uma listagem com todos os nomes informados,
//na ordem inversa daquela em que eles foram informados.

import java.util.*;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		
		String[] nomes = new String[7];
		
		for(int i = 0; i <= 6; i++) {
			
			System.out.print("Digite o " + (i+1) + "°" + " nome");
			nome = scanner.nextLine();
			
			nomes[i] = nome;
		}
		
		for( int y = 6; y > 0; y--) {
			System.out.println(nomes[y]);
		}
		
		
		
	}

}
