package condicionais;
/*11. Faça um programa que leia dois números A e B e imprima o maior deles.*/

import java.util.*;

public class EscolheMaior {

	public static void main(String[] args) {
		
		Scanner scannear = new Scanner(System.in);
		
		System.out.print("Digite o valor do número A");
		double numA = scannear.nextDouble();
		
		System.out.print("Digite o valor do número B");
		double numB = scannear.nextDouble();
		
		if (numA > numB) {
			System.out.print("O número maior é " + numA);
		} else if (numB > numA) {
			System.out.print("O número maior é " + numB);
		} else {
			System.out.println("Os números são iguais ou a opção é inválida ");
		}

	}

}
