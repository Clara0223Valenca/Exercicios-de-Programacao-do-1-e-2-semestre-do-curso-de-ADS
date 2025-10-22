package condicionais;
/*15. Escreva um programa que, para uma conta bancária, leia o seu número, o saldo, o tipo de operação a ser realizada (depósito ou retirada) 
 e o valor da operação. Após, determine e mostre o novo saldo. Se o novo saldo ficar negativo, deve ser mostrada, também, a mensagem “conta
 estourada”. 
*/

import java.util.*;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Scanner scannear = new Scanner(System.in);
		int operacao;
		double saldo=0,  valorOperacao=0, novoSaldo = 0;
		
		System.out.print("Digite seu saldo");
		saldo = scannear.nextDouble();
		
		System.out.print("Digite 01 para depósito e 02 para retirada");
		operacao = scannear.nextInt();
		
		switch (operacao) { 
		case 01:
			System.out.print("Digite o valor que deseja depositar ");
			valorOperacao = scannear.nextDouble();
			break;
	
		case 02:
			System.out.print("Digite o valor que deseja retirar ");
			valorOperacao = scannear.nextDouble();
			break;
			
		}
		  
		if(operacao == 01) {
			saldo = saldo + valorOperacao;
			System.out.println("Seu novo saldo é: " + saldo);
			  
		} else if (operacao == 02) {
			saldo = saldo - valorOperacao;
			System.out.println("Seu novo saldo é: " + saldo);
			
		} else {
			System.out.println("Falha na operação");
			
		}
		
		if( saldo < 0) {
			System.out.println("conta estourada");
		}
	}

}
