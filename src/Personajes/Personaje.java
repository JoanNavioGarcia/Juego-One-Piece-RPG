package Personajes;

public class Personaje {
    protected String nombre;
    protected String atributo;
    protected int ataque;
    protected int salud;
    protected int defensa;
    protected int velocidad;
    protected int recompensa;

    public Personaje(String nombre, String atributo,int ataque, int salud,int defensa, int velocidad, int recompensa){
        this.nombre = nombre;
        this.atributo = atributo;
        this.ataque = ataque;
        this.salud = salud;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.recompensa = recompensa;
    }
}
