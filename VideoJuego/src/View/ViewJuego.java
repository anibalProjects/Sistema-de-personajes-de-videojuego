package View;

import java.util.Scanner;

import Model.Personaje;
import Model.Fisico.Arquero;
import Model.Interfaz.Curable;
import Model.Interfaz.Defendible;
import Model.Interfaz.Magico;
import Model.Interfaz.Movilizable;
import Model.Interfaz.Volador;

public class ViewJuego extends View {
    public static void menuAcciones(Personaje jugador, Personaje enemigo) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTurno de " + jugador.getNombre());
        System.out.println("Elije una opción:");
        System.out.println("1- Atacar");

        int opcion = 2;

        if (jugador instanceof Defendible) {
            System.out.println(opcion++ + "- Defender");
        }
        if (jugador instanceof Volador) {
            System.out.println(opcion++ + "- Volar");
        }
        if (jugador instanceof Magico) {
            System.out.println(opcion++ + "- Lanzar Hechizo");
        }
        if (jugador instanceof Curable) {
            System.out.println(opcion++ + "- Curar");
        }
        if (jugador instanceof Movilizable) {
            System.out.println(opcion++ + "- Moverse");
        }
        if (jugador instanceof Arquero) {
            System.out.println(opcion++);
        }
    }
}
