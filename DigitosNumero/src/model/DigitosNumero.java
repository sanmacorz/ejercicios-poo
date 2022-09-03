// Dado un número, determinar la cantidad de dígitos que contiene
package model;

import javax.swing.JOptionPane;

public class DigitosNumero {
    public static void main(String[] args) {
        String numero;
        numero = JOptionPane.showInputDialog("Ingrese un número: ");
        int digitos = 0;
        char[] numeroLista = numero.toCharArray();

        for (int i = 0; i < numeroLista.length; i++) {
            digitos++;
        }

        JOptionPane.showMessageDialog(null, "El número " + numero + " tiene " + digitos + " digitos!");
        System.exit(0);
    }
}