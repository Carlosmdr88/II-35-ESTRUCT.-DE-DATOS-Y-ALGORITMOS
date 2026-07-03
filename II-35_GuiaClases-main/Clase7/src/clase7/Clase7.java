/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase7;

/**
 *
 * @author fbarg
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaConArray clientes1 = new ColaConArray(5);
        
        clientes1.enqueue(10);
        clientes1.enqueue(20);
        clientes1.enqueue(30);
        clientes1.enqueue(40);
        clientes1.enqueue(50);
        
        System.out.println("");
        
        ColaConLista clientes = new ColaConLista();

        //Agregar
        clientes.enqueue(101);
        clientes.enqueue(102);
        clientes.enqueue(103);
        clientes.enqueue(104);
        clientes.enqueue(105);

        //clientes.enqueue(106);
//        while (!clientes.isEmpty()) {
//            System.out.println("Atendiendo al cliente: " + clientes.dequeue());
//        }
        
        clientes.dequeue();

        if (clientes.isEmpty()) {
            System.out.println("No hay mas cliente");
        } else {
            System.out.println("Cliente en cola: " + clientes.size());
        }
        
        System.out.println("Siguiente en la cola " +clientes.peek());
                

    }

}
