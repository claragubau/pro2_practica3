package prog2.model;

import java.io.Serializable;

/**
 * Classe abstracta client
 */
public abstract class Client implements Serializable {
    private String email;
    private String nom;
    private String adreca;

    /**
     * Constructor Client Premium
     * @param email String correu electrònic
     * @param nom String nom
     * @param adreca String correu postal
     */
    protected Client(String nom, String email, String adreca) {
        this.email = email;
        this.nom = nom;
        this.adreca = adreca;
    }

    /**
     * Getter correu electronic
     * @return string amb el correu
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter correu electronic
     * @param email string
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter nom
     * @return String nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter nom
     * @param nom String
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter correu postal
     * @return String correu postal
     */
    public String getAdreca() {
        return adreca;
    }

    /**
     * Setter correu postal
     * @param adreca string
     */
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }
    
    /**
     * Mètode abstracte per determinar el tipus de client
     * @return String tipus
     */
    public abstract String tipusClient();

    /**
     * Mètode abstracte per calcular la mensualitat
     * @return float mensualitat
     */
    public abstract float calcMensual();

    /**
     * Mêtode abstracte per calcular el descompte de l'enviament
     * @return float amb el descompte
     */
    public abstract float descompteEnv();

    
    /**
     * Mètode toString per imprimir la informació d'un client
     * @return String amb la informació
     */
    @Override
    public String toString() {
        return "Tipus = " + tipusClient() + ", Email = " + getEmail() +
                ", Nom = " + getNom() + ", Adreça = " + getAdreca() +
                ", Descompte Enviament = " + descompteEnv()*100 + ", Mensualitat = " + calcMensual();
    }
}
