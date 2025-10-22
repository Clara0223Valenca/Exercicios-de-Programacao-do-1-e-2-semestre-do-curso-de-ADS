package condicionais;
/*6. Um vendedor necessita de um programa que calcule o preço total devido por um cliente. O programa deve receber o código de um produto e a
 *  quantidade comprada e calcular o preço total, usando a tabela abaixo. 
 *  Mostrar uma mensagem no caso de código inválido.
Código Produto			Preço Unitário
 1001					 R$ 5,32
 1324					 R$ 6,45
 6548					 R$ 2,37
 987					 R$ 5,32
 7623					 R$ 6,45
*/
import java.util.*;

public class CalcPreco {

	public static void main(String[] args) {
		Scanner scannear =  new Scanner(System.in);
		int codigo, quantComprada, totalDevido;
		
		System.out.print("Digite o código do produto ");
		codigo = scannear.nextInt();
		
		System.out.print("Digite a quantidade comprada ");
		quantComprada = scannear.nextInt();
		
		if (codigo == 1001 || codigo == 987) {
			
			System.out.println("O valor devido é " + (5.32 * quantComprada) );
			
		} else if (codigo == 1324 || codigo == 7623) {
			
			System.out.println("O valor devido é " + (6.45 * quantComprada) );
			
		} else if (codigo == 6548) {
			
			System.out.println("O valor devido é " + (2.37 * quantComprada) );
			
		} else {
			
			System.out.println("Código inválido");
		}
		
		

	}

}
