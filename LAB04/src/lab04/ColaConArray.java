/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author fbarg
 */
public class ColaConArray {

    private int maxSize;
    private Carro[] cola;
    
    private int frente;//cabeza/ head
    private int fin;//cola /tail
    private int tamano;

    public ColaConArray(int size) {
        this.maxSize = size;
        this.cola = new Carro[maxSize];
        this.frente = 0;
        this.fin = -1;
        this.tamano = 0;
    }

    @Override
    public String toString() {
        var sal = "";
        for (Carro carro : cola) {
            sal += carro + "\n";
        }
        return sal;
    }
    
        //AGREGA ELEMNTOS A LACOLA
    public void enqueue(Carro elemento) {
        if (tamano == maxSize) {
            throw new IllegalStateException("La cola est� llena.");
        }
        fin = (fin + 1) % maxSize; // Circular
        cola[fin] = elemento;
        tamano++;
        
        System.out.println("Se agrego a la cola el elemento: " + elemento);
    }

    public Carro dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola est� vac�a.");
        }
        Carro elemento = cola[frente];
        frente = (frente + 1) % maxSize; // Circular
        tamano--;
        return elemento;
    }

    public Carro peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola est� vac�a.");
        }
        return cola[frente];
    }

    public boolean isEmpty() {
        return tamano == 0;
    }

    public int size() {
        return tamano;
    }

    Carro poll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Carro dequeque() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
