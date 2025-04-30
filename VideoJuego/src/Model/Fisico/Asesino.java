package Model.Fisico;

import Model.Interfaz.Curable;
import Model.Interfaz.Movilizable;

public class Asesino extends Fisico implements Movilizable, Curable{
    private boolean sigilo = false; //el sigilo tiene un solo uso, esto hace que el asesino haga mas daño 
    private boolean sigiloActivado = false;
    private boolean critico; //el critico será aleatorio, cada vez que se ataca aleatoriamente se añadirá o no más daño que el base
    private int daño = 20;


    public Asesino(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public int atacar() {
        if (aleatoriedadCritico()) {
            return this.daño + 10;
        } else {
            return this.daño;
        }
    }

    @Override
    public void curar() {
       this.salud =+ 20;
    }

    @Override
    public boolean moverse() {
        return true;
    }

    public void inhibirAtaque() {
        moverse();
    }
    

    public boolean aleatoriedadCritico () {
        if ((int)(Math.random() * 5) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void activarSigilo () {
        if (this.sigiloActivado == false) {
            this.sigilo =  true;
            this.sigiloActivado = true;
        } else {
            System.out.println("El modo sigilo ya ha sido activado anteriormente");
        }
    }

    public void desactivarSigilo () {
        this.sigilo =  false;
    }


    
}
