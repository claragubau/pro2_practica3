package prog2.model;

import java.util.Date;

/**
 * Classe comanda urgent
 */
public class ComandaUrgent extends Comanda {
    /**
     * Constuctor Comanda Urgent
     *
     * @param article     Article
     * @param client      Client
     * @param quantitat   int
     * @param dataComanda Date
     */
    public ComandaUrgent(Article article, Client client, int quantitat, Date dataComanda) {
        super(article, client, quantitat, dataComanda);
    }

    /**
     * Mètode per saber de quin tipus és la comanda
     * @return String
     */
    public String tipusComanda() {
        return "Urgent";
    }

    /**
     * Mètode per saber si la comanda ha estat enviada
     * @return boolean
     */
    public boolean comandaEnviada() {
        return false;
    }

    /**
     * Mètode per saber si la comanda ha estat rebuda
     * @return boolean
     */
    public boolean comandaRebuda() {
        return false;
    }

    /**
     * Mètode per saber el preu de l'enviament
     * @return float
     */
    public float preuEnviament() {
        return 4 * (1 - client.descompteEnv());
    }
}
