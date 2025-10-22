package vetores;
//2. Crie um programa que preencha automaticamente (use uma estrutura de repetição) um vetor numérico com 10 posições, conforme abaixo:
//0 ao 9
//5, 10, 15...
public class Exerc02 {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		
		int num = 5;
		
		for(int i = 0; i < 10; i++) {
			
			 if(i == 0) {vetor[i] = num;}
			 
			 if(i != 0){
				 
				 vetor[i] = num * (i + 1);
			 }
			 
			 System.out.println(vetor[i]);
		}
		

	}

	
}
