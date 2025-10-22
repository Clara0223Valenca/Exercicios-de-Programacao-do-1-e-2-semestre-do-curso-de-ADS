package lacosRepeticao;
import java.util.*;
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
public class Exer12DNAprof {

	public static void main(String[] args) {
		
		Scanner scannear = new Scanner(System.in);32
		
		String base, fita = "";
		
		
			for(int i = 1; i <= 9; i++) {
				System.out.print("Digite a parte " + i + " da cadeia de dna" );
				base = scannear.nextLine();
				
				switch(base) {
				case "A","a":
					fita += "U ";
					break;
				case "G","g":
					fita += "C ";
					break;
				case "C","c":
					fita += "G ";
					break;
				case "T","t":
					fita += "A ";
					break;
				}
				
				
			}
			System.out.println(fita);

	}

}
