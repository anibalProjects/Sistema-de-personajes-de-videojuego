package Controller;

import java.util.Scanner;

import Model.Fisico.Arquero;

public class ArqueroController {
    private Arquero arquero;
    
    public Arquero getArquero() {
        return arquero;
    }

    public void setArquero(Arquero arquero) {
        this.arquero = arquero;
    }

    public ArqueroController(Arquero arquero) {
        this.arquero = arquero;
    }

     public void mostrarMenu() {
        Scanner scanner = new Scanner (System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú de " + arquero.getNombre() + " ---");
            System.out.println("1- Atacar");
            System.out.println("2- Volar");
            System.out.println("3- Defender");
            System.out.println("4- Recargar Flechas");
            System.out.println("0- Salir");

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> arquero.atacar(); 
                case 2 -> arquero.volar(); 
                case 3 -> arquero.reestablecerFlechas();
                case 0 -> System.out.println("Saliendo del menú de Guerrero...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
    
    
}
