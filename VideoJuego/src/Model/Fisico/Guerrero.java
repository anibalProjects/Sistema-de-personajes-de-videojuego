package Model.Fisico;

public class Guerrero extends Fisico {
    private int fuerza;
    private int armadura;
    private int escudo;

    public Guerrero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.escudo = escudo;
    }





    @Override
    public void atacar() {
    }

  
}
