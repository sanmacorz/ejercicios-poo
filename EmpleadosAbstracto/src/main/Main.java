package main;

import model.Gerente;
import model.Operario;

public class Main {
    public static void main(String[] args) {
        Gerente miGerente = new Gerente("Félix", 5000, 50, 500, 5);
        System.out.println(miGerente.toString());

        System.out.println("--------------------------------");

        Operario miOperario = new Operario("Pedro", 1000, 200);
        System.out.println(miOperario.toString());
    }
}
