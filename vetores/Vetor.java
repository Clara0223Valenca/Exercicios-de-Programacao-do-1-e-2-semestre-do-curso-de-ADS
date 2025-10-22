package vetores;

public class Vetor {

	public static void main(String[] args) {
		//int idades[];
		//idades = new int[5];
	
		int idades[] = {42, 50, 11, 8, 2};
		
		//exibir na tela 
		for (int i = 0; i<5; i++) {
			System.out.println("Idade: " + idades[i]);
		}
		 
		/*int i = 0;
		while(i > 5) {
			System.out.println("Idade: " + idades[i]);
			i++;
		}
		
		idades[3] = 36 */
		
		//Percorre o array:
		
		for( int idade : idades) {
			System.out.println(idade);
		}
		
	}

}
