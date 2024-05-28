package apps;

public class Telegram extends Mensageiro{
    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo apps.Telegram");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo apps.Telegram");
    }

    @Override
    protected void salvarHistorico() {
        System.out.println("Salvanco histórico de mensagens...");
    }
}
