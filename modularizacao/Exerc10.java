/*10. Faça um programa onde o usuário possa selecionar quais das opções ele gostaria de executar, recebendo a opção do usuário e os dados necessários em cada operação. Para cada opção, um método deverá ser implementado. 
 09/12/25    */

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        
        int opcao;
        double num1 = 0, num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu opções: \r\n" + //
                        "\t1. Verifique se um número é par ou ímpar \r\n" + //
                        "\t2. Multiplicar dois números \r\n" + //
                        "\t3. Dividir dois números \r\n" + //
                        "\t4. Raiz quadrada de um número \r\n" + //
                        "\t5. Elevar um número a uma potência.");

        opcao = scanner.nextInt();

        // 1 -> 1 4 
        switch (opcao) {
            case 1, 4:
                System.out.print("Digite o numeral para operação");
                num1 = scanner.nextDouble();
                break;
        
            case 2, 3, 5:
                System.out.print("Digite o primeiro numeral para a operação");
                num1 = scanner.nextDouble();

                System.out.print("Agora, digite o segundo numeral");
                num2 = scanner.nextDouble();
                break;
        
            default:
                System.out.println("Opção inválida");
                break;
        }


        if(opcao == 1) parImpar(num1);
        if(opcao == 2) System.out.print(multiplica(num1, num2));
        if(opcao == 3) System.out.print(divisao(num1, num2));
        if(opcao == 4) System.out.print(raiz(num1));
        if(opcao == 5) potencia(num1, num2);

        scanner.close();
    }

    //par ou ímpar
    static void parImpar (double num){
        String result;

        if (num % 2 == 0){

            result = "O número " + num + " é par";
        } else {

            result = "O número " + num + " é ímpar";
        }

        System.out.println(result);
    }

    //multiplicação
    static double multiplica (double num1, double num2){

        return num1 * num2;
    }

    // divisão
    static double divisao (double num1, double num2){

        return num1 / num2;
    }

    //radiciação
    static double raiz (double num){

        return Math.sqrt(num);
    }

    //potenciação 
    static void potencia (double num1, double num2){

        System.out.println(Math.pow(num1, num2));
    }

    
}
