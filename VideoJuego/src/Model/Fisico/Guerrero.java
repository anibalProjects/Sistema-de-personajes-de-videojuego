package Model.Fisico;

import Model.Interfaz.Defendible;

public class Guerrero extends Fisico implements Defendible{
    private int fuerza;
    private int armadura;
    private boolean escudo;

    public Guerrero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        this.fuerza = 20;
        this.armadura = 30;
        this.escudo = false;
    }


    @Override
    public void atacar() {

    }
    @Override
    public void defender() {
        setEscudo(true);
    }

    public void reestablecerEscudo() {
        setEscudo(false);
    }

    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
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
