package BatistaEstebanLacastaOscar.vista;

import java.util.Scanner;

import edu.ub.prog2.utils.Menu;
import static BatistaEstebanLacastaOscar.util.Constants.*;

public class AplicacioUB1 {
    private Scanner sc;
    private Menu<MainOptions> mainMenu;

    AplicacioUB1(){
        sc = new Scanner(System.in);
        generateMainMenu();
    }

    public void gestioAplicacioUB1(){
        MainOptions opt;

        do{
            mainMenu.mostrarMenu();
            opt = mainMenu.getOpcio(sc);
            switch (opt){
                case ADD:
                    break;
                case REMOVE:
                    break;
                case OPEN:
                    break;
                case EXIT:
                    System.out.println(getMessage(Messages.GOODBYE));
            }
        }while (opt != MainOptions.EXIT);
    }

    private void generateMainMenu(){
        String[] menuDescriptor = new String[N_MAINOPTIONS];
        System.arraycopy(STRINGS_MAINOPTIONS, 0, menuDescriptor, 0, N_MAINOPTIONS);
        mainMenu = new Menu<>(getTitle(Titles.MAINMENU), MainOptions.values());
        mainMenu.setDescripcions(menuDescriptor);
    }
}
