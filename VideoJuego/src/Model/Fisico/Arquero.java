package Model.Fisico;

import Model.Interfaz.Volador;
import View.View;

public class Arquero extends Fisico implements Volador {

    public Arquero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    private int agilidad;
    private int numFlechas = 5;
    private int daño = 15;
    private int rondasVolando = 3;
    private boolean volando = false; 

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

    public void activarVuelo() {
        if (rondasVolando == 0) {
            System.out.println("Se han agotado las rondas de vuelo");
        } else if (!volando) {
            volando = true;
            decrementarRondasVolando();
            this.daño += 10;
            System.out.println(this.nombre + " está volando");
        } else {
            System.out.println(this.nombre + " ya está volando.");
        }
    }

    public void desactivarVuelo() {
        if (volando) {
            volando = false;
            this.daño -= 10; 
            System.out.println(this.nombre + " ha dejado de volar. Daño normalizado.");
        }
    }

    public void decrementarRondasVolando() {
        if (volando) {
            rondasVolando--;
            System.out.println("A " + this.nombre + " le quedan " + rondasVolando + " rondas volando.");
            if (rondasVolando == 0) {
                desactivarVuelo();
            }
        }
    }

    public int dispararFlecha() {
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

    public void reestablecerFlechas() {
        this.numFlechas = 5;
    }

    public void recibirDanio(int daño) {
        this.salud -= daño;
    }

    public boolean isVolando() {
        return volando;
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