package prog2.model;

import java.util.Date;

/**
 * Classe Comanda normal
 */
public class ComandaNormal extends Comanda{

    /**
     * Constuctor Comanda Normal
     * @param article Article
     * @param client Client
     * @param quantitat int
     * @param dataComanda Date
     */

    public ComandaNormal(Article article, Client client, int quantitat, Date dataComanda) {
        super(article, client, quantitat, dataComanda);
    }

    /**
     * Mètode per saber de quin tipus és la comanda
     * @return String
     */
    public String tipusComanda() {
        return "Normal";
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
        return 0;
    }


}
