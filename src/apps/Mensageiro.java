package apps;

public abstract class Mensageiro {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected abstract void salvarHistorico();
    protected void validarConexaoInternet() {
        System.out.println("Validando conexão com a internet.");
    };
}
