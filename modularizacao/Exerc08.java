package modularizacao;

class Exerc08 {

	public static void main(String[] args) {
		
		int ano =1800, mes =1, dia =9;
		System.out.println("A mensagem é :" + validacao(ano, mes, dia));
	}

	/*8. Crie um método que receba três valores (ano, mês, dia) e verifique se é uma data válida. O ano deverá estar entre 1900 e o presente ano. Deverá retornar 
	 uma mensagem de válido ou inválido.
	 17/11/25 */
	
	static String validacao (int ano, int mes, int dia) {
		
		String valida = "";
		
		if (ano >= 1900 && ano <= 2025) {
			
			if( mes >= 1 && mes <= 12) {
				
				if( dia >= 1 && dia <= 31) {
					
					valida = "Válida";
				}
			}
		} else {
			
			valida = "Inválida";
		}
		
		return valida; 
	}


}
