package prog2.model;

import java.io.Serializable;

/**
 * Classe Article
 */
public class Article implements Serializable {
    private String identificador;
    private String nom;
    private float preu;
    private int tempsEnviament;
    private boolean enviamentUrgent;

    /**
     * Constructor classe Article
     * @param identificador codi identficador
     * @param nom String nom de l'article
     * @param preu float preu
     * @param tempsEnviament int temps enviament
     * @param enviamentUrgent boolea enviament urgent
     */
    public Article(String identificador, String nom, float preu, int tempsEnviament, boolean enviamentUrgent) {
        this.identificador = identificador;
        this.nom = nom;
        this.preu = preu;
        this.tempsEnviament = tempsEnviament;
        this.enviamentUrgent = enviamentUrgent;
    }

    /**
     * Getter identificador
     * @return string identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Setter identificaor
     * @param identificador string identificador
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
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
     * Getter preu
     * @return float preu
     */
    public float getPreu() {
        return preu;
    }

    /**
     * Setter preu
     * @param preu float
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }

    /**
     * Getter enviament
     * @return int temps enviament
     */
    public int getTempsEnviament() {
        return tempsEnviament;
    }

    /**
     * Setter temps enviament
     * @param tempsEnviament int
     */
    public void setTempsEnviament(int tempsEnviament) {
        this.tempsEnviament = tempsEnviament;
    }

    /**
     * Getter enviament urgent
     * @return boolean
     */
    public boolean isEnviamentUrgent() {
        return enviamentUrgent;
    }

    /**
     * Setter enviament urgent
     * @param enviamentUrgent boolean
     */
    public void setEnviamentUrgent(boolean enviamentUrgent) {
        this.enviamentUrgent = enviamentUrgent;
    }
    
    /**
     * Mètode per printar la informació de l'article
     * @return string amb la informació
     */
    @Override
    public String toString() {
        return "Id = " + getIdentificador() + ", Nom = " + getNom() + ", Preu = "
                + getPreu() + ", Temps fins enviament = " + getTempsEnviament() +
                ", Enviament Urgent = " + isEnviamentUrgent();
    }

}
