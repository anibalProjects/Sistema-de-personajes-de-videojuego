package Controller;

import java.util.Scanner;

import Model.Fisico.Arquero;
import Model.Fisico.Asesino;

public class AsesinoController {
private Asesino asesino;
    
public AsesinoController(Asesino asesino) {
    this.asesino = new Asesino("Víos", 0, 100);
}
    public Asesino getAsesino() {
        return asesino;
    }

    public void setAsesino(Asesino asesino) {
        this.asesino = asesino;
    }


     public void mostrarMenu() {
        Scanner scanner = new Scanner (System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú de " + asesino.getNombre() + " ---");
            System.out.println("1- Atacar");
            System.out.println("2- Moverse");
            System.out.println("3- Curar");
            System.out.println("4- Sigilo");

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> asesino.atacar(); 
                case 2 -> asesino.moverse(); 
                case 3 -> asesino.curar();
                case 4 -> asesino.activarSigilo();
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
