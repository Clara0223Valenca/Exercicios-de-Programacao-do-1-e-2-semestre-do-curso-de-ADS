package modularizacao;

/*● Ataque Aéreo vs. Pedra: Neste caso, o jogador com o Ataque Aéreo derrota
o jogador com a Pedra, por razões óbvias.
  ● Pedra vs. Papel: Neste caso, o jogador com a Pedra derrota o com Papel,
porque a Pedra machuca muito mais.
  ● Papel vs. Ataque Aéreo: Aqui o Ataque Aéreo ganha, porque Ataque Aéreo
sempre ganha e o Papel é patético.
  ● Papel vs. Papel: Nesta variação, ambos os jogadores ganham, porque o
Papel é inútil e ninguém que enfrenta o Papel pode perder.
  ● Pedra vs. Pedra: Para este caso não há ganhador, porque depende do que
os jogadores decidem fazer com a Pedra e normalmente não fazem nada.
  ● Ataque Aéreo vs. Ataque Aéreo: Quando isto acontece, todos os jogadores
perdem, devido a Aniquilação Mútua.
  25/11/2025 */


import java.util.*;

public class PedraPapel {


    public static void main(String[] args) {


        int jogadas;
        String jog1, jog2;
        int i  = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de jogadas ");
        jogadas = scanner.nextInt();


        System.out.println("Cada jogador pode optar por pedra, papel ou ataque: ");

        String descarte = scanner.nextLine();

        while (i <= jogadas) {
            
            System.out.println((i) + "º jogada");

            System.out.println("Digite a opção do 1º jogador");
            jog1 = scanner.nextLine();


            System.out.println("Digite a opção do 2º jogador");
            jog2 = scanner.nextLine();


            //Para todos que tem alguma opção "ataque"
            if (jog1.equalsIgnoreCase("ataque") || jog2.equalsIgnoreCase("ataque") ) {


                if (jog1.equalsIgnoreCase(jog2)) {


                    ataqueAtaque(jog1, jog2);
                } else {

                    ataque(jog1, jog2);
                }
            }

            //Quando for pedra/pedra ou papel/papel
            if (jog1.equalsIgnoreCase(jog2) && !jog1.equalsIgnoreCase("ataque")) {
            
                if (jog1.equalsIgnoreCase("papel")) papelPapel(jog1, jog2);
            
                if (jog1.equalsIgnoreCase("pedra")) pedraPedra(jog1, jog2);
        
            }

            if (jog1.equalsIgnoreCase("pedra") && jog2.equalsIgnoreCase("papel") || jog1.equalsIgnoreCase("papel") && jog2.equalsIgnoreCase("pedra")) {
            
                pedraPapel(jog1, jog2);
            }
            
            i++;
        }

    } // Fim do main


    // Quando uma das opções for 'ataque'
    static void ataque(String jog1, String jog2) {
        String resultado;


        if (jog1.equalsIgnoreCase("ataque")) {

            resultado = "Jogador 1 venceu";
        } else {

            resultado = "Jogador 2 venceu";
        }

        System.out.println(resultado);
    }

    // PEDRA X PAPEL
    static void pedraPapel(String jog1, String jog2) {

        String resultado;

        if (jog1.equalsIgnoreCase("pedra")) {

            resultado = "Jogador 1 venceu";
        } else {

            resultado = "Jogador 2 venceu";
        }

         System.out.println(resultado);
    }

    // PAPEL X PAPEL
    static void papelPapel(String jog1, String jog2) {

       System.out.println("Ambos venceram");
    }

    // PEDRA X PEDRA
    static void pedraPedra(String jog1, String jog2) {

        System.out.println("Sem ganhador");
    }

    // ATAQUE X ATAQUE 
    static void ataqueAtaque(String jog1, String jog2) {

       System.out.println("Aniquilação mútua");
    }

}

