package Model.Magicos;
import Model.Interfaz.Magico;

import java.util.ArrayList;

import Model.Interfaz.Defendible;

public class Hechicero extends Magicos implements Magico, Defendible{

    int mana;
    int concentracion;
    ArrayList <GolemsHechizero> golems;
    public Hechicero(String nombre, int nivel, int salud, int contadorGolpes,int mana) {
        super("Veldar", 1, salud,contadorGolpes,mana);
       this.mana = mana;
       this.concentracion = concentracion;
       this.golems = new ArrayList<GolemsHechizero>();
    }
    
    // !Esto es un ejemplo de la logica de que pasaria si jugamos el personaje con un golem y que pasaria
    // ? este metodo me deberia de returnar el daño que deberia de hacer en base a los golem que tengo invocado?
    @Override
    public int atacar(){
        System.out.println("El Mago lanza un puñetazo...");
        return 5;
    }

    @Override
    public void defender() {
        
    }
    
    @Override
    public void lanzarHechizo() {
        
    }
    
    //* Este es el metodo InvocarUnidad (Nuestro mago invoca golems) */
    public void invocarGolem(){
        
    }
    
    public void informacionClaseHechicero(){
        
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(int concentracion) {
        this.concentracion = concentracion;
    }

    public ArrayList<GolemsHechizero> getGolems() {
        return golems;
    }

    public void setGolems(ArrayList<GolemsHechizero> golems) {
        this.golems = golems;
    }
}
