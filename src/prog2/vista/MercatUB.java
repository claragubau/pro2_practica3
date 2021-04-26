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
                case M_Opcio_1_Gestio_Articles:
                    Menu<OpcionsMenuArticles> menuArticles = new Menu<>("Menu gestio articles",
                            OpcionsMenuArticles.values());

                    menuArticles.setDescripcions(descMenuArticles);
                    OpcionsMenuArticles opcioArticles;

                    do{
                        menuArticles.mostrarMenu();
                        opcioArticles = menuArticles.getOpcio(sc);
                        switch (opcioArticles){
                            case M_Opcio_1_Afegir_Article:
                                System.out.println("Identificador de l'article: ");
                                String idArticle = sc.nextLine();
                                System.out.println("Nom de l'article:");
                                String nomArticle = sc.nextLine();
                                System.out.println("Preu article: ");
                                float preuArticle = sc.nextFloat();
                                System.out.println("Temps d'enviament de l'article (en minuts): ");
                                int tempsArticle = sc.nextInt();
                                System.out.println("Es tracta d'un enviament urgent? (si/no) ");
                                String aux = sc.nextLine();
                                boolean enviamentUrgentArticle;
                                if(aux.equals("si")) {
                                    enviamentUrgentArticle = true;
                                }else{
                                    enviamentUrgentArticle = false;
                                }
                                try {
                                    controlador.afegirArticle(idArticle, nomArticle, preuArticle,
                                            tempsArticle, enviamentUrgentArticle);
                                }catch (MercatException e){
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case M_Opcio_2_Visualitzar_Article:
                                try{
                                    controlador.visualitzarArticle();
                                }catch (MercatException e){
                                    System.out.println(e.getMessage());
                                }
                                break;
                        }
                    }while(opcioArticles != OpcionsMenuArticles.M_Opcio_3_Sortir);
                    break;

                case M_Opcio_2_Gestio_Clients:
                    Menu<OpcionsMenuClients> menuClients = new Menu<>("Menu gestio clients",
                            OpcionsMenuClients.values());

                    menuClients.setDescripcions(descMenuClients);
                    OpcionsMenuClients opcioClients;

                    do{
                        menuClients.mostrarMenu();
                        opcioClients = menuClients.getOpcio(sc);
                        switch (opcioClients){
                            case M_Opcio_1_Afegir_Client:
                                System.out.println("Nom del client: ");
                                String nomClient = sc.next();
                                System.out.println("Correu electrònic del client: ");
                                String correuElectrClient = sc.nextLine();
                                System.out.println("Correu postal del client: ");
                                String correuPostalClient = sc.nextLine();

                                try{
                                    controlador.afegirClient(nomClient, correuElectrClient, correuPostalClient);
                                } catch (MercatException e){
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case M_Opcio_2_Visualitzar_Clients:
                                try {
                                    controlador.visualitzarClients();
                                } catch (MercatException e){
                                    System.out.println(e.getMessage());
                                }
                                break;
                        }
                    }while(opcioClients != OpcionsMenuClients.M_Opcio_3_Sortir);
                    break;

                case M_Opcio_3_Gestio_Comandes:
                    Menu<OpcionsMenuComandes> menuComandes = new Menu<>("Menu gestio comandes",
                            OpcionsMenuComandes.values());

                    menuComandes.setDescripcions(descMenuComandes);
                    OpcionsMenuComandes opcioComandes;

                    do{
                        menuComandes.mostrarMenu();
                        opcioComandes = menuComandes.getOpcio(sc);
                        switch (opcioComandes){
                            case M_Opcio_1_Afegir_Comanda:
                                System.out.println("afegir comanda");
                                break;
                            case M_Opcio_2_Esborrar_Comanda:
                                System.out.println("esborrar comanda");
                                break;
                            case M_Opcio_3_Visualitzar_Comanda:
                                try{
                                    controlador.visualitzarComandes();
                                }catch (MercatException e){
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case M_Opcio_4_Visualitzar_Comandes_Urgents:
                                try {
                                    controlador.visualitzarComandesUrgents();
                                } catch (MercatException e){
                                    System.out.println(e.getMessage());
                                }
                                break;
                        }
                    }while(opcioComandes != OpcionsMenuComandes.M_Opcio_5_Sortir);
                    break;

                case M_Opcio_4_Guardar_Dades:
                    System.out.println("guardar dades");
                    break;

                case M_Opcio_5_Carregar_Dades:
                    System.out.println("carregar dades");
                    break;
            }
        }while(opcioMenu != OpcionsMenu.M_Opcio_6_Sortir);

    }
}
