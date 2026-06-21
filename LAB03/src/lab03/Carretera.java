/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author carlo
 */
import java.util.ArrayList;

public class Carretera {

    private String nombre;
    private ArrayList<Carro> carros;

    public Carretera(String nombre) {
        this.nombre = nombre;
        carros = new ArrayList<>();
    }

    public void agregarCarro(Carro carro) {
        carros.add(carro);
        verificarEstado();
    }

    public int cantidadCarros() {
        return carros.size();
    }

    public String obtenerEstadoTrafico(int cantidad) {

        if (cantidad <= 3)
            return "tiene un flujo ligero";

        if (cantidad <= 5)
            return "tiene un flujo moderado";

        if (cantidad <= 8)
            return "está comenzando a congestionarse";

        if (cantidad <= 11)
            return "se está generando un embotellamiento en la carretera";

        return "hay mucho embotellamiento";
    }

    public void verificarEstado() {

        int cantidad = cantidadCarros();
        String estado = obtenerEstadoTrafico(cantidad);

        System.out.printf("La carretera %s %s%n", nombre, estado);
    }

    @Override
    public String toString() {
        return "Carretera: " + nombre +
               " | Cantidad de carros: " + cantidadCarros();
    }
}