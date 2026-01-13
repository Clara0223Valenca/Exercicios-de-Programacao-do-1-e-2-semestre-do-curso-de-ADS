package modularizacao;

public class Exerc06 {

	public static void main(String[] args) {

		System.out.println("Resultado da soma = " + soma(5,7)); 

		System.out.println("Resultado da soma = " + decrescente(20,15,10)); 
	}
	
	/* 6. Crie um método que receba 2 valores e retorne a sua soma. Se o valor da soma for negativo o método deverá retornar o valor 0.
	 11/11/2025 */
	
	static int soma (int num1, int num2) {
		return num1 + num2;
	}

	
	/* 7. Crie um método que receba 3 valores (a, b, c) e retorne verdadeiro se a>b>c e falso em caso contrário.
   17/11/25 */
	
	static boolean decrescente (int a, int b, int c) {
		
		boolean teste = false;
		
		if (a > b && b > c) {
			
			teste = true;
		} 
		
		return teste;
	}
	

}
