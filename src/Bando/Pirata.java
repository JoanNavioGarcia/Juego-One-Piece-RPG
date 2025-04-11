package Bando;

import Personajes.Personaje;

public class Pirata extends Personaje {
    protected String tripulacion;

    public Pirata (String nombre, String atributo,int ataque, int salud,int defensa, int velocidad, long recompensa, String tripulacion){
        super (nombre, atributo, ataque, salud, defensa, velocidad, recompensa);
        this.tripulacion = tripulacion;
    }
}
