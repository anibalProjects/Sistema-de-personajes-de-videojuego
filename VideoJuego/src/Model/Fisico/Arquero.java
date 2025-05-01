package Model.Fisico;

import Model.Interfaz.Volador;
import View.View;

public class Arquero extends Fisico implements Volador{
    
    public Arquero(String nombre, int nivel, int salud, int contadorGolpes) {
        super(nombre, nivel, salud, contadorGolpes);
        //TODO Auto-generated constructor stub
    }
    
    private int agilidad;
    private int numFlechas = 5;
    private int daño = 15;
    private int rondasVolando = 3;
    
    @Override
    public String toString() {
        return "Arquero " + super.toString();
    }
    
    @Override
    public int atacar() {
        return dispararFlecha();
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
        if (this.numFlechas <= 0) {
            System.out.println("No te quedan flechas, turno perdido");
            return 0;
        } else {
            this.numFlechas -= 1;
            View.flechaLanzada(this);
            System.out.println("Te quedan " + this.numFlechas);
            return this.daño;
        }
    }

    public void reestablecerFlechas () {
        this.numFlechas = 5;
    }

    public void recibirDanio (int daño) {
        this.salud -= daño; //HAY QUE IMPLEMENTAR DAÑO EN LA SUPER CLASE
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getNumFlechas() {
        return numFlechas;
    }

    public void setNumFlechas(int numFlechas) {
        this.numFlechas = numFlechas;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getRondasVolando() {
        return rondasVolando;
    }

    public void setRondasVolando(int rondasVolando) {
        this.rondasVolando = rondasVolando;
    }

    

}
