package vetores;

public class Teste {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		
		//Não é obtido o resultado esperado -> 9,8,7,6,5,4,3,2,1,0
		
		//entra no primeiro for //0
        for(int i = 0; i < 10; i++) {
			
        	//faz esse for completo 
			for(int num = 9; num >= 0; num--) {
			vetor[i] = num;
		
			System.out.println(vetor[i]);
		}

	
		}
		
	}

}
