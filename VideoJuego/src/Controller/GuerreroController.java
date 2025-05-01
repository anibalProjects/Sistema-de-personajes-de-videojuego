package Controller;


import java.util.Scanner;

import Model.Fisico.Guerrero;
import Model.Interfaz.Defendible;

public class GuerreroController {
    private Guerrero guerrero;
    private Scanner scanner = new Scanner(System.in);

    public GuerreroController(Guerrero guerrero) {
        this.guerrero = guerrero;
    }

    public void mostrarMenu() {
        int opcion;
        System.out.println("\n--- Menú de " + guerrero.getNombre() + " ---");
        System.out.println("1. Atacar");
        System.out.println("2. Cargar ataque");
        System.out.println("3. Defender");
        System.out.println("4. Activar fuerza");

        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> guerrero.atacar(); 
            case 2 -> guerrero.cargarAtaque(); 
            case 3 -> guerrero.defender();
            case 4 -> guerrero.activarFuerza();
            default -> System.out.println("Opción no válida.");
        }
    }
}

