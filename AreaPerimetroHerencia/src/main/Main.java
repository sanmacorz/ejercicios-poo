package main;

import model.Circulo;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));

        Circulo miCirculo = new Circulo(radio);
        miCirculo.calcularAreaPerimetro();
        JOptionPane.showMessageDialog(null, miCirculo.mostrarResultado());
        System.exit(0);
    }
}
