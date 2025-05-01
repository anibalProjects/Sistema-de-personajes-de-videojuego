import java.util.Scanner;

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

        Scanner scanner = new Scanner (System.in);

        TirarDados Dados = new TirarDados();
        Dados.TiradorDeDados();

        Juego juego = new Juego();
        juego.listarPersonajes();
        int eleccion = scanner.nextInt();
        juego.listarPersonajes();
        int eleccion2 = scanner.nextInt();
        
        Personaje personaje1 = juego.eleccion(eleccion);
        Personaje personaje2 = juego.eleccion(eleccion2);
        juego.inicializarControlladores(personaje1, personaje2);
        juego.inicializarControlladores(personaje2, personaje1);
        do {
            juego.mostrarAcciones(personaje1, personaje2);
            juego.mostrarAcciones(personaje2, personaje1);
            
            System.out.println(personaje1.getSalud() + " " + personaje2.getSalud());
        } while (personaje1.getSalud() > 0 || personaje2.getSalud() > 0);


        
      

    }
}
