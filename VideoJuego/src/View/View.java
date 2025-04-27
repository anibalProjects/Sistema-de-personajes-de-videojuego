package View;

import java.util.Scanner;

import Controller.Juego;
import Model.Personaje;
import Model.Fisico.Arquero;

public class View {
    //Colores generales
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";


    private static Juego juego;

    public View() {
        this.juego = new Juego();
    }

    public static void flechaLanzada (Arquero arquero) {
        System.out.println(BG_BLUE + "Flecha lanzada por " + arquero.getNombre() + RESET);
        
    }

    public static void mostrarPersonajes () {
        System.out.println(juego.getPersonajes().size());
        for (Personaje personaje : juego.getPersonajes()) {
            System.out.println("---------------------------------");
            System.out.println(personaje);
        } 
    }

    public static int menuGeneral () {
        System.out.println("1- Ver personajes");
        System.out.println("2- Ver habilidades de los personajes");
        System.out.println("3- Empezar batalla");
        Scanner scanner = new Scanner(System.in);
        int eleccion = scanner.nextInt();
        return eleccion;
    }

    public static void menuGeneral2 (int eleccion) {
        switch (eleccion) {
            case 1:
                View.mostrarPersonajes();
                break;
            case 2: 
            default:
                break;
        }
    }
}
