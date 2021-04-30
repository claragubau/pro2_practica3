package prog2.vista;

/**
 * Classe MercatException
 */
public class MercatException extends Throwable { /*Throwable -> Exception*/
    
    public MercatException(){
    }
    
    public MercatException (String missatge){
        super(missatge);
    }
}
