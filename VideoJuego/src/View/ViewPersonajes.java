package View;

public class ViewPersonajes extends View{

//Podemos hacer que haya una opción de menú para mostrar la informacion de cada héroe o poner todo eso en el README y en el menú darle el link al github, esta es una forma de hacerlo:

    public static void habilidadesArquero () {
        System.out.println("Habilidades del héroe arquero:");
        System.out.println("Flechas: 15 de daño");
        System.out.println("Reestablecer Flechas: el personaje tiene 5 flechas, una vez se disparen éstas habrá que recargar");
        System.out.println("Volar: Le da al personaje un buff de daño durante 3 rondas");
    }

    public static void habilidadesAsesino () {
        System.out.println("Habilidades del héroe asesino:");
        System.out.println("Ataque: 20 de daño");
        System.out.println("El asesino tiene continuamente una probabilidad de crítico del 15%");
        System.out.println("Moverse: cancelará el próximo daño que reciba (solo se aplicará dos veces por batalla)");
        System.out.println("Sigilo: el daño aumentará en 30 de daño (solo se aplicará una vez por batalla)");
    }

    public static void habilidadesMago(){
        System.out.println("Habilidades del héroe mago:");
        System.out.println("Ataque: 5 de daño  Nivel: 1");
        System.out.println("Lanzar Hechizo: 20 de daño  Nivel: 1");
        System.out.println("Escarcha Helida: 25 de daño  Nivel: 2");
        System.out.println("Viaje al infierno: 45 de daño  Nivel: 3");
    }

    public static void habilidadesHechizero(){
        System.out.println("Habilidades del hérore hechicero:");
        System.out.println("Ataque: 5 daño  Nivel: 1");
        System.out.println("Lanzar Hechizo: 20 de daño  Nivel: 1");
        System.out.println("Invocar Golem: Invoca un golem y puede usarlo para atacar y defenderse  Nivel: 2");
        System.out.println("Defender: Usa un golem de escudo y evita un ataque");
        System.out.println("\nHabilidades del Golem:");
        System.out.println("Manotazo: 15 daño ");
        System.out.println("Lanzar roca: 25 daño");
    }

    public static void habilidadesGuerrero() {
        System.out.println("Habilidades del héroe Guerrero:");
        System.out.println("- Ataque: 20 de daño.");
        System.out.println("- Cargar Ataque: Incrementa el daño del próximo ataque en 10.");
        System.out.println("- Defender: Activa un escudo que bloquea el próximo ataque.");
        System.out.println("- Activar Fuerza: Incrementa el daño en 10 durante 3 rondas, pero reduce la salud en 10.");
    }

    public static void mostrarHabilidades(String tipoPersonaje) {
        switch (tipoPersonaje.toLowerCase()) {
            case "arquero" -> habilidadesArquero();
            case "asesino" -> habilidadesAsesino();
            case "guerrero" -> habilidadesGuerrero();
            case "mago" -> habilidadesMago();
            case "hechicero" -> habilidadesHechizero();
            default -> System.out.println("Tipo de personaje no reconocido.");
        }
    }

   
}
