package prog2.model;

/**
 * Classe Client Premium
 */
public class ClientPremium extends Client{

    /**
     * Constructor Client Premium
     * @param correuElectronic String correu electrònic
     * @param nom String nom
     * @param correuPostal String correu postal
     */
    public ClientPremium(String correuElectronic, String nom, String correuPostal) {
        super(correuElectronic, nom, correuPostal);
    }

    /**
     * Mètode per determinar el tipus de client
     * @return String tipus
     */
    public String tipusClient() {
        return "Premium";
    }

    /**
     * Mètode per calcular la mensualitat
     * @return float mensualitat
     */
    public float calMensual() {
        return 0;
    }

    /**
     * Mêtode per calcular el descompte de l'enviament
     * @return float amb el descompte
     */
    public float descompteEnv() {
        return 0.2F;
    }
}
