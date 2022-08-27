// Recibe un número entero y calcula su cuadrado para mostrarlo en pantalla
package model;

import javax.swing.JOptionPane;

public class CuadradoNumero {
    public static void main(String[] args) {
        int i = 0;
        int numero = 0;
        int cuadrado = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        for (i = 1; i <= numero; i++) {
            cuadrado += (2 * i - 1);
        }

        JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es " + cuadrado + "!");
        System.exit(0);
    }
}