package vetores;
//12. Crie um programa que receba e armazene em um vetor 5 números pares. Se o usuário digitar um número ímpar, deve ser informado para digitar novamente
//até que um número par seja registrado no vetor. Após, exiba o vetor resultante na tela.
import java.util.*;
public class Exer12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int pares[] = new int[5];
		
		int num;
		int i = 0;
		
		do {
			
			System.out.println("Digite um número par para armazenar na posição " + (i+1));
			num = scanner.nextInt();
			
			if (num % 2 == 0) { 
				pares[i] = num;
				i++;
			} else {
				
				System.out.println("Digite somente números pares\n");
			}
				
		} while ( i < pares.length);
		
		
		for( int par : pares) {
			System.out.println(par);
		}
		
		scanner.close();
	}

}
