package model;

import javax.swing.JOptionPane;

public class SumaEnteros {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int resultado;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
        resultado = (numero1 + numero2);
        JOptionPane.showMessageDialog(null, "La suma de " + numero1 + " y " + numero2 + " es " + resultado + "!",
                "Suma Enteros", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}