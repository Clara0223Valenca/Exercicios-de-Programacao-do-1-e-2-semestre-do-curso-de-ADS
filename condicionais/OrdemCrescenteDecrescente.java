package condicionais;

/*14. Construa um algoritmo que receba como entrada três valores e os imprima em ordem crescente, e depois em ordem decrescente.*/
import java.util.*;

public class OrdemCrescenteDecrescente {

	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
		double a, b, c;
		String ordem;
		
		System.out.print("Você deseja ordenar os número em ordem crescente ou decrescente ?");
		ordem = scannear.nextLine();
		
		System.out.print("Digite o primeiro valor");
		a = scannear.nextDouble();
		
		System.out.print("Digite o segundo valor");
		b = scannear.nextDouble();
		
		System.out.print("Digite o terceiro valor");
		c = scannear.nextDouble();
		
		
		switch(ordem) {
			//ordem crescente
			case "crescente", "Crescente", "CRESCENTE":
				
				if(a < b && a < c ) {
					if (b < c) {
						System.out.printf("A ordem crescente é: %.2f; %.2f; %.2f", a, b, c );
					} else {
						System.out.printf("A ordem crescente é: %.2f; %.2f; %.2f", a, c, b );
					}
				}	
				
				if(b < a && b < c) {
					if(a < c) {
						System.out.printf("A ordem crescente é: %.2f; %.2f; %.2f", b, a, c );
					} else {
						System.out.printf("A ordem crescente é: %.2f; %.2f; %.2f", b, c, a );
					}
						
				} else {
					if(a < b) {
						System.out.printf("A ordem crescente é: %.2f; %.2f; %.2f", c, a, b );
					} else {
						System.out.printf("A ordem crescente é: %.2f; %.2f; %.2f", c, b, a );
					}
					
				}
				break;
				
			//ordem decrescente
			case "decrescente", "Decrescente", "DECRESCENTE" :
				
				if(a > b && a > c ) {
					if (b > c) {
						System.out.printf("A ordem decrescente é: %.2f; %.2f; %.2f", a, b, c );
					} else {
						System.out.printf("A ordem decrescente é: %.2f; %.2f; %.2f", a, c, b );
					}
				}	
				
				if(b > a && b > c) {
					if(a > c) {
						System.out.printf("A ordem decrescente é: %.2f; %.2f; %.2f", b, a, c );
					} else {
						System.out.printf("A ordem decrescente é: %.2f; %.2f; %.2f", b, c, a );
					}
						
				} else {
					if(a > b) {
						System.out.printf("A ordem decrescente é: %.2f; %.2f; %.2f", c, a, b );
					} else {
						System.out.printf("A ordem decrescente é: %.2f; %.2f; %.2f", c, b, a );
					}
					
				}
		}

	}

}

//a,b,c //a,c,b
//b,a,c //b,c,a 
//else c é maior , então testa a>b