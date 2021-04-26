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
     * @throws MercatException TODO
     */
    @Override
    public void afegir(Comanda comanda) throws MercatException {
        // no es pot afegir cap ComandaUrgent si l'article que s'ha d'enviar no admet enviament urgent
        llista.add(comanda);
    }
}
