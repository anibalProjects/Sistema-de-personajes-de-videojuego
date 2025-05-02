package Model.Magicos;

public class GolemsHechizero extends Hechicero {

    public GolemsHechizero(int daño) {
        super();
        this.daño = 1;
    }

    private int daño;

    public int manotazo() {
        System.out.println("El golem da un Manotazo");
        return 15;
    }

    public int lanzarRoca() {
        System.out.println("El Golem lanza roca");
        return 25;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    @Override
    public void recibirDanio(int daño) {
        this.salud = -daño;
    }

}
