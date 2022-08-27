// Calcular el gasto de agua de una vivienda tomando en cuenta la cantidad de metros cubicos gastados, a partir del sistema de cobro.

package model;

import javax.swing.JOptionPane;

public class GastoAgua {
    public static void main(String[] args) {
        int gastoAgua;
        int cuotaFija = 10000;
        int costoTotal = 0;
        gastoAgua = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el gasto de agua mensual: "));

        if (gastoAgua < 50) {
            costoTotal = cuotaFija;
        } else if (gastoAgua >= 50 && gastoAgua <= 200) {
            gastoAgua -= 50;
            costoTotal = cuotaFija + (gastoAgua * 2000);
        } else {
            gastoAgua -= 50;
            costoTotal = cuotaFija + (gastoAgua * 3000);
        }

        JOptionPane.showMessageDialog(null,
                "Con un gasto de agua de " + (gastoAgua += 50) + " m3 mensuales el costo total es: " + costoTotal
                        + "!");
        System.exit(0);
    }
}