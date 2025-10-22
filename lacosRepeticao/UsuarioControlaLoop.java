package lacosRepeticao;
// Execício de revisão
// Usuário controla quando vai sair do laço de repetição
// 21/10/2025

import java.util.*;

public class UsuarioControlaLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome;
		
		double idades[] = {1,5, 1,2};
		for( double idade : idades) {
			System.out.println(idade);
		}
		
		//while
		while(true) {
			
			System.out.println("digite um nome:");
			nome = sc.nextLine();
			
			if(nome.equals("sair"))
				break;
			
			System.out.println("Você digitou "+ nome);
				
		}
		
		//do while
		int i = 1;
		do {
			
			System.out.println(i);
			
			i++;
		} while (i <= 5);
		
		
		System.out.println("\n"); //espaço
		
		//for
		for( int j = 1; j <= 5; j ++) {
			if( j == 3 )
				continue;
			System.out.println(j);
			
		}
		
		
		 /*
							 	     |		 
								I    |  Tela
								     |
							-------------------------------------> x 
								     |
								 1/  |   1
							     2/  |   2  
								 3/  |   
								 4/  |   4
								 5/  |   5
								 6   |
							         |      
								     |
								     |
		  */
		
	}

}
