package prog2.model;

/**
 * Classe Article
 */
public class Article {
    private String identificador;
    private String nom;
    private float preu;
    private int tempsEnviament;

    /**
     * Constructor classe Article
     * @param identificador codi identficador
     * @param nom String nom de l'article
     * @param preu float preu
     * @param tempsEnviament int temps enviament
     */
    public Article(String identificador, String nom, float preu, int tempsEnviament) {
        this.identificador = identificador;
        this.nom = nom;
        this.preu = preu;
        this.tempsEnviament = tempsEnviament;
    }

    @Override
    public String toString() {
        return "Id=" + getIdentificador() + ", Nom=" + getNom() + ", Preu="
                + getPreu() + ", Temps fins enviament =" +
                ", Enviament Urgent=";
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
}
