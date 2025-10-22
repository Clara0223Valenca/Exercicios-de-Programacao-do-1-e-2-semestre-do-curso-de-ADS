package vetores;
//3. Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo:

public class Exerc03 {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int i =  0;
		
		while (i < 10) {
			
			for(int num = 9; num >= 0; num--) {
				vetor[i] = num;
				System.out.println(vetor[i]);
				i++;
			}
			
		}
		
		
	}

}
