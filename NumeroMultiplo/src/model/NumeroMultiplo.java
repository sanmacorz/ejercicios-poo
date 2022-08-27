// Determinar si un número es múltiple de 3 y 5
package model;

import javax.swing.JOptionPane;

public class NumeroMultiplo {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));
        if (numero % 3 == 0 && numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " SÍ es múltiplo de 3 y 5!");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " NO es múltiplo de 3 y 5!");
        }
        System.exit(0);
    }
}