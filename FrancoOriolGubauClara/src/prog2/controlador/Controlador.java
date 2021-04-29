package prog2.controlador;

import prog2.model.*;
import prog2.vista.MercatException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * Classe Controlador
 */
public class Controlador {
    Dades dades = new Dades();

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
        dades.afegirArticle(id, nom, preu, tempsEnviament, enviamentUrgent);
    }

    /**
     * Mètode per visualitzar la llista d'articles
     * @return string
     * @throws MercatException TODO
     */
    public List<String> visualitzarArticle() throws MercatException{
        return dades.recuperaArticles();
    }

    /**
     * Mètode per afegir un client
     * @param nom string
     * @param email string
     * @param adreca string
     * @param esPremium boolean
     * @throws MercatException TODO
     */
    public void afegirClient(String nom, String email, String adreca, boolean esPremium) throws MercatException{
        dades.afegirClient(email, nom, adreca, esPremium);
    }

    /**
     * Mètode per visualitzar la llista de clients
     * @return string
     * @throws MercatException TODO
     */
    public List<String> visualitzarClients() throws MercatException{
        return dades.recuperaClients();
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
        dades.afegirComanda(articlePos-1, clientPos-1, quantitat, esUrgent);
    }

    /**
     * Mètode per visualitzar les comandes
     * @return list<string>
     * @throws MercatException TODO
     */
    public List<String> visualitzarComandes() throws MercatException{
        return dades.recuperaComandes();
    }

    /**
     * Mètode per visualitzar les comandes urgents
     * @return list<string>
     * @throws MercatException TODO
     */
    public List<String> visualitzarComandesUrgents() throws MercatException{
        return dades.recuperaComandesUrgents();
    }

    /**
     * Mètode per esborrar una comanda
     * @param position int posicio
     * @throws MercatException TODO
     */
    public void esborrarComanda(int position) throws MercatException {
        dades.esborrarComanda(position-1);
    }

    public void guardarMercat(String camiDesti) throws IOException, MercatException {
        dades.guardaDades(camiDesti);
    }

    public void carregarMercat(String camiOrigen) throws IOException, ClassNotFoundException, MercatException {
        dades = dades.carregaDades(camiOrigen);
    }
}
