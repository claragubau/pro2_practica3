package prog2.model;

import prog2.vista.MercatException;
import java.io.Serializable;

/**
 * Classe Llista Clients
 */
public class LlistaClients extends Llista<Client> implements Serializable {

    /**
     * Mètode per afegir un client
     * @param client Client
     * @throws MercatException TODO
     */
    @Override
    public void afegir(Client client) throws MercatException {
        // comprovar que el correu electronic no estigui ja introduit
        llista.add(client);
    }
}
