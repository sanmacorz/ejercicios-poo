package model;

import javax.swing.JOptionPane;

public class ArrayNumerosCuadradoCubo {
    public static void main(String[] args) {
        int[] numerosBase = new int[5];
        int[] numerosElevados = new int[5];
        String respuesta = "Numeros base= [";

        for (int i = 0; i < numerosBase.length; i++) {
            numerosBase[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < numerosBase.length; i++) {
            if (numerosBase[i] % 2 == 0) {
                numerosElevados[i] = (int) (Math.pow(numerosBase[i], 2));
            } else {
                numerosElevados[i] = (int) (Math.pow(numerosBase[i], 3));
            }
        }

        for (int i = 0; i < numerosBase.length; i++) {
            if (i != numerosBase.length - 1) {
                respuesta = respuesta + numerosBase[i] + ", ";
            } else {
                respuesta = respuesta + numerosBase[i];
            }
        }

        respuesta += "]\nNumeros elevados= [";

        for (int i = 0; i < numerosElevados.length; i++) {
            if (i != numerosElevados.length - 1) {
                respuesta = respuesta + numerosElevados[i] + ", ";
            } else {
                respuesta = respuesta + numerosElevados[i];
            }
        }

        respuesta += "]";
        JOptionPane.showMessageDialog(null, respuesta);
        System.exit(0);
    }
}