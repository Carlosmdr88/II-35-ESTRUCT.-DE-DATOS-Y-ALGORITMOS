/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01;

import java.time.LocalDate;

/**
 *
 * @author carlo
 */
public class LAB01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        LocalDate fechaNac = LocalDate.of(2001,9,15);
        Persona p2 = new Persona("juan", fechaNac);
        
        System.out.println(p1);
        System.out.println(p2);
        
        p2.Saludar();
    }
    
}
