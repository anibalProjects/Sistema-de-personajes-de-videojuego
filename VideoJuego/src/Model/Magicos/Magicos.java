package Model.Magicos;
import Model.*;

abstract class Magicos extends Personaje {

    protected int mana;

    public Magicos(String nombre, int nivel, int salud,int contadorGolpes, int mana) {
        super(nombre, nivel, salud,contadorGolpes);
        this.mana = 100;
    }

    //!Metodo
    public void regenerarMana(){
        if(mana < 65){
            mana+= 35;
            if(mana > 100){
                mana = 100;
            }
        }else{
            System.out.println("No se puede regenerar tu mana, se encuentra al maximo " +
            "\n Tu mana:" + mana);
        }
    }
   abstract public int atacar();
}
