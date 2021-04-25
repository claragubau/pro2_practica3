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
     * @param data String
     */
    public ComandaNormal(Article article, Client client, int quantitat, Date data) {
        super(article, client, quantitat, data);
    }
}
