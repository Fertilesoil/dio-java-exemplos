package apps;

public class FacebookMessenger extends Mensageiro {

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }

    @Override
    protected void salvarHistorico() {
        System.out.println("Salvanco histórico de mensagens...");
    }
}
