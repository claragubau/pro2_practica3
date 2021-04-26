package prog2.model;

import java.util.Date;

/**
 * Classe abstracta comanda
 */
public abstract class Comanda {
    private Article article;
    private Client client;
    private int quantitat;
    private Date dataComanda;

    /**
     * Constuctor classe abstracta Comanda
     * @param article Article
     * @param client Client
     * @param quantitat int
     * @param dataComanda Date
     */
    protected Comanda(Article article, Client client, int quantitat, Date dataComanda) {
        this.article = article;
        this.client = client;
        this.quantitat = quantitat;
        this.dataComanda = new Date();
    }

    /**
     * Mètode per calcular el preu de la comanda
     * @return float
     */
    public float calcPreu(){
        return article.getPreu()*quantitat+preuEnviament();
    }

    /**
     * Mètode per saber de quin tipus és la comanda
     * @return String
     */
    public abstract String tipusComanda();

    /**
     * Mètode per saber si la comanda ha estat enviada
     * @return boolean
     */
    public abstract boolean comandaEnviada();

    /**
     * Mètode per saber si la comanda ha estat rebuda
     * @return boolean
     */
    public abstract boolean comandaRebuda();

    /**
     * Mètode per saber el preu de l'enviament
     * @return float
     */
    public abstract float preuEnviament();


    /**
     * Mètode toString per imprimir la informació d'una comanda
     * @return String amb la informació
     */
    @Override
    public String toString() {
        return "Tipus=" + tipusComanda() + ", Article=" + article.getNom() + ", Client=" +
                client.getNom() + ", Quantitat=" + getQuantitat() + ", Data de creació=" +
                getData() + ", Enviat=" + comandaEnviada() + ", Rebuda=" + comandaRebuda() +
                ", Preu Articles=" + calcPreu() + ", Preu Enviament=" + preuEnviament();
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
        return dataComanda;
    }

    /**
     * Setter data
     * @param data String
     */
    public void setData(Date data) {
        this.dataComanda = data;
    }
}
