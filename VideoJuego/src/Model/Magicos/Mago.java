package Model.Magicos;
import Model.Interfaz.Magico;
import Model.Interfaz.Curable;

public class Mago extends Magicos implements Magico,Curable {

    int mana;
    int sabiduria;

    public Mago(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        this.mana = mana;
        this.sabiduria = sabiduria;
    }

    @Override
    public void atacar(){

    }
    @Override
    public void curar() {
        
    }
    
    public void lanzarHechizo(){

    }
    public void RegenerarMana(){
        
    }

    public void informacionClaseMago(){
        
    }
}
