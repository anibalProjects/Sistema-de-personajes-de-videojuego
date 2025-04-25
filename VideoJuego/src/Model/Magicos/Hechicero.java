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
        super(nombre, nivel, salud);
       this.mana = mana;
       this.concentracion = concentracion;
       this.golems = new ArrayList<GolemsHechizero>();
    }
    
    @Override
    public void atacar(){

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
}
