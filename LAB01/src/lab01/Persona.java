/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class Persona {
   private String nombre;
   private LocalDate  fechaNacimiento;
   private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        //ALGORITMOS
        //1. Fecha de Nacimiento, necesito
        if (this.fechaNacimiento == null){
            return 0;
        }
        
        //2. Necesito la fecha Actual
        LocalDate hoy = LocalDate.now();
        
        //3. calcular la diferencia entre las fechas 
        int yNow = hoy.getYear();
        int yFecNam = fechaNacimiento.getYear();
        
        
        
        
        Period periodo = Period.between(fechaNacimiento, hoy);
        //return yNow - yFecNam;
        return periodo.getYears();
    }

    public Persona() {
        this.nombre = "NO INDICA NOMBRE";
        this.fechaNacimiento = LocalDate.now();
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(Date fechaNacimiento) {
        this.nombre = "NO INDICA NOMBRE";
        this.fechaNacimiento = LocalDate.now();
    }

  
    public String toString2() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + '}';
    }

    //Quiere decir que estoy sobreescribiendo 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre).append(" Edad=").append(edad);
        return sb.toString();
    }

    public void Saludar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hola Soy");
        sb.append(nombre).append(" y tengo ").append(edad);
        sb.append(" años ");
        
        System.out.println(sb.toString());
    }

  
    
}
