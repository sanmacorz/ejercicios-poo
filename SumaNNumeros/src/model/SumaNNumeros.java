// Determina la suma de los primeros N números enteros positivos, usando la fórmula S=N*(N+1)/2

package model;

import javax.swing.JOptionPane;

public class SumaNNumeros {
    public static void main(String[] args) {
        int nNumeros;
        int suma;
        nNumeros = Integer.parseInt(JOptionPane.showInputDialog("Digite el número: "));
        suma = (nNumeros * (nNumeros + 1) / 2);
        JOptionPane.showMessageDialog(null,
                "La suma de los primeros " + nNumeros + " números enteros positivos es " + suma + "!", "Suma N Números",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}