package prog2.model;

import prog2.vista.MercatException;
import java.io.Serializable;

/**
 * Classe Llista Articles
 */
public class LlistaArticles extends Llista<Article> implements Serializable {

    /**
     * Mètode per afegir un article
     * @param article Article
     * @throws MercatException TODO
     */
    @Override
    public void afegir(Article article) throws MercatException {
        // comprovar que no hi hagi cap article amb aquell identificador
        llista.add(article);
    }
}
