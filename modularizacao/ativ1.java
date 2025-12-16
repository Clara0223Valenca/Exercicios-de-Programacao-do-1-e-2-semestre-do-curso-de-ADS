package trabalho15dez;
import java.util.*;
/*
 Alunas; Márcia e Clara
 Turma: ADS
 Data: 15/12/25*/
public class ativ1 {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner (System.in);

		
		
		char letras[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
		
		int qtdade;

		System.out.print(" Quantas lâmpadas acenderam? ");
		qtdade = teclado.nextInt();
		
		int array[] = new int[qtdade];
		
		for(int i = 0; i < qtdade; i++) {
			
			System.out.print("A lâmpada que piscou em " + (i+1) + "° lugar: ");
			
			int temp = teclado.nextInt();
			
			
			
			array[i] = temp;
			
				
			
		}
		mensagem(array, letras, qtdade);
		
	}
	
		static void mensagem(int[] array, char[] letras, int qtdade) {
			
									
			String palavra = "";
			
			
			for(int i = 0; i < qtdade; i++) {
				
				int posicao = array [i] ;
				 
				
				palavra += letras[posicao - 1 ];
				
				
		
			}
			
			System.out.println(palavra);
			
			
	}
		

}
