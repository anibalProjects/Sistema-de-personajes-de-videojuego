package Controller;

import java.util.Scanner;

import Model.Personaje;
import Model.Fisico.Asesino;

public class AsesinoController {
private Asesino asesino;
private Personaje contrario;
    

    public AsesinoController(Asesino asesino, Personaje contrario) {
    this.asesino = asesino;
    this.contrario = contrario;
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
        System.out.println("\n--- Menú de " + asesino.getNombre() + " ---");
        System.out.println("1- Atacar");
        System.out.println("2- Moverse");
        System.out.println("3- Curar");
        System.out.println("4- Sigilo");

        System.out.print("Opción: ");
        opcion = scanner.nextInt();
        
        if (asesino.inhibirAtaque) {
            asesino.inhibirAtaque = false;
        }

        switch (opcion) {
            case 1 -> {
                asesino.atacar(); 
                contrario.recibirDanio(asesino.getDaño()); 
                System.out.println(asesino.getNombre() + " atacó! Al enemigo le queda " + contrario.getSalud()); 

            } 
            case 2 -> {
                asesino.inhibirAtaque();
            } 
            case 3 -> {asesino.curar(); System.out.println(asesino.getNombre() + " se curó, ahora tiene " + asesino.getSalud() + " de vida");} 
            case 4 -> asesino.activarSigilo();
            default -> System.out.println("Opción no válida.");
        }


    }

    
}
