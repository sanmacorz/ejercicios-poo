package model;

import javax.swing.JOptionPane;

public class SumaPromedioParesMenores {
    public static void main(String[] args) {
        int k = 0;
        int c = 0;
        int suma = 0;
        int promedio = 0;

        k = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));

        while (0 < k) {
            if (c == 0) {
                if (k % 2 != 0) {
                    suma += k;
                    k -= 1;
                    suma += k;
                    c += 2;
                } else {
                    suma += k;
                    k -= 2;
                    c++;
                }
            } else {
                suma += k;
                k = k - 2;
                c++;
            }
        }
        promedio = suma / c;
        JOptionPane.showMessageDialog(null,
                "La suma de los números pares menores o iguales que " + k + " es: " + suma
                        + "\nEl promedio es: " + promedio);
        System.exit(0);
    }
}