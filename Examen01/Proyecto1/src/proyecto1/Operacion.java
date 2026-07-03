/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author carlo
 */
public class Operacion {

    private int valor;
    private TipoOperacion tipo;

    public Operacion(int valor, TipoOperacion tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public TipoOperacion getTipo() {
        return tipo;
    }

    public Operacion inversa() {

        if (tipo == TipoOperacion.SUMA) {
            return new Operacion(valor, TipoOperacion.RESTA);
        } else {
            return new Operacion(valor, TipoOperacion.SUMA);
        }
    }

    @Override
    public String toString() {
        if (tipo == TipoOperacion.SUMA) {
            return "+" + valor;
        } else {
            return "-" + valor;
        }
    }

}
