package model;

import javax.swing.JOptionPane;

public class DobleNumero {
    public static void main(String[] args) {
        int numero;
        int doble;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número: "));
        doble = (numero * 2);
        JOptionPane.showMessageDialog(null, "El doble de " + numero + " es " + doble + "!", "Doble Número",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}