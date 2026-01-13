package modularizacao;

public class Exerc01 {

	public static void main(String[] args) {
		
		int resultado = maior(4, 9);
		System.out.println("O maior número é " + resultado);
	}	
	
	static int maior (int a, int b) {
		
		if(a>b)
			return a;
		else 
			return b;
		
	}

	
}
