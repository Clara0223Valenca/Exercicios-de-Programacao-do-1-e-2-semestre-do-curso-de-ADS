package vetores;
//1. Faça um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 8 posições, conforme abaixo:

public class Exer01 {

	public static void main(String[] args) {
		
		int[] num = new int[8];
		
		//guardar os valores
		for( int i = 0; i < 8; i++ ) {
			num[i] = 999;
		}
		
		//exibir os valores 
		for ( int i = 0; i <8; i++) {
			System.out.println("Número na posição " + i + ": " + num[i]);
		}

	}

}
