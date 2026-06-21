/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Acumulador {
private int total;
    ArrayList<Integer> undoStack;
    ArrayList<Integer> redoStack;
 
    public Acumulador() {
        undoStack = new ArrayList<>();
    }

 
    public int getTotal() {
        return total;
    }
 
    public ArrayList<Integer> getUndoStack() {
        return undoStack;
    }
 
    public ArrayList<Integer> getRedoStack() {
        return redoStack;
    }
 
    public void undo() {
 
    }
 
    public void redo() {
 
    }
 
    // puede ser positivo o negativo
    public void aplicar(int valor) {
        undoStack.add(valor);
        total = 0;
 
        for (Integer v : undoStack) {
            total += v;
        }
        System.out.println("Total:" + total);
        System.out.println("undoStack:" + undoStack);
    }
 
    public void estado() {
        JOptionPane.showMessageDialog(null,
                "UNDO:" + undoStack + "\n" + "REDO:" + redoStack);
    }

}