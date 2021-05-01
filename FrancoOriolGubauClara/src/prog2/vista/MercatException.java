package prog2.vista;

/**
 * Classe MercatException
 */
public class MercatException extends Throwable { /*Throwable -> Exception*/
    
    /**
     * Constructor de MercatException que rep com a parametre el missatge de l'excepció
     * @param missatge 
     */
    public MercatException (String missatge){
        super(missatge);
    }
}
