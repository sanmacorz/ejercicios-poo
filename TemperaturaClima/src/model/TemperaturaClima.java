// Al ingresar el valor de una temperatura, obtener el tipo de clima
package model;

import javax.swing.JOptionPane;

public class TemperaturaClima {
    public static void main(String[] args) {
        int temperatura;
        String clima = null;
        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura: "));

        if (temperatura < 10) {
            clima = "Frío";
        } else if (temperatura >= 10 && temperatura <= 20) {
            clima = "Nublado";
        } else if (temperatura >= 21 && temperatura <= 30) {
            clima = "Calor";
        } else {
            clima = "Tropical";
        }

        JOptionPane.showMessageDialog(null,
                "Con una temperatura de " + temperatura + "°C el clima es: " + clima + "!");
        System.exit(0);
    }
}