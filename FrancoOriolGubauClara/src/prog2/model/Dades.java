package prog2.model;

import prog2.vista.MercatException;

import java.util.List;

public class Dades implements InDades{
    public void afegirArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException {

    }

    public List<String> recuperaArticles() {
        return null;
    }

    public void afegirClient(String email, String nom, String adreca, boolean esPremium) throws MercatException {

    }

    public List<String> recuperaClients() {
        return null;
    }

    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException {

    }

    public void esborrarComanda(int position) throws MercatException {

    }

    public List<String> recuperaComandes() {
        return null;
    }

    public List<String> recuperaComandesUrgents() {
        return null;
    }
}
