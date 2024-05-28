package apps;

public class MSNMessenger extends Mensageiro{

    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }

    @Override
    protected void salvarHistorico() {
        System.out.println("Salvanco histórico de mensagens...");
    }
}

