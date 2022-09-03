// Obtener la suma de los primeros N números enteros positivos, usando un ciclo while
package model;

import javax.swing.JOptionPane;

public class SumaNPrimerosNumeros {
    public static void main(String[] args) {
        int nNumeros;
        int iteraciones = 0;
        int resultadoFinal = 0;
        nNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (iteraciones < nNumeros) {
            iteraciones++;
            resultadoFinal += iteraciones;
        }

        JOptionPane.showMessageDialog(null,
                "La suma de los primeros " + (nNumeros) + " es igual a " + (resultadoFinal) + "!");
        System.exit(0);
    }
}