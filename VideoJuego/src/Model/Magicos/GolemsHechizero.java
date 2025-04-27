package Model.Magicos;

public class GolemsHechizero extends Hechicero {

    private int daño;
    //! Hay que hacer las stats del golem
    public GolemsHechizero(String nombre, int nivel, int salud, int daño) {
        super("Marmolito", nivel, salud);
        this.daño = 6;
    }
    public int getDaño() {
        return daño;
    }
    public void setDaño(int daño) {
        this.daño = daño;
    }

    
}
