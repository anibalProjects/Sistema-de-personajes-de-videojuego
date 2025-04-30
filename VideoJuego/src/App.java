import Controller.Juego;
import Controller.TirarDados;
import Model.Personaje;
import Model.Fisico.Arquero;
import View.View;

public class App {
    public static void main(String[] args) throws Exception {
       //! Hay que definir el funcionamiento del nivel y la salud de los personaejes
         /** La logica de batalla es que cuado se elige el personaje se activa el controlador de ese personaje junto a su view para 
         poder activar sus habilidades **/
         
        /* Hay que poner un metodo de acciones abstracto en personajes, en cada personaje habrá que hacer la lógica para mostrar las acciones que tienen los personajes 
         * además habría que tener otro metodo abstracto en personaje que sea recibirDaño(int daño) para que en caso de que el contrario ataque se llame a esta función
         * haciendo que la salud le baje
         * 
         * Ejemplo: Arquero tiene 20 de daño, si el usuario (con el personaje arquero) llama a atacar() dentro de la condicion se llamará a 
         * recibirDaño(personaje1.getDaño()) del otro personaje y dentro de esta funcion habrá un this.salud -= daño haciendo que se le baje
         * la salud
         * En la clase Arquero puedes ver un ejemplo pero sin pasarle ningun parámetro
        */


        TirarDados Dados = new TirarDados();
        Dados.TiradorDeDados();

        
        Juego juego = new Juego();
        Personaje arquero = new Arquero("Viee", 0, 100);
        Personaje asesino = new Arquero("Asesineee", 0, 100);

        juego.mostrarAcciones(arquero, asesino);
    }
}
