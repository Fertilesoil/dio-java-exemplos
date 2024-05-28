import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.Mensageiro;
import apps.Telegram;

import java.util.Scanner;

public class Mensagens {
    public static void main(String[] args) {

        Mensageiro mensageiro = null;

        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha seu serviço de mensagens: ");

        String appEscolhido = scan.nextLine();

        if (appEscolhido.equals("msn")) {
            mensageiro = new MSNMessenger();
        } else if (appEscolhido.equals("facebook")) {
            mensageiro = new FacebookMessenger();
        } else if (appEscolhido.equals("telegram")) {
            mensageiro = new Telegram();
        }

        if (mensageiro != null) {
            mensageiro.enviarMensagem();
            mensageiro.receberMensagem();
        }
    }
}
