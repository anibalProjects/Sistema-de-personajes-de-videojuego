package Controller;

import java.util.Scanner;

import Model.Personaje;
import Model.Fisico.Guerrero;
import Model.Interfaz.Defendible;

public class GuerreroController {
    private Guerrero guerrero;
    private Personaje contrario;
    private Scanner scanner = new Scanner(System.in);

    public GuerreroController(Guerrero guerrero, Personaje contrario) {
        this.guerrero = guerrero;
        this.contrario = contrario;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("\n--- Menú de " + guerrero.getNombre() + " ---");
        System.out.println("VIDA: " + guerrero.getSalud());
        System.out.println("1- Atacar");
        System.out.println("2- Cargar ataque");
        System.out.println("3- Defender");
        System.out.println("4- Activar fuerza");

        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        if (guerrero.isFuerzaActivada()) {
            guerrero.decrementarRondasFuerza();
        }

        if (guerrero.isEscudo()) {
            guerrero.desactivarEscudo();
        }

        switch (opcion) {
            case 1 -> {
                contrario.recibirDanio(guerrero.atacar());
                System.out.println(guerrero.getNombre() + " atacó! Al enemigo le queda " + contrario.getSalud());
            }
            case 2 -> {
                
                contrario.recibirDanio(guerrero.cargarAtaque());
                System.out.println(guerrero.getNombre() + " cargó un ataque poderoso! Al enemigo le queda " + contrario.getSalud());
            }
            case 3 -> {
                guerrero.defender();
                System.out.println(guerrero.getNombre() + " se ha defendido con su escudo.");
            }
            case 4 -> {
                guerrero.activarFuerza();
            }
            default -> System.out.println("Opción no válida.");
        }
    }
}
