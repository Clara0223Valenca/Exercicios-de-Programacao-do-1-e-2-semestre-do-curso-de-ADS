package condicionais;
/*13. Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de serviços é de: 
•R$ 5.50 por diária, se o número de diárias for maior que 15;
 •R$ 6.00 por diária, se o número de diárias for igual a 15;
 •R$ 8.00 por diária, se o número de diárias for menor que 15.			
Construa um programa que leia o número de diárias de um cliente e mostre o seu nome e o total da conta.
*/

import java.util.*;
public class ServicoHotel {

	public static void main(String[] args) {
		
		Scanner scannear = new Scanner(System.in);
		
		int diaria;
		String name;
		double total;
		
		System.out.print("Digite seu nome ");
		name = scannear.nextLine();
		
		System.out.print("Senhor(a) " + name + ", digite seu número de diárias ");
		diaria = scannear.nextInt();
		
		if(diaria > 15) {
			
			total = (diaria * 60) + (diaria * 5.50);
			
			System.out.print("Senhor(a) " + name + ", o total da sua conta é " + total);
		}

		if(diaria == 15) {
			
			total = (diaria * 60) + (diaria * 6.00);
			
			System.out.print("Senhor(a) " + name + ", o total da sua conta é " + total);
		}
		
		if(diaria < 15) {
			
			total = (diaria * 60) + (diaria * 8.00);
			
			System.out.print("Senhor(a) " + name + ", o total da sua conta é " + total);
		}


	}

}
