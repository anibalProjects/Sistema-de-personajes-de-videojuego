package Controller;


public class TirarDados {
    int dado1;
    int dado2;

    public TirarDados() {
        this.dado1 = 0;
        this.dado2 = 0;
    }

    public int TiradorDeDados(){
        this.dado1 = (int) (Math.random() * 6) + 1;
        this.dado2 = (int) (Math.random() * 6) + 1;

        int tiradaTotal = this.dado1 + this.dado2;
        System.out.println("\nDado 1: " + this.dado1 + " | Dado 2: " + this.dado2);

        System.out.println("Total Tirada de Dados: " + tiradaTotal);
        return tiradaTotal;
    }
}
