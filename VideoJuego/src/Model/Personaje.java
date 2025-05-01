package Model;

import Model.Interfaz.RecibirDanio;

abstract public class Personaje implements RecibirDanio {

    
    public String nombre;
    public int nivel;
    public int salud;
    public int contadorGolpes;
    public boolean inhibirAtaque;

    public Personaje(String nombre, int nivel, int salud,int contadorGolpes) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.salud = salud;
        this.contadorGolpes = 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getSalud() {
        return salud;
    }
    public void setSalud(int salud) {
        this.salud = salud;
    }
    
    abstract public int atacar();
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + nivel;
        result = prime * result + salud;
        return result;
    }

    
    public void subidaNivel(){
        if(contadorGolpes == 3){
            nivel++;
            contadorGolpes = 0;
        }
    }

    

    public boolean inhibirAtaque() {
        return this.inhibirAtaque;
    }
    
    public void setEvadiendo(boolean inhibirAtaque) {
        this.inhibirAtaque = inhibirAtaque;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personaje other = (Personaje) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (nivel != other.nivel)
            return false;
        if (salud != other.salud)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "\nNombre = " + nombre + " | Nivel = " + nivel + " | Salud = " + salud;
    }


}
