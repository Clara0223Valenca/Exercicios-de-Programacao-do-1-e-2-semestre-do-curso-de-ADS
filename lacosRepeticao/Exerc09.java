package lacosRepeticao;
/*9. A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
 * Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem 
 * "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos 
 * times em uma nova partida, caso contrário deve ser encerrado imprimindo:
	- Quantos GRENAIS fizeram parte da estatística.
	- O número de vitórias do Inter.
	- O número de vitórias do Grêmio.
	- O número de Empates.
	- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Não houve vencedor", caso termine empatado).
*/
import java.util.*;
public class Exerc09 {

	public static void main(String[] args) {
		
		Scanner scannear =  new Scanner(System.in);
		
		int op = 0, golInter, golGremio;
		int partidas = 0, vGremio = 0, vInter = 0, empates = 0 ;
		
		while(op != 2) {
			System.out.println("Quantos gols Inter fez?");
			golInter =scannear.nextInt();
			System.out.println("Quantos gols grêmio fez?");
			golGremio =scannear.nextInt();
			System.out.println("\nNovo grenal (1-sim 2-não ");
			op = scannear.nextInt();
			
			
			partidas++; //num partidas
			if(golInter > golGremio) {vInter++;}
			if (golInter < golGremio) { vGremio++;}
			if (golInter == golGremio) { empates++;}
			
		}
		
		System.out.println("Grenais: " + partidas);
		System.out.println("Vitórias Inter: " + vInter);
		System.out.println("Vitórias grêmio: " + vGremio);
		System.out.println("Empates: " + empates);
		
		if(vInter > vGremio) {
			System.out.println("Inter ganhou mais grenais");
		} else if (vInter < vGremio) {
			System.out.println("Grêmio ganhou mais grenais");
		} else {
			System.out.println("Não houve vencedores");
		}
		
		

	}

}
