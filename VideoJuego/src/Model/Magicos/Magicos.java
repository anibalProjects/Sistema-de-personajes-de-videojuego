package Model.Magicos;

import Model.*;

abstract class Magicos extends Personaje {

    protected int mana;

    public Magicos(String nombre, int nivel, int salud, int mana) {
        super(nombre, nivel, salud);
        this.mana = 100;
    }

    public void regenerarMana(int mana) {
        if (mana < 65) {
            mana += 35;
            if (mana > 100) {
                mana = 100;
            }
        } else {
            System.out.println("No se puede regenerar tu mana, se encuentra al maximo " +
                    "\n Tu mana:" + mana);
        }
    }

    abstract public int atacar();

    @Override
    public String toString() {
        return "Personaje Magico: " + super.toString();
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
