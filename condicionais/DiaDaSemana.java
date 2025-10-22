package condicionais;
/*4. Construa um programa que lê um número de 1 a 7 e informa o dia da semana correspondente, sendo domingo o dia de número 1. 
 Se o dia não corresponder ao dia da semana, é mostrada uma mensagem de erro.*/
import java.util.*;

public class DiaDaSemana {

	public static void main(String[] args) {
		
		Scanner scannear =  new Scanner(System.in);
		int dia;
		
		System.out.print("Digite um dia da semana em numerais");
		dia = scannear.nextInt();
		
		/*if( dia == 1) {
			System.out.println("Domingo");
		} else if ( dia == 2){
			System.out.println("Segunda-feira");
		} else if ( dia == 3){
			System.out.println("Terça-feira");
		}else if ( dia == 4){
			System.out.println("Quarta-feira");
		}else if ( dia == 5){
			System.out.println("Quinta-feira");
		}else if ( dia == 6){
			System.out.println("Sexta-feira");
		}else if ( dia == 7){
			System.out.println("Sábado");
		} else {
			System.out.print("Dia inválido");
		}
		*/
		if (dia ==1 || dia ==7) {
			System.out.println("Final de semanda");
			
		}
		
		if (dia <= 2 && dia <=6 ) {
			System.out.println("Dia útil");
		}
		
		if(dia < 1 || dia >7 ) {
			System.out.println("Dia inválido");
		}

	}

}
