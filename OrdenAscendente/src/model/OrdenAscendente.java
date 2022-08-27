// Dado tres numeros devolver los números en orden ascendente
package model;

import javax.swing.JOptionPane;

public class OrdenAscendente {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int mayor;
        int medio;
        int menor;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número: "));

        if (numero1 > numero2 && numero1 > numero3) {
            mayor = numero1;

            if (numero2 > numero3) {
                medio = numero2;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero2;
            }
        }

        else if (numero2 > numero1 && numero2 > numero3) {
            mayor = numero2;

            if (numero1 > numero3) {
                medio = numero1;
                menor = numero3;
            } else {
                medio = numero3;
                menor = numero1;
            }
        } else {
            mayor = numero3;

            if (numero2 > numero1) {
                medio = numero2;
                menor = numero1;
            } else {
                medio = numero1;
                menor = numero2;
            }
        }

        JOptionPane.showMessageDialog(null, "El orden ascendente es: " + menor + ", " + medio + ", " + mayor + "!");
        System.exit(0);
    }
}