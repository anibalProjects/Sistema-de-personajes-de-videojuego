package Model.Magicos;


import Model.*;

abstract class Magicos extends Personaje {

    public Magicos(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);

    }

    //! Falta implementar el metodo propio no abstracto

    
   abstract public void atacar();
}
