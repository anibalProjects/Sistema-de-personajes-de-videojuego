package Model.Magicos;

import Model.Interfaz.Magico;
import Model.Interfaz.Curable;

public class Mago extends Magicos implements Magico, Curable {

    int sabiduria;
    int daño;

    public Mago() {
        super("Orion", 0, 100, 0, 100);
        this.sabiduria = 0;
        this.daño = 0;
    }

    // *Ataques */
    @Override
    public int atacar() {
        System.out.println("El Mago no sabia que era magico y lanzó un puñetazo...");
        this.mana -= 1;
        return 5;
    }

    @Override
    public int lanzarHechizo() {
        System.out.println("El Mago lanza una bola de fuego...");
        this.mana -= 15;
        return 20;
    }

    public int escarchaHelida() {

        System.out.println("El mago se ha hecho amigo de satán");
        this.mana -= 20;
        return 35;

    }

    public int viajeAlInfierno() {
        System.out.println("El mago se ha hecho amigo de satán");
        this.mana -= 60;
        return 45;

    }

    @Override
    public void curar() {
        if (this.salud <= 75) {
            System.out.println("El mago se esta curando...");
            this.salud += 25;
            if (this.salud > 100) {
                this.salud = 100;
            }
        } else {
            System.out.println(this.nombre + " No puede curarse, su salud esta al maximo");
        }
    }

    @Override
    public String toString() {
        return "Mago " + super.toString();
    }

    @Override
    public void recibirDanio(int daño) {
        this.salud -= daño;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
}
