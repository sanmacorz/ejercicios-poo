// Dado un carácter determinar si es una vocal
package model;

import javax.swing.JOptionPane;

public class CaracterVocal {
    public static void main(String[] args) {
        char caracter;
        caracter = JOptionPane.showInputDialog("Digite el carácter: ").toLowerCase().charAt(0);
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
            JOptionPane.showMessageDialog(null, "El carácter " + caracter + " SÍ es una vocal!");
        } else {
            JOptionPane.showMessageDialog(null, "El carácter " + caracter + " NO es una vocal!");
        }
        System.exit(0);
    }
}