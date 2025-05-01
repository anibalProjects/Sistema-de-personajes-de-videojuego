package Model.Fisico;

import Model.Interfaz.Volador;
import View.View;

public class Arquero extends Fisico implements Volador{
    private int agilidad;
    private int numFlechas = 5;
    private int daño = 15;
    private int rondasVolando = 3;

    public Arquero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public int atacar() {
        return this.daño;
    }
    
    @Override
    public void volar() {
        activarVuelo();
    }


    public void activarVuelo () {
        if (rondasVolando == 0) {
            System.out.println("Se han agotado las rondas de vuelo");
        } else {
            decrementarRondasVolando();
            this.daño =+ 10;
        }
    }
    public void desactivarVuelo () {
        this.daño = 15;
    }

    public void decrementarRondasVolando() {
        this.rondasVolando =- 1;
        System.out.println("A " + this.nombre + " le quedan " + this.rondasVolando + "volando");
    }

    public int dispararFlecha () {
        this.numFlechas =- 1;
        View.flechaLanzada(this);
        return atacar();
    }

    public void reestablecerFlechas () {
        this.numFlechas = 5;
    }

    public void recibirDanio (int daño) {
        this.salud =- daño; //HAY QUE IMPLEMENTAR DAÑO EN LA SUPER CLASE
    }

    

}
