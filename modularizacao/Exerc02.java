package modularizacao;
// 10/11/2025
public class Exerc02 {

	public static void main(String[] args) {
		
		int a = 4, b = 10, c= 6; 
		
		menor(a,b);
		System.out.println("O maior número dos três é " + maior(a, b, c) );
		menor3(a,b,c);
		

	}
	
	
	//2. Crie um método que receba 2 números e retorne o menor valor. 
	// Método sem retorno (void)
	static void menor(int a, int b) {
		int menor = 0;
		if (a < b)
			menor = a;
		else 
			menor = b;
		System.out.println("O menor número é: " + menor);
		
	}
	
	//3. Crie um método que receba 3 números e retorne o maior valor
	// Método com retorno de variável 
	static int maior(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if ( b > a && b > c)
			return b;
		else 
			return c;
	}
	
	//4. Crie um método que receba 3 números e retorne o menor valor.
	static void menor3 (int a, int b, int c) {
		
		int menor3 = 0;
		if (a < b && a < c)
			
			menor3 = a;
		else if ( b < a && b < c)
			
			menor3 = b;
		else 
			
			menor3 = c;
		System.out.println("O menor número dos três é " + menor3);
	}
	


}
