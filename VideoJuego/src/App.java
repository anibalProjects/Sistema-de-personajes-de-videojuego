import Controller.TirarDados;

public class App {
    public static void main(String[] args) throws Exception {
       //! Hay que definir el funcionamiento del nivel y la salud de los personaejes
         /** La logica de batalla es que cuado se elige el personaje se activa el controlador de ese personaje junto a su view para 
         poder activar sus habilidades **/
        TirarDados Dados = new TirarDados();
        Dados.TiradorDeDados();
    }
}
