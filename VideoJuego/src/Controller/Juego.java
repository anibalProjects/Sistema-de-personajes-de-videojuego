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
import Model.Magicos.Hechicero;
import Model.Magicos.Mago;

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

    public void mostrarAcciones() {
        for (Personaje p : personajes) {
            System.out.println("\n Menú de acciones para " + p.getNombre());

            if (p instanceof Guerrero guerrero) {
                new GuerreroController(guerrero).mostrarMenu();
            } else if (p instanceof Arquero arquero) {
                new ArqueroController(arquero).mostrarMenu();
            } else if (p instanceof Asesino asesino) {
                new AsesinoController(asesino).mostrarMenu();
            }
        }
    }
   
}
