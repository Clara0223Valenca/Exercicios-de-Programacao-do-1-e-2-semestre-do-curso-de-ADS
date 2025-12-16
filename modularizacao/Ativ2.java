package trabalho15dez;
import java.util.*;
/*
Alunas; Márcia e Clara
Turma: ADS
Data: 15/12/25*/

public class Ativ2 {

	public static void main(String[] args) {

		Scanner teclado= new Scanner (System.in);
		
		System.out.print(" Qual a quantidade de lesmas no grupo: ");
		int qntd = teclado.nextInt();
		
		int lesmas[] = new int[qntd];
		
		for(int i = 0; i < qntd; i++) {
			
			System.out.println("Qual a velocidade da lesma: " + (i+1) );
			
			lesmas[i] = teclado.nextInt();
		}
		
		int rapida = 0;
		int temp = 0;
		
		String nivel = "";
		
		for(int i = 0; i < qntd; i++) {
			
			if(lesmas[i] > rapida) {
				temp = i;
				rapida = lesmas[i];
				
			}
		}
		
		if (lesmas[temp] < 10) {
			nivel = "Nivel 1";
		}
		
		if (lesmas[temp] >= 10 && lesmas[temp] < 20) {
			nivel = "Nivel 2";
		}
		
		if (lesmas[temp] >= 20) {
			nivel ="Nivel 3";
		}
		
		System.out.println("A lesma mais veloz esta no " + nivel);
		
		
	}
}
