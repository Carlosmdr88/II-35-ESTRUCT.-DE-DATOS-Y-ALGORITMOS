/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author carlo
 */
public class Guerrero extends Personaje{
    
    public Guerrero(String nombre, int vida, int fuerza, int posicion) {
        super(nombre, vida, fuerza, posicion);
    }

    @Override
    public void Atacar() {
        System.out.println(getNombre() + " Ataca y hace "
                + getFuerza() + " de puntos de daño.");
    }
    
}
