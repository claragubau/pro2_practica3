package prog2.model;

/**
 * Classe Client Estandard
 */
public class ClientEstandard extends Client{

    /**
     * Constructor Client Estandard
     * @param correuElectronic String correu electrònic
     * @param nom String nom
     * @param correuPostal String correu postal
     */
    public ClientEstandard(String correuElectronic, String nom, String correuPostal) {
        super(correuElectronic, nom, correuPostal);
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
