/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package investigacion;

/**
 *
 * @author carlo
 */

public class BubbleSort {

    public static void main(String[] args) {

        int[] numeros = {8, 5, 3, 9, 1};

        System.out.println("Arreglo original:");
        mostrar(numeros);

        // Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {

            System.out.println("\nRecorrido " + (i + 1));

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    // Intercambio
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;

                    System.out.print("Cambio " + numeros[j + 1] + " ↔ " + numeros[j] + ": ");
                    mostrar(numeros);
                }

            }

        }

        System.out.println("\nArreglo ordenado:");
        mostrar(numeros);

    }

    public static void mostrar(int[] arreglo) {

        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }

        System.out.println();

    }

}