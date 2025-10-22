package vetores;
/*9. Crie um programa onde um usuário deverá informar os dados de altura e sexo de 10 pessoas. Imprima na tela quantas pessoas são do sexo masculino e quantas pessoas são do sexo feminino
 * . Mostre também qual é a maior altura e se essa altura é de um homem ou uma mulher.*/


import java.util.*;


public class Exerc09 {


    public static void main(String[] args) {
       
        Scanner scannear = new Scanner(System.in);


        double altura[] = new double[10];
        String sexo[] =  new String[10];
        int fem = 0 , masc = 0;
        double maiorAlturaFem = 0.0, maiorAlturaMasc = 0.0;


        //preenche os arrays
        for (int i = 0; i < 10; i++) {


            System.out.println("Digite sua altura");
            altura[i] = scannear.nextDouble();


            //pegar enter do scanner acima
            String descarte = scannear.nextLine();


            System.out.println("Digite seu sexo (masc ou fem)");
            sexo[i] = scannear.nextLine();


        }


        //calcula quantas pessoas de cada sexo e guarda as maiores alturas
        for (int i = 0; i < 10; i++) {
           
            if (sexo[i].equalsIgnoreCase("fem")) {
                fem++;


                if (altura[i] > maiorAlturaFem){
                    maiorAlturaFem = altura[i];
                }


            } else if (sexo[i].equalsIgnoreCase("masc")) {
                masc++;


                if (altura[i] > maiorAlturaMasc){
                    maiorAlturaMasc = altura[i];
                }
            }
       
        }


        //printa quantidade
        System.out.println("Das 10 pessoas, " + fem + " são do sexo feminino e " + masc + " são do sexo masculino" );


        //
        if (maiorAlturaMasc > maiorAlturaFem) {


            System.out.println("\nQuem teve a maior altura foi um homem de " + maiorAlturaMasc + " m" );
        } else {
        	
            System.out.println("\nQuem teve a maior altura foi uma mulher de " + maiorAlturaFem + " m\n" );


        }
    scannear.close();    
    }
}



