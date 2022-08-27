// Dado un número de 5 digitos, devolver el número en orden inverso.

package model;

import javax.swing.JOptionPane;

public class NumeroReverso {
    public static void main(String[] args) {
        String numero;
        numero = JOptionPane.showInputDialog("Digite el número: ");
        StringBuilder reverso = new StringBuilder(numero);
        reverso.reverse();
        JOptionPane.showMessageDialog(null, "El reverso de " + numero + " es " + reverso + "!", "Numero Reverso",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}