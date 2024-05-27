public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
            System.out.println(e.getNomeMaiuculo());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;
        System.out.println();
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiuculo());
        System.out.println(eb.getIbge());
    }
}
