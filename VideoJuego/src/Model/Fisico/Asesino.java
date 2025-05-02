package Model.Fisico;

import Model.Interfaz.Curable;
import Model.Interfaz.Movilizable;

public class Asesino extends Fisico implements Movilizable, Curable{
    public Asesino(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
    }

    private boolean sigilo = false; //el sigilo tiene un solo uso, esto hace que el asesino haga mas daño 
    private boolean sigiloActivado = false;
    private boolean critico; //el critico será aleatorio, cada vez que se ataca aleatoriamente se añadirá o no más daño que el base
    private int daño = 20;
    private int dañoDeRival = 0;
    private boolean dañoinhibido = false;

    @Override
    public String toString() {
        return "Asesino " + super.toString();
    }

   
    @Override
    public int atacar() {
        if (aleatoriedadCritico()) {
            if(this.sigilo) {
                return this.daño + 10;
            } 
            System.out.println("Golpe crítico!");
            return this.daño + 10;
        } else {
            return this.daño;
        }

    }

    @Override
    public void curar() {
       this.salud += 20;
    }

    @Override
    public void recibirDanio(int daño) {
        this.salud -= daño;
    }

    @Override
    public boolean moverse() {
        this.inhibirAtaque = true;
        return true;
    }


    public void recogerDañoRivalParaMoverse(int dañoRival){
        this.salud += this.dañoDeRival;
    }
  
    public boolean inhibirAtaque() {
        return moverse();
    }
    

    public boolean aleatoriedadCritico () {
        if ((int)(Math.random() * 5) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void activarSigilo () {
        if (this.sigiloActivado == true) {
            System.out.println("El modo sigilo ya ha sido activado anteriormente");
        } else {
            this.sigilo =  true;
            this.sigiloActivado = true;
        }
    }

    public void desactivarSigilo () {
        this.sigilo =  false;
    }

    public boolean isSigilo() {
        return sigilo;
    }

    public void setSigilo(boolean sigilo) {
        this.sigilo = sigilo;
    }

    public boolean isSigiloActivado() {
        return sigiloActivado;
    }

    public void setSigiloActivado(boolean sigiloActivado) {
        this.sigiloActivado = sigiloActivado;
    }

    public boolean isCritico() {
        return critico;
    }

    public void setCritico(boolean critico) {
        this.critico = critico;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }


    
}
