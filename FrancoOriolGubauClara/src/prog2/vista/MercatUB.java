package prog2.vista;

import prog2.controlador.Controlador;

import java.util.Scanner;

/**
 * Classe Mercat UB
 */
public class MercatUB {
    Controlador controlador;

    public MercatUB(){
        this.controlador = new Controlador();
    }

    public void gestioMercatUB() {
        // Creem un objecte per llegir l'input des del teclat
        Scanner sc = new Scanner(System.in);
        // Cridem a la funció que gestiona el menú
        try {
            gestioMenu(sc);
        } catch (MercatException e) {
            e.printStackTrace();
        }
    }

    private enum OpcionsMenu{
        M_Opcio_1_Gestio_Articles,
        M_Opcio_2_Gestio_Clients,
        M_Opcio_3_Gestio_Comandes,
        M_Opcio_4_Guardar_Dades,
        M_Opcio_5_Carregar_Dades,
        M_Opcio_6_Sortir
    }

    private static final String[] descMenu={
            "Gestionar articles",
            "Gestionar clients",
            "Gestionar comandes",
            "Guardar dades",
            "Carregar dades",
            "Sortir"
    };

    private enum OpcionsMenuArticles{
        M_Opcio_1_Afegir_Article,
        M_Opcio_2_Visualitzar_Article,
        M_Opcio_3_Sortir
    }

    private static final String[] descMenuArticles={
            "Afegir article",
            "Visualitzar article",
            "Tornar al menú principal"
    };

    private enum OpcionsMenuClients{
        M_Opcio_1_Afegir_Client,
        M_Opcio_2_Visualitzar_Clients,
        M_Opcio_3_Sortir
    }

    private static final String[] descMenuClients={
            "Afegir client",
            "Visualitzar clients",
            "Tornar al menú principal"
    };

    private enum OpcionsMenuComandes{
        M_Opcio_1_Afegir_Comanda,
        M_Opcio_2_Esborrar_Comanda,
        M_Opcio_3_Visualitzar_Comanda,
        M_Opcio_4_Visualitzar_Comandes_Urgents,
        M_Opcio_5_Sortir
    }

    private static final String[] descMenuComandes={
            "Afegir comanda",
            "Esborrar comanda",
            "Visualitzar comanda",
            "Visualitzar comandes urgents",
            "Tornar al menú principal"
    };

    /**
     * Mètode que implementa el menú d'opcions i la lògica de l'aplicació
     */
    private void gestioMenu(Scanner sc) throws MercatException{
        Menu<OpcionsMenu> menuMercat = new Menu<>("Menu del mercat", OpcionsMenu.values());

        menuMercat.setDescripcions(descMenu);
        OpcionsMenu opcioMenu;

        do{
            menuMercat.mostrarMenu();
            opcioMenu = menuMercat.getOpcio(sc);

            switch (opcioMenu){

            }
        }while(opcioMenu != OpcionsMenu.M_Opcio_6_Sortir);

    }
}
