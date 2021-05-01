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
    @Override
    public String tipusComanda() {
        return "Normal";
    }

    /**
     * Mètode per saber si la comanda ha estat enviada
     * @return boolean
     */
    @Override
    public boolean comandaEnviada() {
        Date dataActual = new Date();
            return dataActual.getTime() - dataComanda.getTime() >= article.getTempsEnviament()*60*1000;
        }

    /**
     * Mètode per saber si la comanda ha estat rebuda
     * @return boolean
     */
    @Override
    public boolean comandaRebuda() {
        if(this.comandaEnviada()){
            Date dataActual = new Date();
            return dataActual.getTime() - dataComanda.getTime() >= article.getTempsEnviament()*60*1000 + 2*24*3600*1000;
        }else{
            return false;
        }
    }

    /**
     * Mètode per saber el preu de l'enviament
     * @return float
     */
    @Override
    public float preuEnviament() {
        return 1 * (1 - client.descompteEnv()/100);
    }


}
