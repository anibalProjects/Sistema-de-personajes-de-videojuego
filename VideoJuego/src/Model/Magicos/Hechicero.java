package Model.Magicos;
import Model.Interfaz.Magico;

import java.util.ArrayList;

import Model.Interfaz.Defendible;

public class Hechicero extends Magicos implements Magico, Defendible{

    int mana;
    int concentracion;
    ArrayList <GolemsHechizero> golems;
    //*? La jugabilidad del hechizero deberia ser en base a sus entidades (Golems)?
    //? Por ejemplo, El hechizero solo puede atacar con sus entidades no con su propia magia pero a si mismo si puede curarse
    //* En base a la cantidad de de golems que haya generado el jugador puede multiplicar el daño por 2 o por 3 */
    public Hechicero(String nombre, int nivel, int salud) {
        super("Veldar", 1, salud);
       this.mana = mana;
       this.concentracion = concentracion;
       this.golems = new ArrayList<GolemsHechizero>();
    }
    
    // !Esto es un ejemplo de la logica de que pasaria si jugamos el personaje con un golem y que pasaria
    // ? este metodo me deberia de returnar el daño que deberia de hacer en base a los golem que tengo invocado?
    @Override
    public void atacar(){
        if(golems.size() <= 0){
            System.out.println("Para atacar Necesitas Invocar un golem");
        }else{
            switch (golems.size()) {
                case 1:
                    for (int i = 0; i < golems.size(); i++) {
                        int daño = golems.get(i).getDaño();
                        daño *= 1;
                    }
                    break;
            
                case 2:
                for (int i = 0; i < golems.size(); i++) {
                    int daño = golems.get(i).getDaño();
                    daño *= 2;
                }
                    break;
                case 3:
                for (int i = 0; i < golems.size(); i++) {
                    int daño = golems.get(i).getDaño();
                    daño *= 3;
                }
                    break;
            }
        }
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
