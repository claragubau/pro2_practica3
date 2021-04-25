package prog2.model;

import java.util.Date;

/**
 * Classe comanda urgent
 */
public class ComandaUrgent extends Comanda{
    /**
     * Constuctor Comanda Urgent
     * @param article Article
     * @param client Client
     * @param quantitat int
     * @param data String
     */
    public ComandaUrgent(Article article, Client client, int quantitat, Date data) {
        super(article, client, quantitat, data);
    }
}
