package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Personaje;
import Model.Fisico.Arquero;
import Model.Fisico.Asesino;
import Model.Fisico.Guerrero;
import Model.Interfaz.Curable;
import Model.Interfaz.Defendible;
import Model.Interfaz.Magico;
import Model.Interfaz.Movilizable;
import Model.Interfaz.Volador;
import View.ViewJuego;

public class Juego {
    private ArrayList <Personaje> personajes;

    public Juego() {
        this.personajes = new ArrayList();
        añadirPersonajes();
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }


    public void añadirPersonajes () {
        Personaje arquero = new Arquero("Dobi", 0, 100);
        Personaje guerrero = new Guerrero("Laxus", 0, 100);
        Personaje asesino= new Asesino("Reyo", 0, 100);
        personajes.add(arquero);
        personajes.add(guerrero);
        personajes.add(asesino);
    }

    public void mostrarAcciones(Personaje jugador, Personaje enemigo) {
        Scanner scanner = new Scanner (System.in);
        ViewJuego.menuAcciones(jugador, enemigo);
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        
        
    }

   
}
