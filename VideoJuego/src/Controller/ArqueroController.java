package Controller;

import java.util.Scanner;

import Model.Personaje;
import Model.Fisico.Arquero;

public class ArqueroController {
    private Arquero arquero;
    private Personaje contrario;
    
    public ArqueroController(Arquero arquero, Personaje contrario) {
        this.arquero = arquero;
        this.contrario = contrario;
    }

    public Arquero getArquero() {
        return arquero;
    }

    public void setArquero(Arquero arquero) {
        this.arquero = arquero;
    }


     public void mostrarMenu() {
        Scanner scanner = new Scanner (System.in);
        int opcion;
        
        System.out.println("\n--- Menú de " + arquero.getNombre() + " ---");
        System.out.println("1- Atacar");
        System.out.println("2- Volar");
        System.out.println("3- Recargar Flechas");

        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        if (arquero.getRondasVolando() > 0 && arquero.isVolando()) {
            arquero.decrementarRondasVolando();
            if (arquero.getRondasVolando() == 0) {
                
            }
        }

        switch (opcion) {
            case 1 -> {
                if (arquero.getNumFlechas() <= 0) {
                    arquero.atacar(); 
                    return;
                } else {
                    arquero.atacar(); 
                    contrario.recibirDanio(arquero.getDaño()); System.out.println(arquero.getNombre() + " lanzó una flecha! Al enemigo le queda " + contrario.getSalud());
                }

            } 
            case 2 -> arquero.volar(); 
            case 3 -> arquero.reestablecerFlechas();
            default -> System.out.println("Opción no válida.");
        }
        
    }
    
    
}
