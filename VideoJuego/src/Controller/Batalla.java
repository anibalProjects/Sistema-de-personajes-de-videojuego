package Controller;

import java.util.Scanner;
import Model.Personaje;
import Model.Magicos.GolemsHechizero;

public class Batalla {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        GolemsHechizero Golem = new GolemsHechizero(0);

        Juego juego = new Juego();
        System.out.println("----- ELECCION PERSONAJE 1 -----");
        juego.listarPersonajes();
        System.out.print("\nEleccion: ");
        int eleccion = scanner.nextInt();
        System.out.println("----- ELECCION PERSONAJE 2 -----");
        juego.listarPersonajes();
        System.out.print("\nEleccion: ");
        int eleccion2 = scanner.nextInt();

        Personaje personaje1 = juego.eleccion(eleccion);
        Personaje personaje2 = juego.eleccion(eleccion2);
        juego.inicializarControlladores(personaje1, personaje2, Golem);
        juego.inicializarControlladores(personaje2, personaje1, Golem);

        do {
            juego.mostrarAcciones(personaje1, personaje2);
            juego.mostrarAcciones(personaje2, personaje1);
        } while (personaje1.getSalud() > 0 && personaje2.getSalud() > 0);



        if (personaje1.getSalud() > 0) {
            System.out.println("\n¡El ganador es: " + personaje1.getNombre() + "!");
        } else if (personaje2.getSalud() > 0) {
            System.out.println("\n¡El ganador es: " + personaje2.getNombre() + "!");
        }

        scanner.close();
    }
}