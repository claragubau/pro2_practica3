package prog2.model;

import prog2.vista.MercatException;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Classe Dades
 */
public class Dades implements InDades, Serializable{
    private Llista<Article> llistaArticles;
    private Llista<Client> llistaClients;
    private Llista<Comanda> llistaComandes;

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
    @Override
    public void afegirArticle(String id, String nom, float preu, int temps, boolean admetUrgent) throws MercatException {
        Article article = new Article(id, nom, preu, temps, admetUrgent);
        llistaArticles.afegir(article);
    }

    /**
     * Mètode per recuperar articles
     * @return List<String>
     * @throws prog2.vista.MercatException
     */
    @Override
    public List<String> recuperaArticles() throws MercatException{
        if (llistaArticles.isEmpty()){
            throw new MercatException("No hi ha cap article registrat.\n");
        }else{
            List<String> res = new ArrayList<>();
            Iterator it = llistaArticles.llista.iterator();
            int pos = 1;
            while(it.hasNext()){
                res.add("\n[" + String.valueOf(pos) + "]" + it.next().toString());
                pos++;
            }
            return res;
        }
    }

    /**
     * Mètode per afegir un client
     * @param email String
     * @param nom String
     * @param adreca String
     * @param esPremium boolean
     * @throws MercatException TODO
     */
    @Override
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
     * @throws prog2.vista.MercatException
     */
    @Override
    public List<String> recuperaClients() throws MercatException{
        if (llistaClients.isEmpty()){
            throw new MercatException("No hi ha cap client registrat.\n");
        }else{
            List<String> res = new ArrayList<>();
            Iterator it = llistaClients.llista.iterator();
            int pos = 1;
            while(it.hasNext()){
                res.add("\n[" + String.valueOf(pos) + "]" + it.next().toString());
                pos++;
            }
            return res;
        }
    }

    /**
     * Mètode per afegir una comanda
     * @param articlePos int
     * @param clientPos int
     * @param quantitat int
     * @param esUrgent boolean
     * @throws MercatException TODO
     */
    @Override
    public void afegirComanda(int articlePos, int clientPos, int quantitat, boolean esUrgent) throws MercatException {
        Article article = llistaArticles.getAt(articlePos);
        Client client = llistaClients.getAt(clientPos);
        Date date = new Date();
        if(esUrgent){
            if(article.isEnviamentUrgent()){
                ComandaUrgent comandaUr = new ComandaUrgent(article, client, quantitat, date);
                llistaComandes.afegir(comandaUr);
            }else{
                throw new MercatException("L'article solicitat no admet comandes urgents.\n");
            }
        }else{
            ComandaNormal comandaNormal = new ComandaNormal(article, client, quantitat, date);
            llistaComandes.afegir(comandaNormal);
        }

    }

    /**
     * Mètode per esborrar una comanda
     * @param position posició de la comanada
     * @throws MercatException TODO
     */
    @Override
    public void esborrarComanda(int position) throws MercatException {
        Comanda comanda = llistaComandes.getAt(position);
        llistaComandes.esborrar(comanda);
    }

    /**
     * Mètode per recuperar una comanda
     * @return List<String>
     * @throws prog2.vista.MercatException
     */
    @Override
    public List<String> recuperaComandes() throws MercatException{
        if (llistaComandes.isEmpty()){
            throw new MercatException("No hi ha cap comanda registrada.\n");
        }else{
            List<String> res = new ArrayList<>();
            int pos = 1;
            Iterator it = llistaComandes.llista.iterator();
            while(it.hasNext()){
                res.add("\n[" + String.valueOf(pos) + "]" + it.next().toString());
                pos++;
            }
            return res;
        }
    }

    /**
     * Mètode per recuperar les comandes urgents
     * @return List<String>
     * @throws prog2.vista.MercatException
     */
    @Override
    public List<String> recuperaComandesUrgents() throws MercatException{
        if(llistaComandes.isEmpty()){
            throw new MercatException("La llista de comandes és buida.\n");
        }else{
            List<String> res = new ArrayList<>();
            Iterator it = llistaComandes.llista.iterator();
            int pos = 1;
            while(it.hasNext()){
                Comanda cmd = (Comanda) it.next();
                if(cmd.tipusComanda().equals("Urgent")){
                    res.add("\n[" + String.valueOf(pos) + "]" + cmd.toString());
                    pos++;
                }
            }
            if (res.isEmpty()){
                throw new MercatException("No hi ha cap comanda urgent registrada.\n");
            }else{
                return res;
            }
        }
    }

    public void guardaDades(String camiDesti) throws MercatException, IOException {
        File fitxer = new File(camiDesti);
        FileOutputStream fout = new FileOutputStream(fitxer);

        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(this);
        oos.close();
        fout.close();
    }

    public static Dades carregaDades(String camiOrigen) throws MercatException, IOException, ClassNotFoundException {
        File fitxer = new File(camiOrigen);
        FileInputStream fin = new FileInputStream(fitxer);

        ObjectInputStream ois = new ObjectInputStream(fin);
        Dades dades = (Dades)ois.readObject();
        ois.close();
        fin.close();
        return dades;
    }
}
