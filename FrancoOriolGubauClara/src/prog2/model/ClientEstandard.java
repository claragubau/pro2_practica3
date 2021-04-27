package prog2.model;

/**
 * Classe Client Estandard
 */
public class ClientEstandard extends Client{

    /**
     * Constructor Client Premium
     * @param correuElectronic String correu electrònic
     * @param nom String nom
     * @param correuPostal String correu postal
     */
    public ClientEstandard(String nom, String correuElectronic, String correuPostal) {
        super(nom, correuElectronic, correuPostal);
    }

    /**
     * Mètode per determinar el tipus de client
     * @return String tipus
     */
    public String tipusClient() {
        return "Estandard";
    }

    /**
     * Mètode per calcular la mensualitat
     * @return float mensualitat
     */
    public float calMensual() {
        return 4;
    }

    /**
     * Mêtode per calcular el descompte de l'enviament
     * @return float amb el descompte
     */
    public float descompteEnv() {
        return 0;
    }
}
