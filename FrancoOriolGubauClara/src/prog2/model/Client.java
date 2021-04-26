package prog2.model;

/**
 * Classe abstracta client
 */
public abstract class Client {
    private String correuElectronic;
    private String nom;
    private String correuPostal;

    /**
     * Constructor Client Premium
     * @param correuElectronic String correu electrònic
     * @param nom String nom
     * @param correuPostal String correu postal
     */
    protected Client(String nom, String correuElectronic, String correuPostal) {
        this.correuElectronic = correuElectronic;
        this.nom = nom;
        this.correuPostal = correuPostal;
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
    public abstract float calMensual();

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
        return "Tipus=" + tipusClient() + ", Email=" + getCorreuElectronic() +
                ", Nom=" + getNom() + ", Adreça=" + getCorreuPostal() +
                ", Descompte Enviament=" + descompteEnv() + ", Mensualitat=" + calMensual();
    }

    /**
     * Getter correu electronic
     * @return string amb el correu
     */
    public String getCorreuElectronic() {
        return correuElectronic;
    }

    /**
     * Setter correu electronic
     * @param correuElectronic string
     */
    public void setCorreuElectronic(String correuElectronic) {
        this.correuElectronic = correuElectronic;
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
    public String getCorreuPostal() {
        return correuPostal;
    }

    /**
     * Setter correu postal
     * @param correuPostal string
     */
    public void setCorreuPostal(String correuPostal) {
        this.correuPostal = correuPostal;
    }
}
