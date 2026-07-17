/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inves2;

/**
 *
 * @author carlo
 */
import javax.swing.JOptionPane;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numeros = {8, 5, 3, };

        JOptionPane.showMessageDialog(null,
                "Arreglo original\n" + arregloTexto(numeros));

        // Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {

            JOptionPane.showMessageDialog(null,
                    "===== RECORRIDO " + (i + 1) + " =====");

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                String mensaje = "Comparando "
                        + numeros[j] + " con " + numeros[j + 1];

                if (numeros[j] > numeros[j + 1]) {

                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;

                    mensaje += "\n\nSe intercambian."
                            + "\n\nEstado del arreglo:\n"
                            + arregloTexto(numeros);

                } else {

                    mensaje += "\n\nNo se intercambian."
                            + "\n\nEstado del arreglo:\n"
                            + arregloTexto(numeros);
                }

                JOptionPane.showMessageDialog(null, mensaje);

            }

        }

        JOptionPane.showMessageDialog(null,
                "¡Ordenamiento finalizado!\n\n"
                + arregloTexto(numeros));

    }

    public static String arregloTexto(int[] arreglo) {

        String texto = "";

        for (int numero : arreglo) {
            texto += numero + " ";
        }

        return texto;
    }
}
