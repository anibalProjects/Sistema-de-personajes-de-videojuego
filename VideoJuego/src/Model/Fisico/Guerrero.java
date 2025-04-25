package Model.Fisico;

import Model.Interfaz.Defendible;

public class Guerrero extends Fisico implements Defendible{
    private boolean fuerza; //habilidad que si se activa se añade 5 de daño pero se baja 10 de vida
    private int armadura;
    private boolean escudo;
    private int daño = 20;
    private boolean posibilidadCargaAtaque = true;

    public Guerrero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        this.armadura = 30;
        this.escudo = false;
    }


    @Override
    public int atacar() {
        return this.daño;
    }
    
    @Override
    public void defender() {
        setEscudo(true);
    }

    public int cargarAtaque() {
        this.posibilidadCargaAtaque = false;
        return atacar();
    }

    public void desactivarEscudo() {
        setEscudo(false);
    }

    public void activarFuerza () {
        this.daño =+ 5;
        this.salud =- 10;
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

  
}
