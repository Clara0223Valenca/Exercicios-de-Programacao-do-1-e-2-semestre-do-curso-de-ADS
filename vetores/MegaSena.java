package vetores;
//13. Crie um vetor A contendo 6 números com o gabarito da Mega Sena. A seguir, crie um vetor B que receba 10 números de uma aposta, 
//informados pelo usuário. Escrever quantos números o apostador acertou.
import java.util.Scanner;
public class MegaSena {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] gab = {22,34,55,18,42,9};
		int[] aposta = new int[10];
		int acertos =0;
		
		
		for(int i=0; i < 10; i++) {
			System.out.print("Digite o número da sua aposta");
			aposta[i] = scanner.nextInt();
		}
		
		for (int i= 0; i< 10; i++) {
			
			for (int j=0; j < 6; j++) {
				
				if(aposta[i] == gab[j]) 
					acertos++;
				
			}
		}
		
	    System.out.println("Total de acertos " + acertos);
		//for externo só intera quando o for mais interno fazer todas as repetições
	    scanner.close();

	}

}
