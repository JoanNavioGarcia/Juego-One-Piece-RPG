package Bando;

import Personajes.Personaje;

public class Marine extends Personaje {
    protected String rango;

    public Marine (String nombre, String atributo,int ataque, int salud,int defensa, int velocidad, long recompensa, String rango){
        super (nombre, atributo, ataque, salud, defensa, velocidad, recompensa);
        this.rango = rango;
    }
}