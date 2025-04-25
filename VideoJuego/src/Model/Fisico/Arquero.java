package Model.Fisico;

public class Arquero extends Fisico{
    private int agilidad;
    private int numFlechas = 20;

    public Arquero(String nombre, int nivel, int salud) {
        super(nombre, nivel, salud);
        this.agilidad = agilidad;
        this.numFlechas = numFlechas;
    }

    @Override
    public void atacar() {
    }
}
