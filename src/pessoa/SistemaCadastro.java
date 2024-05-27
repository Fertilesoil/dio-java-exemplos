package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos Bule", "000-000-000-00");

        marcos.setEndereco("Rua Boa sorte, nº13");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}
