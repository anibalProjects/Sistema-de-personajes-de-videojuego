package Controller;

import java.util.ArrayList;

import Model.Personaje;
import Model.Fisico.Arquero;
import Model.Fisico.Asesino;
import Model.Fisico.Guerrero;

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
        Personaje arquero = new Arquero("Dobi", 0, 30);
        Personaje guerrero = new Guerrero("Laxus", 0, 20);
        Personaje asesino= new Asesino("Reyo", 0, 100);
        personajes.add(arquero);
        personajes.add(guerrero);
        personajes.add(asesino);
        }
   
}
