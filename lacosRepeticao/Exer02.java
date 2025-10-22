package lacosRepeticao;
/*2. Crie um programa que exiba o seguinte menu até que o usuário escolha a opção 0:
1 - Dizer Olá
	2 - Mostrar data atual
	0 - Sair
Use do...while para repetir o menu. Não precisa implementar a funcionalidade das opções, apenas simular com mensagens como “Olá!” ou “Data: simulada”.
*/
import java.util.*;
public class Exer02 {

	public static void main(String[] args) {
		
		int op;
		Scanner scannear = new Scanner(System.in);
		
		
		do {
			
			System.out.printf("%s%n%s%n%s%n%s%n%s","Menu",
					"1 Dizer Olá",
					"2 - Mostrar data atual",
					"0 - Sair",
					"Digite a opção: ");
			op= scannear.nextInt();
			
			switch(op) {
			case 0:
				continue;
			case 1:
				System.out.println("\n\n Olá \n\n");
				break;
			case 2:
				System.out.println("\n\n Data atual \n\n");
				break;
			
			}
			

		} while (op != 0 );
		
		

	}

}
