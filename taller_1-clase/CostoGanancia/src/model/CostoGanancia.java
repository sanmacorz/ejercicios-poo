package model;

import javax.swing.JOptionPane;

public class CostoGanancia {
    public static void main(String[] args) {
        int precioTotal;
        int precioCosto;
        int ganancia = 0;

        precioCosto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto: "));

        if (precioCosto < 3000) {
            ganancia = (int) (precioCosto * 0.15);
        } else if (precioCosto <= 6000 && precioCosto >= 3000) {
            ganancia = 500;
        } else if (precioCosto > 6000) {
            ganancia = (int) (precioCosto * 0.25);
        }

        precioTotal = precioCosto + ganancia;
        JOptionPane.showMessageDialog(null,
                "La ganancia por el producto es de $" + ganancia + " y el precio total es de $" + precioTotal + "!");
        System.exit(0);
    }
}