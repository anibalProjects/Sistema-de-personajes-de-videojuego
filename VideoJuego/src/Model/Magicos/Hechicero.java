package Model.Magicos;
import Model.Interfaz.Magico;
import Model.Interfaz.Defendible;

public class Hechicero extends Magicos implements Magico, Defendible{

    int mana;
    int concentracion;

    public Hechicero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
       this.mana = mana;
       this.concentracion = concentracion;
    }
    
    @Override
    public void atacar(){

    }

    public void invocarEntidad(){

    }
    public void Defender(){
        
    }
}
