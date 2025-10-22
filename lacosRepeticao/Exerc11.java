package lacosRepeticao;
/*11. Ao observar a curva de velocidade de um motor, o engenheiro Zé percebeu que sempre ocorria uma queda quando as medidas eram feitas em intervalos de 10 ms. 
 * Mas esta queda acontecia em medidas diferentes a cada novo teste do motor. Zé ficou curioso com essa falta de padrão e quer saber, para cada teste do motor, qual
 *  a primeira medida em que ocorre uma queda de velocidade. O seu programa deverá receber do usuário o número de medidas de velocidade do motor e os valores representando 
 *  o número de RPM (rotações por minuto) de cada medida. Uma medida é considerada uma queda se é menor que a medida anterior. Mostre na tela a posição da medida em que houve
 *   a primeira queda de velocidade no teste. Caso não aconteça uma queda de velocidade a saída deve ser o número zero.
Ex.:
Número de medidas: 50
Medida 1: 100
Medida 2: 199
Medida 3: 199
Medida 4: 198
Medida 5: 0
Resultado: 4
*/

import java.util.*;
public class Exerc11 {

	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
		int qntMedidas, medAnterior, medAtual;
		int queda = 0;
					
		System.out.print("Digite o número de medidas de velocidade de motor");
		qntMedidas = scannear.nextInt();
		
		for(int i = 1; i <= qntMedidas; i++) {
			
			System.out.println("Medida " + i + ":");
			medAtual = scannear.nextInt();
			
			if(i == 1) {medAnterior = medAtual; }	
			
			if(medAtual < medAnterior && queda == 0) { queda = i ;}
			
			medAnterior = medAtual;
			
			
		}
		

	}

}
