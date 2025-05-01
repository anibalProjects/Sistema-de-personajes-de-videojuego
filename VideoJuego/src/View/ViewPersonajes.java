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

    
}
