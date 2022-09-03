// Dado un número, determinar la cantidad de dígitos pares que contiene
package model;

import javax.swing.JOptionPane;

public class DigitosParesNumero {
    public static void main(String[] args) {
        String numero;
        numero = JOptionPane.showInputDialog("Ingrese un número: ");
        int digitos = 0;
        char[] numeroLista = numero.toCharArray();

        for (int i = 0; i < numeroLista.length; i++) {
            if (i % 2 == 0) {
                digitos++;
            }
        }

        JOptionPane.showMessageDialog(null, "El número " + numero + " tiene " + digitos + " digitos pares!");
        System.exit(0);
    }
}