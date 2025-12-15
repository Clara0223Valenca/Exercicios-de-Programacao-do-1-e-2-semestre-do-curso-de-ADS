/* Entrada: consiste na leitura de três valores inteiros, que representam as
idades de Huguinho, Zezinho e Luisinho, respectivamente
   Saída: para cada execução do programa, imprima o nome do sobrinho do meio
conforme a ordem de entrada dos valores.
 02/12/2025 */

import java.util.*;

public class TioPatinhas {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] sobrinhos = new int[3];

        for(int i = 0; i < sobrinhos.length; i++){

            System.out.print("Informe a idade do " + (i+1) + "º sobrinho: ");
            sobrinhos[i] = scanner.nextInt();
         
        }

        meio(sobrinhos);
    }

    static void  meio(int[] sobrinhos) {
        String meio = "";

        int[] ordenado = Arrays.copyOf(sobrinhos, 3);
        //int[] ordenado = Arrays.sort(sobrinhos);
        Arrays.sort(ordenado);

        for (int i = 0; i < 3; i++) {
            
            if (sobrinhos[i] == ordenado[1]) {
                
                if(i == 0) meio = "Huguinho";
                if(i == 1) meio = "Zezinho";
                if(i == 2) meio = "Luisinho";
            }
        }
        
        System.out.println("O nome do sobrinho do meio é " + meio );
    }
}