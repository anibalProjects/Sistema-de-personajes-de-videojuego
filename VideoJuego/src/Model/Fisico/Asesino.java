package Model.Fisico;

import Model.Interfaz.Curable;
import Model.Interfaz.Movilizable;

public class Asesino extends Fisico implements Movilizable, Curable{
    private int sigilo;
    private int critico;


    public Asesino(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        this.sigilo = sigilo;
        this.critico = critico;
    }

    @Override
    public void atacar() {
    }

    @Override
    public void curar() {
       
    }

    @Override
    public void moverse() {

    }


    
}
