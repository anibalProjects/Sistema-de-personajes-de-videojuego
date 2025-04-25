package Model.Magicos;
import Model.*;

abstract class Magicos extends Personaje {

    public Magicos(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);

    }

    //*Este es el metodo propio de la clase
    //? La idea de este metodo es que el propio mago pueda cambiar sus suerte y cuando haga una tirada de "dados" sea capaz de mejorar o empeorar esa tirada
    public void mejorarSuerte(){

    }
    
   abstract public void atacar();
}
