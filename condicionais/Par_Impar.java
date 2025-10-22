package condicionais;
/*7. Faça um programa que leia um número e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.*/
import java.util.*;
public class Par_Impar {

	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
		
		int num, numero ;
		
		System.out.print("Digite o número para saber se é par ou ímpar e se é positivo ou negativo");
		num = scannear.nextInt();
		
		numero = num % 2 ;
		
		if (numero == 0 ) {
			System.out.print("Seu valor é par ");
			if (num > 0) {
				System.out.print("e positivo ");
			} else if (num < 0){
				System.out.print("e negativo");
			}
		} else {
			System.out.print("Seu valor é ímpar ");
			if (num > 0) {
				System.out.print("e positivo ");
			} else if (num < 0){
				System.out.print("e negativo");
			}
		}
		
		
	}

}
