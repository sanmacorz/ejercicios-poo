package model;

import javax.swing.JOptionPane;

public class DigitosNumeroEntero {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        if (numero >= 0 && numero <= 9) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " tiene un sólo dígito!");
        } else if (numero >= 10 && numero <= 99) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " tiene dos dígitos!");
        } else if (numero >= 100 && numero <= 999) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " tiene tres dígitos!");
        } else if (numero >= 1000) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " tiene más de 3 dígitos!");
        }
        System.exit(0);
    }
}