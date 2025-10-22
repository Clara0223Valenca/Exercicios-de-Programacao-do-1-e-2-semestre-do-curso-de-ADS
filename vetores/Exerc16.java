package vetores;
/*16. Faça um programa que leia o nome, a idade e o time de 5 alunos, e armazene estas informações em 3 vetores (um vetor nome, um vetor idade e um vetor time). Ao final, o programa deverá 
 * escrever o nome, a idade e o time do aluno mais novo e também o nome, a idade e o time do aluno mais velho.
 * 22/09/2025*/

import java.util.*;

public class Exerc16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String nomes[] = new String[5];
		int idades[] =  new int[5];
		String times[] = new String[5];
		int maisNovo=0, maisVelho=0;
		
		for(int i = 0; i < 5 ; i++) {
			
			System.out.print("Digite o nome do " + (i+1) + "º aluno");
			nomes[i] = scanner.nextLine(); 
			
			System.out.print("Digite sua idade:");
			idades[i] = scanner.nextInt();
			String descarta =  scanner.nextLine(); 
			
			System.out.println("Digite o seu time:");
			times[i] = scanner.nextLine(); 
		}
		
		
		for(int i = 0; i < 4 ; i++) {
			
			
			//captura o mais novo dos alunos
			if (idades[i + 1] < idades[i]) {
				
				maisNovo = idades[i + 1];
				
			} else {
				
				maisNovo = idades[i];
			}
			
			//captura o mais velho dos alunos
			
			if (idades[i + 1] > idades [i]) {
				
				maisVelho = idades[i + 1];
			} else {
				
				maisVelho = idades[i];
			}
			
		} //fim do for para selecionar maior e menor idade entre alunos
		
		for(int i = 0; i < 5 ; i++) {
			
			//printa aluno mais novo
			if (idades[i] == maisNovo) System.out.println("O aluno mais novo é " + nomes[i] + ", sua idade é " + maisNovo + " e seu time é " + times[i] );
			
			//printa aluno mais velho
			if (idades[i] == maisVelho) System.out.println("O aluno mais velho é " + nomes[i] + ", sua idade é " + maisVelho + " e seu time é " + times[i] );
			
			
		}
		
		
			
	}

}
