package model;

import javax.swing.JOptionPane;

public class MultiplosDeCinco {
    public static void main(String[] args) {
        double M, N, C, D, Suma = 0, Contador = 0;
        double Promedio;
        M = Integer.parseInt(JOptionPane.showInputDialog("Digite el número inicial: "));
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite el número final: "));
        C = N - M;
        D = C;

        while (0 <= C) {
            if (M % 5 == 0) {
                Suma += M;
                Contador++;
            }
            M++;
            C -= 1;
        }

        M -= D + 1;
        Promedio = Suma / Contador;
        JOptionPane.showMessageDialog(null, "La suma de los múltiplos de 5 en el rango indicado " + "[" + M + " , " + N
                + "]" + "\nEs: " + Suma + "\nEl promedio es: " + Promedio);
        System.exit(0);
    }
}