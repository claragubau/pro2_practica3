package prog2.model;

import prog2.vista.MercatException;
import java.io.Serializable;

/**
 * Classe Llista Comandes
 */
public class LlistaComandes extends Llista<Comanda> implements Serializable {

    /**
     * Mètode per afegir una comanda
     * @param comanda Comanda
     */
    @Override
    public void afegir(Comanda comanda) {
        llista.add(comanda);
    }
}
