// Considere el problema de administrar las calificaciones de los alumnos de un curso, en el cuál hay doce estudiantes, de cada uno de los cuáles se tiene la nota definitiva que obtuvo, se sabe que es un valor entre 0.0 y 5.0, se quiere construir un programa que permita: 1.Cambiar la nota de un estudiante. 2.Calcular el promedio del curso. 3.Establecer el número de estudiantes que están por encima de ese promedio.
package model;

import javax.swing.JOptionPane;

public class CalificacionesEstudiantesMaterias {
    public static void main(String[] args) {
        final int TOTAL_ESTUDIANTES = 3;
        final int TOTAL_MATERIAS = 4;
        double[][] notas;
        notas = new double[TOTAL_ESTUDIANTES][TOTAL_MATERIAS];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = Double.parseDouble(JOptionPane
                        .showInputDialog("Digite la nota del estudiante " + (i + 1) + " en la materia " + (j + 1)));
            }
        }
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                suma += notas[i][j];
            }
        }
        promedio = suma / (TOTAL_ESTUDIANTES * TOTAL_MATERIAS);
        System.out.println("Nota promedio del curso: " + promedio);
    }
}