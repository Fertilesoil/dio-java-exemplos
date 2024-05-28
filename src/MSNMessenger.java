public class MSNMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagens();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando conexão com a internet");
    }

    private void salvarHistoricoMensagens() {
        System.out.println("Salvando o historico de mensagens");
    }
}

