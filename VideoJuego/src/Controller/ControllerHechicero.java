package Controller;

import java.util.Scanner;

import Model.Personaje;
import Model.Magicos.GolemsHechizero;
import Model.Magicos.Hechicero;
import Model.Magicos.Mago;

public class ControllerHechicero {
    private Hechicero Hechicero;
    private Personaje contrario;
    private GolemsHechizero golem;

    public ControllerHechicero(Hechicero hechicero, Personaje contrario, GolemsHechizero golem) {
        this.Hechicero = hechicero;
        this.contrario = contrario;
        this.golem = golem;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner (System.in);
        int opcion;
        System.out.println("\n--- Menú de " + Hechicero.getNombre() + " ---");
        System.out.println("1- Atacar");
        System.out.println("2- Defender");
        System.out.println("3- Lanzar Hechizo");
        System.out.println("4- InvocarGolem");
        System.out.println("5- Usar Golem");
        System.out.println("6- Recargar mana");

        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                contrario.recibirDanio(Hechicero.atacar());
                System.out.println(Hechicero.getNombre() + " atacó! Al enemigo le queda " + contrario.getSalud()); 

            }
            case 2 -> {Hechicero.defender(golem); }
            case 3 -> {contrario.recibirDanio(Hechicero.lanzarHechizo()); System.out.println("Al enemigo le queda " + contrario.getSalud());}
            case 4 -> {Hechicero.invocarGolem(golem);}
            case 5 -> {
                if(Hechicero.getGolems().size() < 1){
                    System.out.println("No puedes usar un golem, no lo tienes invocado");
                }else{
                    scanner.nextLine();
                    System.out.println("\n--- Menú de " + "Marmolito" + " ---");
                    System.out.println("1- Manotazo");
                    System.out.println("2- Lanzar Roca");
                    int opcionGolem = scanner.nextInt();
                    switch (opcionGolem) {
                        case 1 ->{contrario.recibirDanio(golem.manotazo()); System.out.println("Al enemigo le queda " + contrario.getSalud());}
                        case 2 ->{contrario.recibirDanio(golem.lanzarRoca()); System.out.println("Al enemigo le queda " + contrario.getSalud());}
                        default -> System.out.println("Opcion no válida");
                    }
                }
            }
            case 6 -> {Hechicero.regenerarMana(Hechicero.getMana());}
            default -> System.out.println("Opción no válida.");
        }
    }
}
