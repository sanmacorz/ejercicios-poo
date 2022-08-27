// Dado dos números enteros diferentes, devolver el número mayor
package model;

import javax.swing.JOptionPane;

public class Mayor2Enteros {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int mayor;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));

        if (numero1 > numero2) {
            mayor = numero1;
        } else {
            mayor = numero2;
        }

        JOptionPane.showMessageDialog(null, "El mayor es " + mayor + "!");
        System.exit(0);
    }
}