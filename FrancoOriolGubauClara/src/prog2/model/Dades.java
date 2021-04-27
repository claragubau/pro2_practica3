package prog2.model;

import prog2.vista.MercatException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe Dades
 */
public class Dades implements InDades{
    Llista<Article> llistaArticles;
    Llista<Client> llistaClients;
    Llista<Comanda> llistaComandes;

    public Dades() {
        this.llistaArticles = new LlistaArticles();
        this.llistaComandes = new LlistaComandes();
        this.llistaClients = new LlistaClients();
    }

    /**
     * Mètode per afegir articles
     * @param id String
     * @param nom String
     * @param preu float
     * @param temps int
     * @param admetUrgent boolean
     * @throws MercatException TODO
     */
    public void afegirArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException {
        Article article = new Article(id, nom, preu, temps, admetUrgent);
        llistaArticles.afegir(article);
    }

    /**
     * Mètode per recuperar articles
     * @return List<String>
     */
    public List<String> recuperaArticles() {
        List<String> resultat = new ArrayList<>();
        Iterator it = llistaArticles.llista.iterator();
        System.out.print(llistaArticles.llista.getClass().getSimpleName());
/*        while(it.hasNext()){
            resultat.add(it.toString());
        }*/
        return resultat;
    }

    /**
     * Mètode per afegir un client
     * @param email String
     * @param nom String
     * @param adreca String
     * @param esPremium boolean
     * @throws MercatException TODO
     */
    public void afegirClient(String email, String nom, String adreca, boolean esPremium) throws MercatException {
        if(esPremium){
            ClientPremium clientPremium = new ClientPremium(nom, email, adreca);
            llistaClients.afegir(clientPremium);
        }else{
            ClientEstandard clientEs = new ClientEstandard(nom, email, adreca);
            llistaClients.afegir(clientEs);
        }
    }

    /**
     * Mètode per recuperar clients
     * @return List<String>
     */
    public List<String> recuperaClients() {
        List<String> resultat = new ArrayList<>();
        System.out.println("dades" + llistaClients.llista.toString());
/*        Iterator it = llistaClients.llista.iterator();
        while(it.hasNext()){
            resultat.add(it.toString());
        }*/
        return resultat;
    }

    /**
     * Mètode per afegir una comanda
     * @param articlePos int
     * @param clientPos int
     * @param quantitat int
     * @param esUrgent boolean
     * @throws MercatException TODO
     */
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException {

    }

    /**
     * Mètode per esborrar una comanda
     * @param position posició de la comanada
     * @throws MercatException TODO
     */
    public void esborrarComanda(int position) throws MercatException {
        Comanda comanda = llistaComandes.getAt(position);
        llistaComandes.esborrar(comanda);
    }

    /**
     * Mètode per recuperar una comanda
     * @return List<String>
     */
    public List<String> recuperaComandes() {
        return null;
    }

    /**
     * Mètode per recuperar les comandes urgents
     * @return List<String>
     */
    public List<String> recuperaComandesUrgents() {
        return null;
    }
}
