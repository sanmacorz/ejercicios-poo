// Obtener la suma de los primeros N números enteros positivos, usando un ciclo for
package model;

import javax.swing.JOptionPane;

public class SumatoriaNPrimerosNumeros {
    public static void main(String[] args) {
        int nNumeros;
        int resultadoFinal = 0;
        nNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:  "));

        for (int iteraciones = 0; iteraciones <= nNumeros; iteraciones++) {
            resultadoFinal += iteraciones;
        }

        JOptionPane.showMessageDialog(null,
                "La suma de los primeros " + (nNumeros) + " es igual a " + (resultadoFinal) + "!");
        System.exit(0);
    }
}