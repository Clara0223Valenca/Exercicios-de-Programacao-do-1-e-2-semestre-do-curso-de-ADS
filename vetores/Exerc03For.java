package vetores;

public class Exerc03For {

	public static void main(String[] args) {
		int[] num  = new int[10];
		
		//Preenche o vetor
		
		int valor = 9;
		
		for(int i = 0; i <= 9; i++) {
			num[i] =  valor;
			valor--;
		}
		
		
		//Exibe vetor
		for (int i =0; i< 10; i++) {
			System.out.println(i +" - " + num[i]);
		}
	}
}
