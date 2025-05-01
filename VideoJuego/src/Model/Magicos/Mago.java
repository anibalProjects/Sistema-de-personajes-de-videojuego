package Model.Magicos;
import Model.Interfaz.Magico;
import Model.Interfaz.Curable;

public class Mago extends Magicos implements Magico,Curable {
    
    int sabiduria;// esto va a ser algo que puede aumentar el daño del personaje mientras reflexiona

    public Mago(String nombre, int nivel, int salud,int contadorGolpes, int mana) {
        super("Orion", 1, salud,contadorGolpes, mana);
        this.sabiduria = sabiduria;
        
    }
    //*Ataques */
    @Override
    public int atacar(){
        System.out.println("El Mago lanza un puñetazo...");
        return 5;
    }
    
    @Override
    public int lanzarHechizo(){
        System.out.println("El Mago lanza una bola de fuego");
        return 20;
    }
    
    public int escarchaHelida(){
        System.out.println("El Mago lanza una escarcha");
        return 25;
    }

    public int viajeAlInfierno(){
        if(this.nivel >= 3){
            System.out.println("El mago se ha hecho amigo de satán");
            return 45;
        }else{
            System.out.println("Todavia no tienes el nivel suficiente, Nivel requerido 3");
            return 0;
        }
    }

    //*Hechizos */
    @Override
    public void curar() {
        System.out.println("El mago se esta curando...");
        if (this.salud <= 75){
            this.salud += 25;
            if(this.salud > 100){
                this.salud = 100;
            }
        }else{
            System.out.println(this.nombre + "No puede curarse");
        }
    }
    //! Este metodo no deberia de ir aqui si no en VIEW
    public void informacionClaseMago(){
        
    }
}
