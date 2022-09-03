// Dados dos números, diga si son amigos. Dos números son amigos si la suma de los divisores de uno de ellos es igual al otro
package model;

import javax.swing.JOptionPane;

public class NumerosAmigos {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int sumaDivisores1 = 0;
        int sumaDivisores2 = 0;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));

        for (int divisores = 1; divisores <= (numero1 + 1); divisores++) {
            if (numero1 % divisores == 0) {
                sumaDivisores1 += divisores;
            }
        }

        for (int divisores = 1; divisores <= (numero2 + 1); divisores++) {
            if (numero2 % divisores == 0) {
                sumaDivisores2 += divisores;
            }
        }

        if (sumaDivisores1 == sumaDivisores2) {
            JOptionPane.showMessageDialog(null, "Los números " + numero1 + " y " + numero2 + " SÍ son amigos!");
        } else {
            JOptionPane.showMessageDialog(null, "Los números " + numero1 + " y " + numero2 + " NO son amigos!");
        }
        System.exit(0);
    }
}