package prog2.model;

import java.util.Date;

/**
 * Classe abstracta comanda
 */
public abstract class Comanda {
    private Article article;
    private Client client;
    private int quantitat;
    private Date data;

    /**
     * Constuctor classe abstracta Comanda
     * @param article Article
     * @param client Client
     * @param quantitat int
     */
    public Comanda(Article article, Client client, int quantitat, Date data) {
        this.article = article;
        this.client = client;
        this.quantitat = quantitat;
        this.data = new Date();
    }


    /**
     * Getter article
     * @return Article
     */
    public Article getArticle() {
        return article;
    }

    /**
     * Setter article
     * @param article Article
     */
    public void setArticle(Article article) {
        this.article = article;
    }

    /**
     * Getter client
     * @return Client
     */
    public Client getClient() {
        return client;
    }

    /**
     * Setter client
     * @param client Client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Getter client
     * @return int
     */
    public int getQuantitat() {
        return quantitat;
    }

    /**
     * Setter quantitat
     * @param quantitat int
     */
    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }

    /**
     * Getter data
     * @return String
     */
    public Date getData() {
        return data;
    }

    /**
     * Setter data
     * @param data String
     */
    public void setData(Date data) {
        this.data = data;
    }
}
