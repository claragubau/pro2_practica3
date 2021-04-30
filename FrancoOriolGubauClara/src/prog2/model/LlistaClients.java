package prog2.model;

import prog2.vista.MercatException;
import java.io.Serializable;
import java.util.Iterator;

/**
 * Classe Llista Clients
 */
public class LlistaClients extends Llista<Client> implements Serializable {

    /**
     * Mètode per afegir un client
     * @param client Client
     * @throws MercatException TODO
     */
    @Override
    public void afegir(Client client) throws MercatException {
        if (this.contains(client)){
            throw new MercatException("El email del client ja figura dins el registre.");
        }else{
            llista.add(client);
        }
    }
    
     /**
     * Mètode contains per comprovar si el id d'un article ja esta registrat
     * @param article
     * @return 
     */
    private boolean contains(Client client){
        Iterator<Client> iter = llista.iterator();
        while (iter.hasNext()) {
            Client client2 = iter.next();
            if((client2.getEmail()).equals(client.getEmail())){
                return true;
            }
        }
        return false;
    } 
}
