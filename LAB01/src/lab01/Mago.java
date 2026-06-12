/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author carlo
 */
public class Mago extends Personaje {
    
    private int mana;
    
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    public Mago(String nombre, int vida, int fuerza, int posicion, int mana) {
        super(nombre, vida, fuerza, posicion);
        this.mana = mana;
    }
    @Override
    public void Atacar() {
            // para atacar incoporamos el mana que cada ataque baja mana
            // usamos un if 
        if (mana <= 0) {
            System.out.println(getNombre() + " no tiene suficiente mana para atacar.");
            return;
        }

        int AtaqueMago = getFuerza() * 2;

        System.out.println(getNombre() +
                " Ataca y causa " +
                AtaqueMago + " puntos de daño.");

        mana--;
    }
}


