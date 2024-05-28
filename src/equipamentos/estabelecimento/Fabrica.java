package equipamentos.estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora press = em;
        Digitalizadora digital = em;
        Copiadora copy = em;

        press.imprimir();
        digital.digitalizar();
        copy.copiar();

//        Deskjet em = new Deskjet();
//
//        Impressora press = em;
//        Digitalizadora digital = em;
//        Copiadora copy = em;
//
//        press.imprimir();
//        digital.digitalizar();
//        copy.copiar();
    }
}
