// Considere el problema de administrar las calificaciones de los alumnos de un curso, en el cuál hay doce estudiantes, de cada uno de los cuáles se tiene la nota definitiva que obtuvo, se sabe que es un valor entre 0.0 y 5.0, se quiere construir un programa que permita: 1.Cambiar la nota de un estudiante. 2.Calcular el promedio del curso. 3.Establecer el número de estudiantes que están por encima de ese promedio.
package model;

import javax.swing.JOptionPane;
import java.util.Random;

public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        final int TOTAL_ESTUDIANTES = 12;
        double[] notas = new double[TOTAL_ESTUDIANTES];
        Random numerosAleatorios = new Random();
        int indiceNotaNueva;
        int notaNueva;
        double promedioCurso = 0.0;
        int numeroEstudiantesEncima = 0;
        String resultadoNotas = "notas = [";
        String resultadoNotasCambiadas = "notas = [";

        for (int i = 0; i < TOTAL_ESTUDIANTES; i++) {
            notas[i] = Math.round(numerosAleatorios.nextDouble() * 5.0 * 10.0) / 10.0;
            if (i != TOTAL_ESTUDIANTES - 1) {
                resultadoNotas += notas[i] + ", ";
            } else {
                resultadoNotas += notas[i] + "]";
            }
        }
        JOptionPane.showMessageDialog(null, resultadoNotas);

        indiceNotaNueva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota que quiere cambiar: "));
        notaNueva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva nota: "));
        notas[indiceNotaNueva] = notaNueva;

        for (int i = 0; i < TOTAL_ESTUDIANTES; i++) {
            if (i != TOTAL_ESTUDIANTES - 1) {
                resultadoNotasCambiadas += notas[i] + ", ";
            } else {
                resultadoNotasCambiadas += notas[i] + "]";
            }
        }
        JOptionPane.showMessageDialog(null, resultadoNotasCambiadas);

        for (int i = 0; i < notas.length; i++) {
            promedioCurso += notas[i];
        }
        promedioCurso /= TOTAL_ESTUDIANTES;
        JOptionPane.showMessageDialog(null, "El promedio del curso es: " + promedioCurso);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > promedioCurso) {
                numeroEstudiantesEncima++;
            }
        }
        JOptionPane.showMessageDialog(null, "Los estudiantes son " + numeroEstudiantesEncima);

    }
}