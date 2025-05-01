package Model.Magicos;
import Model.Interfaz.Magico;

import java.util.ArrayList;

import Model.Interfaz.Defendible;

public class Hechicero extends Magicos implements Magico, Defendible{

    int mana;
    int concentracion;
    ArrayList <GolemsHechizero> golems;
    public Hechicero() {
        super("Veldar", 1, 100,0,100);
       this.mana = 100;
       this.concentracion = 100;
       this.golems = new ArrayList<GolemsHechizero>();
    }

    @Override
    public void defender(){

    }

    @Override
    public int atacar(){
        System.out.println("El Hechizero lanza un puñetazo...");
        return 5;
    }

    
    public void defender(GolemsHechizero golem) {
        System.out.println("El Hechizero se ha defendido con un Golem");
        golems.remove(golem);
    }
    
    @Override
    public int lanzarHechizo(){
        System.out.println("El Hechizero lanza una bola de fuego");
        return 10;
    }
    
    //* Este es el metodo InvocarUnidad (Nuestro mago invoca golems) */
    public void invocarGolem(GolemsHechizero golemInvocado){
        System.out.println("El hechicero ha invocado un golem...");
        if(golems.size() < 3){
            golems.add(golemInvocado);
        }else{
            System.out.println("Numero de golems maximo alcanzado, tus golems invocados son: " + golems.size());
        }
    }
    
    @Override
    public String toString() {
        return "Hechicero " + super.toString();
    }

    @Override
    public void recibirDanio(int daño){
        this.salud =- daño;
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
