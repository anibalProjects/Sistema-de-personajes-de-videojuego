package Model.Fisico;

import Model.Interfaz.Volador;

public class Arquero extends Fisico implements Volador{
    private int agilidad;
    private int numFlechas = 5;

    public Arquero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
    }

    @Override
    public void atacar() {
    }

    @Override
    public void volar() {
    }

    public void dispararFlecha () {
        this.numFlechas -= 1;
    }

    public void reestablecerFlechas () {
        this.numFlechas = 5;
    }
}
