package Controller;

import java.util.Scanner;

import Model.Personaje;
import Model.Fisico.Arquero;
import Model.Magicos.Mago;

public class ControllerMago {
    private Mago mago;
    private Personaje contrario;

    public ControllerMago(Mago mago, Personaje contrario) {
        this.mago = mago;
        this.contrario = contrario;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner (System.in);
        int opcion;
        System.out.println("\n--- Menú de " + mago.getNombre() + " ---");
        System.out.println("1- Atacar");
        System.out.println("2- lanzar Hechizo");
        System.out.println("3- Escarcha Helida");
        System.out.println("4- Viaje al Infierno");
        System.out.println("5- Curarse");
        System.out.println("6- Recargar mana");

        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                contrario.recibirDanio(mago.atacar());
                System.out.println(mago.getNombre() + " atacó! Al enemigo le queda " + contrario.getSalud()); 

            }
            case 2 -> {contrario.recibirDanio(mago.lanzarHechizo()); System.out.println("Al enemigo le queda " + contrario.getSalud());}
            case 3 -> {contrario.recibirDanio(mago.escarchaHelida()); System.out.println("Al enemigo le queda " + contrario.getSalud());}
            case 4 -> {contrario.recibirDanio(mago.viajeAlInfierno());System.out.println("Al enemigo le queda " + contrario.getSalud());}
            case 5 -> {mago.curar(); } 
            case 6 -> {mago.regenerarMana(mago.getMana());} 
            default -> System.out.println("Opción no válida.");
        }


    }


    public Mago getMago() {
        return mago;
    }
    public void setMago(Mago mago) {
        this.mago = mago;
    }
    public Personaje getContrario() {
        return contrario;
    }
    public void setContrario(Personaje contrario) {
        this.contrario = contrario;
    }

    
}
