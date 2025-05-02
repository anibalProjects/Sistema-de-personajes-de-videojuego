package Model.Fisico;

import Model.Interfaz.Defendible;

public class Guerrero extends Fisico implements Defendible{

    
    public Guerrero(String nombre, int nivel, int salud, int contadorGolpes) {
        super(nombre, nivel, salud, contadorGolpes);
    }


    private boolean fuerza; //habilidad que si se activa se añade 10 de daño pero se baja 10 de vida
    private int armadura;
    private boolean escudo;
    private int daño = 20;
    private boolean posibilidadCargaAtaque = true;
    private boolean fuerzaActivada = false;
    private int rondasFuerza = 3;

    
    @Override
    public String toString() {
        return "Guerrero " + super.toString();
    }


    @Override
    public int atacar() {
        if (posibilidadCargaAtaque) {
            return this.daño + 10;
        } else {
            return this.daño;
        }
    }
    
    @Override
    public void defender() {
        setEscudo(true);
    }

    public boolean inhibirAtaque() {
        return this.escudo;
    }



    public int cargarAtaque() {
        this.posibilidadCargaAtaque = false;
        return atacar() + 10;
    }

    public void desactivarEscudo() {
        setEscudo(false);
    }

    public void activarFuerza() {
        if (this.rondasFuerza > 0 && !this.fuerzaActivada) {
            fuerzaActivada = true;
            this.daño += 10;
            this.salud -= 10;
            System.out.println(this.nombre + " activó su fuerza, se aumento su daño y perdió 10 de salud.");
        } else if (this.rondasFuerza == 0) {
            System.out.println("Ya no quedan rondas de fuerza");
        } else {
            System.out.println("Se activado la fuerza");
        }
    }

    public void decrementarRondasFuerza() {
        if (this.fuerzaActivada) {
            this.rondasFuerza--;
            System.out.println("A " + this.nombre + " le quedan " + this.rondasFuerza + " rondas de fuerza");
            if (this.rondasFuerza == 0) {
                desactivarFuerza();
            }
        }
    }

    public void desactivarFuerza() {
        this.fuerzaActivada = false;
        this.daño -= 10; 
    }

    public boolean isFuerzaActivada() {
        return fuerzaActivada;
    }

    public int getRondasFuerza() {
        return rondasFuerza;
    }
    
    public boolean getFuerza() {
        return fuerza;
    }
    public void setFuerza(boolean fuerza) {
        this.fuerza = fuerza;
    }
    public int getArmadura() {
        return armadura;
    }
    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    public boolean isEscudo() {
        return escudo;
    }
    public void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }

    @Override
    public void recibirDanio(int daño) {
        this.salud -= daño;
    }

  
}
