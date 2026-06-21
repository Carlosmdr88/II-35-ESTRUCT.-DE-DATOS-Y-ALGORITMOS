/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab03;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author carlo
 */
public class LAB03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
         Carro c1 = new Carro("Toyota", "Corolla", 2020, "Blanco");
        Carro c2 = new Carro("Honda", "Civic", 2021, "Negro");
        Carro c3 = new Carro("Hyundai", "Accent", 2019, "Rojo");
        Carro c4 = new Carro("Nissan", "Sentra", 2022, "Azul");

        Garaje garaje = new Garaje(4);

        garaje.aparcarCarro(c1);
        garaje.aparcarCarro(c2);
        garaje.aparcarCarro(c3);
        garaje.aparcarCarro(c4); 

        System.out.println("\n" + garaje);

        System.out.println("\nCarros en el garaje:");
        garaje.listarCarros();

        Carretera carretera = new Carretera("General Cañas");

        carretera.agregarCarro(c1);
        carretera.agregarCarro(c2);
        carretera.agregarCarro(c3);
        carretera.agregarCarro(c4);

        System.out.println("\n" + carretera);
    }
    
}
