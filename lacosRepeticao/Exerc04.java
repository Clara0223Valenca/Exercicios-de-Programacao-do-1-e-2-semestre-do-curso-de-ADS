package lacosRepeticao;
/*4. Peça ao usuário vários números positivos. O programa deve somar os valores até que o usuário digite um número negativo. Utilize while.
*/
import java.util.*;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
		
		double num, soma = 0;
		System.out.println("Digite números positivos para somar ou um número negativo para encerrar");
		System.out.print("Digite um número: ");
		num = scannear.nextDouble();
		
		while(num >= 0) {
			
			soma += num;
			
			System.out.print("Digite um número: ");
			num = scannear.nextDouble();
		}
		
		System.out.println("A soma total é: " + soma);

	}

}
