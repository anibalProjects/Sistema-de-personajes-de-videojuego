package Model.Fisico;

import Model.Interfaz.Defendible;

public class Guerrero extends Fisico implements Defendible {

    public Guerrero(String nombre, int nivel, int salud, int contadorGolpes) {
        super(nombre, nivel, salud, contadorGolpes);
    }

    private boolean fuerza; // habilidad que si se activa se añade 5 de daño pero se baja 10 de vida
    private int armadura;
    private boolean escudo;
    private int daño = 20;
    private boolean posibilidadCargaAtaque = true;

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

    public void inhibirAtaque() {
        defender();
    }

    public int cargarAtaque() {
        this.posibilidadCargaAtaque = false;
        return atacar();
    }

    public void desactivarEscudo() {
        setEscudo(false);
    }

    public void activarFuerza() {
        this.daño = +5;
        this.salud = -10;
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
