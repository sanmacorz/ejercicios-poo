// Genera diez números pseudoaleatorios y los agrega a un arreglo para luego mostrarlos en pantalla
package model;

import javax.swing.JOptionPane;

public class ArrayNumerosAleatorios {
    public static void main(String[] args) {
        int[] array;
        String respuesta = "Los elementos del arreglo son: ";
        array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            respuesta += array[i] + ", ";
        }

        JOptionPane.showMessageDialog(null, respuesta);
        System.exit(0);
    }
}