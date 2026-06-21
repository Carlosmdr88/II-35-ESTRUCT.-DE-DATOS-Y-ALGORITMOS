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

public class Garaje {

    private int capacidadMaxima;
    private ArrayList<Carro> carros;

    public Garaje(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        carros = new ArrayList<>();
    }

    public void aparcarCarro(Carro carro) {

        if (carros.size() < capacidadMaxima) {
            carros.add(carro);
            System.out.println("Carro aparcado correctamente.");
        } else {
            System.out.println("El garaje está lleno.");
        }
    }

    public void listarCarros() {

        if (carros.isEmpty()) {
            System.out.println("No hay carros en el garaje.");
            return;
        }

        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }

    @Override
    public String toString() {
        return "Garaje [Capacidad Máxima=" + capacidadMaxima +
                ", Carros Actuales=" + carros.size() + "]";
    }
}