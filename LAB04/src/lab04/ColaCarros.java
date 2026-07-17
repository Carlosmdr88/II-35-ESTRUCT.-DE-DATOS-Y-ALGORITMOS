/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class ColaCarros {

    private final Queue<Carro> cola = new LinkedList<>();

    private ColaConArray colaA;

    private int size;

    public ColaCarros(int size) {
        this.size = size;
        colaA = new ColaConArray(size);
    }

    public ColaCarros() {
    }

    //Encolar Carro
    public void addCarro(Carro carro) {
        if (size == 0) {
            cola.offer(carro);
            return;
        }
        if (size == colaA.size()) {
            JOptionPane.showMessageDialog(null, "Lavacar ya esta Lleno");
            return;
        }
        colaA.enqueue(carro);
    }

    //Desencolar carro
    public Carro pollCarro() {
        if (size == 0) {
            return cola.poll();
        } else {
            return colaA.dequeque();
        }

    }

    //Consultar el siguiente carro
    public Carro peekCarro() {
        return cola.peek();
    }

    //Tamano de la cola de carros
    public int getSize() {
        return size == 0 ? cola.size() : colaA.size();
    }

    //Valida Cola vacia
    public boolean isEmpty() {
        return cola.isEmpty();
    }

    public String listar() {
        if (size > 0) {
            return colaA.toString();
        }
        var sal = "";
        
        for (Carro carro : cola) {
            sal += carro + "\n";
        }
        return sal;
    }

}
