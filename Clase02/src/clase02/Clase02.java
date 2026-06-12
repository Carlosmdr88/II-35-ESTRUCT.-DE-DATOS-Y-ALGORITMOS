/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase02;

import java.util.Arrays;

/**
 *
 * @author carlo
 */
public class Clase02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[3];
        //arreglo de numeros 
        // ejemplo tengo por asi decir una variable que es un arreglo que 
        //le caben 3 numeros 
        //ejemplo con nombres
        //String [] nombres = new String[3];  
        String [] nombres = {"Esteban", "Katerin", "Luis"};  
        // como ingresar ejemplo en este caso decimos que tenes 3 espacios 
        // como bien sabemos se empieza de la posicion 0 
        //asi que ingresamos numeros segun las posicion
        numeros[0] = 5;
        numeros[1] = 3;
        numeros[2] = 10;
        
        //for con indices
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("cuando i es " + i + "el valor delnumero es " + numeros[i]);
        }
        // for con variables 
        for (String nombre : nombres) {
            System.out.println("Hola " + nombre);
        }
         // for con variables y  numeros 
         int idx = 0;
        for (String nombre : nombres) {
            System.out.println( (++idx) + "." + nombre);
        }
        
        
        System.out.println("Numeros" + Arrays.toString(numeros));
        System.out.println("Nombres:" + Arrays.toString(nombres));
        
        
        //Arreglo bidimensional
        //[][][]
        //[][][]
        //[][][]
        String [][] gato = new String [3][3];
        gato[0][0] = "O";
        gato[1][1] = "O";
        gato[2][2] = "O";
        
        for (int fila = 0; fila < gato.length; fila++) {
            for (int columna = 0; columna < gato[fila].length; columna++) {
                System.out.print("[" + gato[fila][columna] + "]");
            }
            System.out.println();
        }
        for (int fila = 0; fila < gato.length; fila++) {
            for (int columna = 0; columna < gato[fila].length; columna++) {
                
                String valor = 
                        gato[fila][columna] == null ?
                        "" : gato[fila][columna];
                
                System.out.print("[" + valor + "]");
            }
            System.out.println();
        }
        for (int fila = 0; fila < gato.length; fila++) {
            for (int columna = 0; columna < gato[fila].length; columna++) {
                
                String valor;
                //EXPRESION TERNARIA ( ES IGUAL QUE LA EXPRESION COMPLETA SOLO QUE MAS SIMPLIFICADA)
                valor = gato[fila][columna] == null ? "" : gato[fila][columna];
                
                //EXPRESION COMPLETA 
                if (gato[fila][columna] == null) {
                    valor = "";
                }
                else{ 
                    valor = gato[fila][columna];
                }
                System.out.print("[" + valor + "]");
            }
            System.out.println();
    
        }
    }   
    
}
