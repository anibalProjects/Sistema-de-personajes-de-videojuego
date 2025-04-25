package Model.Fisico;
import Model.Personaje;

abstract public class Fisico extends Personaje {

    public Fisico(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    abstract public int atacar();
}
