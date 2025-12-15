/*11. Desenvolva um programa que receba um horário em formato 24 horas, lendo hora e minuto. Para o processamento crie um método que converta esse horário e retorne como 12 h com sufixo ‘A’ ou ‘P’ (AM/PM). Outro método deve exibir o resultado.
 09/12/25*/
import java.util.*;

public class Exerc11 {
    public static void main(String[] args) {

        String horas;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o hórario no formato hh:mm :");
        horas = scanner.nextLine();

        converteHorario(horas);
    }

    static void converteHorario (String horas){

        int convertido = 0;

        String[] corta = horas.split(":");
        int hora = Integer.parseInt(corta[0]);
        int minutos = Integer.parseInt(corta[1]);

        if (hora >= 13) {
            for (int i = 13; i <= hora; i++) {
            
            convertido++;
            
            }
        System.out.println(convertido + ":" + minutos + " PM");

        } else {

            System.out.println(horas + " AM");
        }
        
    }
}
