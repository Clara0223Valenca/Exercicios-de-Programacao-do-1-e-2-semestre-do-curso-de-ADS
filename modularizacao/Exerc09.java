/*9. Faça um programa para imprimir:
    1
    1   2
    1   2   3
    .....
    1   2   3   ...  n
Dado um valor n informado pelo usuário. Escreva um método que receba um valor n e imprima até a n-ésima linha.
 09/12/25 */

import java.util.*;

public class Exerc09 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Até qual valor seu triângulo de números vai : ");
        int num = scanner.nextInt();

        cascataNum(num);

    }

    static void cascataNum (int num) {

        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j <= i; j++) {

                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }
}