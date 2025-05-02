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
import Model.Magicos.GolemsHechizero;
import Model.Magicos.Hechicero;
import Model.Magicos.Mago;

public class Juego {
    private ArrayList<Personaje> personajes;
    private GuerreroController controladorGuerrero;
    private ArqueroController controladorArquero;
    private AsesinoController controladorAsesino;
    private ControllerMago controllerMago;
    private ControllerHechicero controllerHechicero;

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

    public void añadirPersonajes() {
        Personaje arquero = new Arquero("Dobi", 0, 100, 0);
        Personaje guerrero = new Guerrero("Laxus", 0, 100, 0);
        Personaje asesino = new Asesino("Reyo", 0, 100, 0);
        Personaje mago = new Mago();
        Personaje Hechicero = new Hechicero();
        GolemsHechizero golem = new GolemsHechizero(1);
        personajes.add(Hechicero);
        personajes.add(mago);
        personajes.add(arquero);
        personajes.add(guerrero);
        personajes.add(asesino);
    }

    public void listarPersonajes() {

        int numero = 1;
        for (Personaje personaje : personajes) {
            System.out.println("");
            System.out.println(numero + "- " + personaje);
            numero++;
        }
    }

    public Personaje eleccion(int eleccion) {
        return this.personajes.get(eleccion - 1);
    }

    public void inicializarControlladores(Personaje personaje, Personaje contrario, GolemsHechizero golem) {
        if (personaje instanceof Guerrero guerrero) {
            controladorGuerrero = new GuerreroController(guerrero);
        } else if (personaje instanceof Arquero arquero) {
            controladorArquero = new ArqueroController(arquero, contrario);
        } else if (personaje instanceof Asesino asesino) {
            controladorAsesino = new AsesinoController(asesino, contrario);
        } else if (personaje instanceof Mago mago) {
            controllerMago = new ControllerMago(mago, contrario);
        } else if (personaje instanceof Hechicero Hechicero) {
            controllerHechicero = new ControllerHechicero(Hechicero, contrario, golem);
        }
    }

    public void mostrarAcciones(Personaje personaje, Personaje contrario) {

        if (personaje instanceof Guerrero) {
            controladorGuerrero.mostrarMenu();
        } else if (personaje instanceof Arquero) {
            controladorArquero.mostrarMenu();
        } else if (personaje instanceof Asesino) {
            controladorAsesino.mostrarMenu();
        } else if (personaje instanceof Mago) {
            controllerMago.mostrarMenu();
        } else if (personaje instanceof Hechicero) {
            controllerHechicero.mostrarMenu();
        }
    }

}
