package carro;

public class Carro extends Veiculo {
    public void ligar() {
        confereCombustivel();
        conferirCambio();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }

    private void conferirCambio() {
        System.out.println("Conferindo cambio em p");
    }

}
