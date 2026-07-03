/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Acumulador {

    private int total;
    private ArrayList<Operacion> undoStack;
    private ArrayList<Operacion> redoStack;

    public Acumulador() {
        total = 0;
        undoStack = new ArrayList<>();
        redoStack = new ArrayList<>();
    }

    public int getTotal() {
        return total;
    }

    public ArrayList<Operacion> getUndoStack() {
        return undoStack;
    }

    public ArrayList<Operacion> getRedoStack() {
        return redoStack;
    }

    public void aplicar(Operacion op) {

        if (op.getTipo() == TipoOperacion.SUMA) {
            total += op.getValor();
        } else {
            total -= op.getValor();
        }

        undoStack.add(op);

        // Si se hace una nueva operación, se limpia el redo
        redoStack.clear();

        System.out.println("Resultado después de aplicar:");
        System.out.println("Total: " + total);
        System.out.println("Undo: " + undoStack);
        System.out.println("Redo: " + redoStack);
    }

    public void undo() {

        if (undoStack.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay operaciones para deshacer.");
            return;
        }

        // Sacar la última operación
        Operacion op = undoStack.remove(undoStack.size() - 1);

        // Aplicar su inversa
        Operacion inversa = op.inversa();

        if (inversa.getTipo() == TipoOperacion.SUMA) {
            total += inversa.getValor();
        } else {
            total -= inversa.getValor();
        }

        // Guardar la operación original en Redo
        redoStack.add(op);

        System.out.println("Resultado después de Undo:");
        System.out.println("Total: " + total);
        System.out.println("Undo: " + undoStack);
        System.out.println("Redo: " + redoStack);
    }

    public void redo() {

        if (redoStack.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay operaciones para rehacer.");
            return;
        }

        // Sacar la última operación del redo
        Operacion op = redoStack.remove(redoStack.size() - 1);

        // Aplicarla nuevamente
        if (op.getTipo() == TipoOperacion.SUMA) {
            total += op.getValor();
        } else {
            total -= op.getValor();
        }

        // Volver a colocarla en Undo
        undoStack.add(op);

        System.out.println("Resultado después de Redo:");
        System.out.println("Total: " + total);
        System.out.println("Undo: " + undoStack);
        System.out.println("Redo: " + redoStack);
    }

    public void estado() {

        String undo = "UNDO:\n";

        if (undoStack.isEmpty()) {
            undo += "Vacío\n";
        } else {

            undo += "Fondo\n";

            for (Operacion op : undoStack) {
                undo += op + "\n";
            }

            undo += "Tope\n";
        }

        String redo = "REDO:\n";

        if (redoStack.isEmpty()) {
            redo += "Vacío\n";
        } else {

            redo += "Fondo\n";

            for (Operacion op : redoStack) {
                redo += op + "\n";
            }

            redo += "Tope\n";
        }

        JOptionPane.showMessageDialog(
                null,
                "TOTAL ACUMULADO: " + total + "\n\n"
                + undo + "\n"
                + redo
        );
    }
}
