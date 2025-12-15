/*12. Crie um método que receba um número de 1 a 20 e retorne sua forma por extenso (ex: 1 → "um"). 
09/12/25 */

import java.util.*;

public class Exerc12 {

    public static void main(String[] args) {
    
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = scanner.nextInt();

        extenso(num);

    }
    
   static void extenso(int num){

        String[] array =  {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" , "vinte"};


        System.out.println(array[(num-1)]);

   }



}
