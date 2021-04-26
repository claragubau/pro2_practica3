package prog2.controlador;

import prog2.model.*;
import prog2.vista.MercatException;

import java.util.Date;
import java.util.Iterator;

/**
 * Classe Controlador
 */
public class Controlador {
    LlistaArticles llistaArticles;
    LlistaClients llistaClients;
    LlistaComandes llistaComandes;

    public Controlador() {
        this.llistaArticles = new LlistaArticles();
        this.llistaComandes = new LlistaComandes();
        this.llistaClients = new LlistaClients();
    }

    /**
     * Mètode per afegir un article
     * @param id string
     * @param nom string
     * @param preu float
     * @param tempsEnviament int
     * @param enviamentUrgent boolean
     * @throws MercatException TODO
     */
    public void afegirArticle(String id, String nom, float preu,
                              int tempsEnviament, boolean enviamentUrgent) throws MercatException {
        Article article = new Article(id, nom, preu, tempsEnviament, enviamentUrgent);
        llistaArticles.afegir(article);
    }

    /**
     * Mètode per visualitzar la llista d'articles
     * @return string
     * @throws MercatException TODO
     */
    public String visualitzarArticle() throws MercatException{
        return llistaArticles.toString();
    }

    /**
     * Mètode per afegir un client
     * @param nom string
     * @param correuElectronic string
     * @param correuPostal string
     * @param tipus string
     * @throws MercatException TODO
     */
    public void afegirClient(String nom, String correuElectronic, String correuPostal, String tipus) throws MercatException{
        if(tipus.equals("estandard")){
            ClientEstandard clientEs = new ClientEstandard(nom, correuElectronic, correuPostal);
            llistaClients.afegir(clientEs);
        }else if(tipus.equals("premium")){
            ClientPremium clientPremium = new ClientPremium(nom, correuElectronic, correuPostal);
            llistaClients.afegir(clientPremium);
        }
    }

    /**
     * Mètode per visualitzar la llista de clients
     * @return string
     * @throws MercatException TODO
     */
    public String visualitzarClients() throws MercatException{
        return llistaClients.toString();
    }


    /**
     * Mètode per afegir una comanda
     * @param correuClient string
     * @param idArticle string
     * @param quantitat int
     * @param urgent boolean
     * @throws MercatException TODO
     */
    public void afegirComanda(String correuClient, String idArticle, int quantitat, boolean urgent) throws MercatException{
        // trobar el client amb el seu correu (no hi ha un mètode per fer-ho)
        // trobar l'article
        // TODO CANVIAR TOTS ELS ARTICLES I CLIENTS AQUESTS
        Article article = new Article("", "", 3, 600, false);
        Client client = new ClientEstandard(" ", " ", " ");
        Date date = new Date();
        if(urgent){
            ComandaUrgent comandaUrgent = new ComandaUrgent(article, client, quantitat, date);
        }else{
            ComandaNormal comandaNormal = new ComandaNormal(article, client, quantitat, date);
        }
    }

    /**
     * Mètode per visualitzar les comandes
     * @return string
     * @throws MercatException TODO
     */
    public String visualitzarComandes() throws MercatException{
        return llistaComandes.toString();
    }

    /**
     * Mètode per visualitzar les comandes urgents
     * @return string
     * @throws MercatException TODO
     */
    public String visualitzarComandesUrgents() throws MercatException{
        Iterator<Comanda> it = llistaComandes.getArrayList().iterator();
        String resultat = " ";
        while (it.hasNext()){
            Comanda comanda = it.next();
            if(comanda.tipusComanda().equals("Urgent")){
                resultat += comanda.toString();
            }
        }
        return resultat;
    }

    public void borrarComanda(Comanda comanda) {

        llistaComandes.esborrar(comanda);
    }
}
