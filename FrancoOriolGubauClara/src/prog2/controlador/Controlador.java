package prog2.controlador;

import prog2.model.Article;
import prog2.model.Client;
import prog2.vista.MercatException;

import java.util.Date;

/**
 * Classe Controlador
 */
public class Controlador {

    public void afegirArticle(String identificador, String nom, float preu,
                              int tempsEnviament, boolean enviamentUrgent) throws MercatException {

    }

    public String visualitzarArticle() throws MercatException{
        return "article";
    }

    public void afegirClient(String nom, String correuElectronic, String correuPostal) throws MercatException{

    }

    public String visualitzarClients() throws MercatException{
        return "llista clients";
    }

    public void afegirComanda(Article article, Client client, int quantitat, Date dataComanda) throws MercatException{

    }

    public String visualitzarComandes() throws MercatException{
        return "llista comandes realitzades";
    }

    public String visualitzarComandesUrgents() throws MercatException{
        return "llista comandes urgents";
    }




}
