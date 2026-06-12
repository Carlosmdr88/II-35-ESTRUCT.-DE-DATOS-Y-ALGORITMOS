/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase02;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Meses {

    ////Completamos los meses 
    static String[] meses = {
        null, "ENE", "FEB", "MAR", "ABR", "MAY", "JUN",
        "JUL", "AGO", "SEP", "OCT", "NOV", "DIC"
    };

    public static void main(String[] args) {
        //hacemos un try con:
        // 1 parte hacemos la lista que se va a mostrar implementamos un for y se imprime la lista
        try {
            String lista = "";
            int idx = 0;

            for (String mes : meses) {
                if (mes != null) {
                    lista += ++idx + ". " + mes + "\n";
                }
            }

            JOptionPane.showMessageDialog(
                    null,
                    lista,
                    "MESES",
                    JOptionPane.INFORMATION_MESSAGE);
            //SOLICITAMOS QUE SE INGRESE UN NUMERO 
            String dato = JOptionPane.showInputDialog(
                    "Digite un número de mes (1-12):");

            int numMes = Integer.parseInt(dato);

            if (numMes < 1 || numMes > 12) {
                throw new Exception("Mes fuera de rango");
            }

            JOptionPane.showMessageDialog(
                    null,
                    "El mes seleccionado es: " + meses[numMes]
            );

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error: Debe ingresar un número válido."
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: El número debe estar entre 1 y 12."
            );
        }
    }
}

//Meses m = new Meses();
//int mes = 5;
//MOSTRAR UN MESNAJE 
//JOptionPane.showMessageDialog(null, m.meses, "MESES",
//JOptionPane.ERROR_MESSAGE);
//PEDIR UN DATO EN AL VENTANA 
//String size = JOptionPane.showInputDialog(null, "Tamaño del arreglo");
//System.out.println(Arrays.toString(m.meses));
//System.out.println(m.meses[mes]);
//Investigar del TRY Y CAST 
//PRUEBAS 
// for con variables y  numeros 
//int idx = 0;
//for (String nombre : nombres) {
//   System.out.println( (++idx) + "." + nombre);
//}

