/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto01;

/**
 *
 * @author carlo
 */
public class Operacion {
    private int valor;
    String tipo ;

    public Operacion(int valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }
    public Operacion inversa(){
        Operacion opInversa = this;
        return opInversa;
    } 
}
