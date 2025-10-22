package condicionais;

/*12. Faça um programa que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a condição:	
• “F1”, se N <= 10
• “F2”, se N > 10 e N <= 100 
• “F3”, se n > 100	*/
import java.util.*;

public class ImprimeValor {

	public static void main(String[] args) {
		
		Scanner scannear = new Scanner(System.in);
		
		double n;
		
		System.out.print("Digite o valor para testar");
		n = scannear.nextDouble();
		
		if (n <= 10) {
			System.out.print("F1");
		}
		
		if (n > 10 && n <=100) {
			System.out.print("F2");
		}
		
		if (n > 100) {
			System.out.print("F3");
		}
		
		

	}

}
