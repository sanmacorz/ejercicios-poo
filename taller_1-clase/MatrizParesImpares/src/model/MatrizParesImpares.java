package model;

import javax.swing.JOptionPane;

public class MatrizParesImpares {
    public static void main(String[] args) {
        int m;
        int n;
        int[][] M;
        int[] A;
        int[] B;
        int elementosA = 0;
        int elementosB = 0;
        String respuesta = "La respuesta es: [";

        m = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        M = new int[m][n];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                M[i][j] = (int) (Math.random() * 10);
                respuesta += (M[i][j] + ", ");
                if (M[i][j] % 2 == 0) {
                    elementosA++;
                } else {
                    elementosB++;
                }
            }
        }
        respuesta += "]\n";

        A = new int[elementosA];
        B = new int[elementosB];
        int indiceA = 0;
        int indiceB = 0;

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] % 2 == 0) {
                    A[indiceA] = M[i][j];
                    indiceA++;
                } else {
                    B[indiceB] = M[i][j];
                    indiceB++;
                }
            }
        }
        respuesta += "Pares: ";
        for (int i = 0; i < A.length; i++) {
            respuesta += A[i] + ", ";
        }

        respuesta += "\nImpares: ";
        for (int i = 0; i < B.length; i++) {
            respuesta += B[i] + ", ";
        }
        JOptionPane.showMessageDialog(null, respuesta);
    }
}