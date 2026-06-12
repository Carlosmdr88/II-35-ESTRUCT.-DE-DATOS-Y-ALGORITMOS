/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase01;

/**
 *
 * @author carlo
 */
public class CLASE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Carlos";
        int num1 = 2;
        int num2 = 4;
        double resultado;
        
        System.out.println("HOLA" + nombre);
        System.out.println(num1 + num2);
        // TODO code application logic here
        try {
            resultado = (num1 + num2) /2.0; 
            System.out.println("Resultado: " + resultado);
        } catch(java.lang.ArithmeticException e) { 
            System.err.println("No se puede dividir entre 0");
        }
    }
}
