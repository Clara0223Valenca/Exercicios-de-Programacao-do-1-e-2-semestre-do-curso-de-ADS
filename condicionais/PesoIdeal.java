package condicionais;
/*8. Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um programa para calcular seu peso ideal, utilizando as
 seguintes fórmulas:
- para homens: 72,7 * altura – 58
- para mulheres: 62,1 * altura – 44,7
*/
import java.util.*;

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner scannear = new Scanner(System.in);
		
		char sexo;
		double altura;
		
		System.out.print("Digite 'f' para sexo feminino e 'm' para sexo masculino");
		sexo = scannear.next().charAt(0);
		
		System.out.print("Digite sua altura");
		altura = scannear.nextInt();
		 

	}

}
