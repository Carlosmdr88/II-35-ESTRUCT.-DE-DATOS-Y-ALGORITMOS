/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author carlo
 */
public class Personaje {
    
    //generar set y get  
    private String nombre;
    private int vida;
    private int fuerza;
    private int posicion;

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
    
    public Personaje() {
    }

    public Personaje(String nombre, int vida, int fuerza, int pocision) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
        this.posicion = pocision;
    }
    
    public void Atacar (){
        System.out.println(nombre + " Ataco y Hizo " + (fuerza/2) + "Daño");
    }
    
     public void Moverse (){
         Moverse(1);
    }
     public void Moverse (int numPasos){
         this.posicion = this.posicion + numPasos;
    }
     public void Turno (){
         
        System.out.println("Nombre: " + getNombre());
        System.out.println("Vida: " + getVida());
        System.out.println("Posición: " + getPosicion());

        Moverse();
        Atacar();
         
    }
     public static void main(String[] args) {
       // Personaje p = new Personaje("TurboMan", 200, 50, 0);
       // System.out.println(p.posicion);
       // p.Moverse();
        //p.Moverse(10);
        //.Moverse(4);
        //System.out.println(p.posicion);
        //p.Atacar();
        
        Guerrero g = new Guerrero("Garrosh", 100, 20, 0);

        Mago m = new Mago("Merlin", 80, 15, 0, 3);
        Mago x = new Mago("Aethas Atracasol", 150, 30, 0, 0);
        System.out.println("=== GUERRERO ===");
        g.Turno();

        System.out.println("\n=== MAGO ===");
        m.Turno();
        
        System.out.println("\n=== MAGO ===");
        x.Turno();
    }         
}
