// Convertir una cantidad de segundos en horas, minutos y segundos

package model;

import javax.swing.JOptionPane;

public class ConversionSegundos {
    public static void main(String[] args) {
        double segundos;
        double horas;
        double minutos;
        segundos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de segundos: "));
        horas = (segundos / 3600);
        minutos = (segundos / 60);
        JOptionPane.showMessageDialog(null,
                (int) segundos + " segundos es igual a " + String.format("%.4f", horas) + " horas!",
                "Segundos a Horas",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                (int) segundos + " segundos es igual a " + String.format("%.4f", minutos) + " minutos!",
                "Segundos a Minutos", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                (int) segundos + " segundos es igual a " + String.format("%.4f", segundos) + " segundos!",
                "Segundos a Segundos", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}