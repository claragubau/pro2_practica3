package prog2.model;

import prog2.vista.MercatException;
import java.io.Serializable;
import java.util.Iterator;

/**
 * Classe Llista Articles
 */
public class LlistaArticles extends Llista<Article> implements Serializable {

    /**
     * Mètode per afegir un article
     * @param article Article
     * @throws MercatException Si el identificador de l'article ja ha estat registrat
     */
    @Override
    public void afegir(Article article) throws MercatException {
        if (this.contains(article)){
            throw new MercatException("El Id ja ha estat registrat.\n");
        }else{
            llista.add(article);
        }
    }
    
    /**
     * Mètode contains per comprovar si el id d'un article ja esta registrat
     * @param article
     * @return 
     */
    private boolean contains(Article article){
        Iterator<Article> iter = llista.iterator();
        while (iter.hasNext()) {
            Article article2 = iter.next();
            if((article2.getIdentificador()).equals(article.getIdentificador())){
                return true;
            }
        }
        return false;
    } 
}
