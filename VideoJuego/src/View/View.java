package View;

import java.util.Scanner;

import Controller.Batalla;
import Controller.Juego;
import Model.Personaje;
import Model.Fisico.Arquero;
import Model.Fisico.Asesino;
import Model.Fisico.Guerrero;
import Model.Magicos.Hechicero;
import Model.Magicos.Mago;


public class View {
    // Colores generales
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

    public static void mostrarPersonajes() {
        System.out.println("Lista de personajes:");
        int numero = 1;
        for (Personaje personaje : juego.getPersonajes()) {
            System.out.println(numero + "- " + personaje);
            numero++;
        }
    }

    public static void mostrarHabilidades(int eleccion) {
        Personaje personaje = juego.eleccion(eleccion);
        System.out.println("\n--- Habilidades de " + personaje.getNombre() + " ---");
        if (personaje instanceof Arquero) {
            ViewPersonajes.habilidadesArquero();
        } else if (personaje instanceof Guerrero) {
            ViewPersonajes.habilidadesGuerrero();
        } else if (personaje instanceof Asesino) {
            ViewPersonajes.habilidadesAsesino();
        } else if (personaje instanceof Mago) {
            ViewPersonajes.habilidadesMago();
        } else if (personaje instanceof Hechicero) {
            ViewPersonajes.habilidadesHechizero();
        }
    }

    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1- Ver personajes y sus estadísticas");
            System.out.println("2- Ver habilidades de un personaje");
            System.out.println("3- Empezar batalla");
            System.out.println("4- Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    mostrarPersonajes();
                }
                case 2 -> {
                    mostrarPersonajes();
                    System.out.print("\nElige un personaje para ver sus habilidades (número): ");
                    int eleccion = scanner.nextInt();
                    mostrarHabilidades(eleccion);
                }
                case 3 -> {
                    Batalla batalla = new Batalla();
                    batalla.iniciar();
                }
                case 4 -> {
                    System.out.println("Saliendo del juego...");
                }
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}