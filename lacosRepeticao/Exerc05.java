package lacosRepeticao;
/*5. Criar um programa que informa quantos números entre 100 e 200 foram digitados. O programa pára quando o usuário digitar 0.*/
import java.util.*;
public class Exerc05 {

	public static void main(String[] args) {

		Scanner scannear =  new Scanner(System.in);
		int quantidade = 0, num;
		 
		System.out.println("Vamos ver quantos números entre 100 e 200 foram digitados. Quando quiser encerrar digite 0");
		
		do {
			
			System.out.print("Digite um número: ");
			num = scannear.nextInt();
			
			if(num > 100 && num < 200 ) {
				
				quantidade++;
					
			}
		
		} while (num != 0);
		
		System.out.println("A quantidade total foi: " + quantidade);
	}

}
