package vetores;

/*8. Crie um programa que leia as notas de uma turma de 10 alunos. Guarde-as em um vetor, calcule a média da turma e conte quantos alunos obtiveram nota acima desta média calculada. Escrever a média da turma e o resultado da contagem.  */
import java.util.*;


public class Exerc08 {
    public static void main(String[] args) {


        Scanner scannear =  new Scanner(System.in);


        double notaMedia = 0, acimaMedia = 0;


        double notas[] = new double[10];


        for(int i = 0; i < 10; i++){


            System.out.print("Digite a nota do " + (i + 1) + " aluno");
            notas[i] = scannear.nextDouble();


            notaMedia += notas[i];
        }


        notaMedia = notaMedia / 10;


        for (int i = 0; i < notas.length; i++) {


            if (notas[i] > (notaMedia) ) {
                acimaMedia++;
            }
        }
       
        System.out.println("A nota média da turma foi " + notaMedia + "\n E a quantidade de alunos acima da nota média foi: " + acimaMedia);
       
    scannear.close();
    }
   
}
