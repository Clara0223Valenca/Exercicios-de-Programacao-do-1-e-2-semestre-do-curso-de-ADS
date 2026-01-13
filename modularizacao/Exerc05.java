package modularizacao;

/*5. Crie um aplicativo de conversão entre as temperaturas Celsius e Fahrenheit. Primeiro o usuário deve escolher se vai entrar com a temperatura em Celsius ou Fahrenheit,
depois a conversão escolhida é realizada através de um comando SWITCH. Não esqueça de criar um método que receberá os parâmetros necessários para realizar a conversão.				
Se C é a temperatura em Celsius e F em fahrenheit, as fórmulas de conversão são:				
C= 5.(F-32)/9 F= (9.C/5) + 32	

 11/11/2025 */

import java.util.*;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		
		System.out.print("Digite F para converter Celsius para Fahrenheit OU digite C para converter Fahrenheit para Celsius");
		String conversao = scanner.nextLine();
		
		System.out.print("Digite o valor para ser convertido");
		double a = scanner.nextDouble();
		
		
		if (conversao.equalsIgnoreCase("C")) {
			converteC(a);
		} 
		
		if(conversao.equalsIgnoreCase("F")) {
			converteF(a);
		} 
	}

	static double converteF (double a) {
		
		double f  = (9 * a / 5) + 32;
		
		System.out.println("A temperatura " + a + " C, equivale a " + f + " Fahrenheit");
		
		return f;
		
	}
	
	static double converteC (double a) {
		
		double c =  5 * ( a - 32) / 9;
		
		System.out.println("A temperatura " + a + " F, equivale a " + c + " Celsius");
		
		return c;
		
	}
		

}
