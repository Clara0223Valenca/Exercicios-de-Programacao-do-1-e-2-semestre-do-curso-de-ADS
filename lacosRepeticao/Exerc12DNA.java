package lacosRepeticao;
/*12. Uma string é utilizada para representar uma das fitas de uma cadeia de DNA. Para tanto, as bases Adenina, Guanina, Citosina, Timina e Uracila são representadas pelas letras
 *  A, G, C, T e U, respectivamente. Deseja-se construir um programa que, dada uma sequência de DNA, é fornecida a sequência de RNA-m equivalente de acordo com a transformação indicada
 *   na Tabela 1.


Exemplo:
Dada a sequência de DNA: A T C C G T T A A
Será gerada uma sequência de RNA-m: U A G G C A A U U

DNA    RNA
A		U
G		C
C		G
T		A
*/
import java.util.*;
public class Exerc12DNA {

	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
		String dna, rna = "", charRna = "";
		int tamanho;
		
		System.out.print("Digite a cadeia de DNA com espaços: ");
		dna = scannear.nextLine();
		
		tamanho = dna.length();
		
		char[] sequencia = dna.toCharArray();
		
		for (int i=0; i<tamanho; i++) {
			
			if(sequencia[i] != ' ') {
				
				if(sequencia[i] == 'A') {
					charRna = "U " ;
				}
				if(sequencia[i] == 'G') {
					charRna = "C " ;
				}
				if(sequencia[i] == 'C') {
					charRna = "G " ;
				}
				if(sequencia[i] == 'T') {
					charRna = "A " ;
					
			}
				rna += charRna;
			}
		}
		
		System.out.println(rna);
		
	}

}
