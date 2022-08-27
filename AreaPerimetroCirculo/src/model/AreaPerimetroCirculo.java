// Calcular el área y el perímetro de un círculo con las fórmulas correspondientes: P= 2 * π * r, A= π * r²

package model;

import javax.swing.JOptionPane;

public class AreaPerimetroCirculo {
    public static void main(String[] args) {
        int radio;
        double pi = Math.PI;
        double perimetro;
        double area;
        radio = Integer.parseInt(JOptionPane.showInputDialog("Digite el radio: "));
        perimetro = 2 * pi * radio;
        area = pi * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null,
                "El perímetro de un círculo con radio de " + radio + " es " + String.format("%.2f", perimetro) + "!",
                "Perímetro del círculo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "El área de un círculo con radio de " + radio + " es " + String.format("%.2f", area) + "!",
                "Área del círculo", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}