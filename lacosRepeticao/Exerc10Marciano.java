package lacosRepeticao;

import java.util.*;

/*10. Um marciano chegou a uma floresta e se escondeu atrás de uma das 100 árvores quando viu um caçador. O caçador só tinha cinco balas em sua espingarda. Cada vez que ele 
 * atirava, e não acertava, é claro, o marciano dizia: estou mais à direita ou mais à esquerda. Se o caçador não conseguir acertar o marciano, ele será levado para marte.
 *  Utilize os comandos que já vimos para gerar aleatoriamente a escolha da árvore em que ele se escondeu. O jogo termina com o caçador vitorioso ao acertar o marciano ou 
 *  derrotado e levado à marte, dessa forma, exiba a mensagem correspondente ao final.
*/
public class Exerc10Marciano {

	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
		Random sorteia = new Random();
		int posicao = sorteia.nextInt(100) + 1; //sorteia de 1 a 100
		int chute;
		System.out.println("ele esta " + posicao);
		System.out.println("O caçador só tem 5 balas em sua espingarda\nO marciano está em uma das 100 árvores\nSe o caçador não acertar ele, vai ser levado para Marte\n");
		
		for(int i = 4; i >= 0 ; i--) {
			System.out.print("Em qual árvore será o tiro?");
			chute = scannear.nextInt();
			
				if(i==0 && chute != posicao) {
					System.out.println("Você NÃO conseguiu! Boa viagem até Marte companheiro...");
					break;
				} else if(chute < posicao ){
					System.out.println("Você errou, agora você tem " + i + " balas restantes\nDica do marciano: estou mais a direita");
				} else if(chute > posicao ){
					System.out.println("Você errou, agora você tem " + i + " balas restantes\nDica do marciano: estou mais a esquerda");
				} else if(chute == posicao){
					System.out.println("Parabéns, você acaba de caçar um marciano!!"); 
					break;
				} 
		} z
		

	}

}
