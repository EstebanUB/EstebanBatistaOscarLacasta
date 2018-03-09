package BatistaEstebanLacastaOscar.util;

public class Constants {
    /**
     *  Menus:
     */
    public enum MainOptions {ADD, REMOVE, OPEN, EXIT}
    public static final int N_MAINOPTIONS = MainOptions.values().length;
    public static final String[] STRINGS_MAINOPTIONS = {"Afegir fitxer multimèdia:",
            "Eliminar fitxer multimèdia:", "Mostrar carpeta", "Sortir"};

    //TODO: añadir submenus

    /**
     *  Títulos:
     */
    public enum Titles{MAINMENU}
    private static final String[] STRINGS_TITLES = {"Menu Principal"};

    /**
     *  Mensajes:
     */
    public enum Messages{GOODBYE}
    private static final String[] STRINGS_MESSAGES = {"Fins aviat!"};

    public static String getMessage(Messages msg){
        return STRINGS_MESSAGES[msg.ordinal()];
    }

    public static String getTitle(Titles tlt){
        return STRINGS_TITLES[tlt.ordinal()];
    }
}
