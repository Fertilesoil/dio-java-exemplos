package carro;

public class Autodromo {
    public static void main(String[] args) {
        Carro ford = new Carro();
        ford.ligar();

        Moto harley = new Moto();
        harley.setChassi("9087-0");
        System.out.println(harley.getChassi());
        harley.ligar();
    }

}
