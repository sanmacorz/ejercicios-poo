package main;

import controller.Controlador;
import model.Biblioteca;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miBiblioteca);
    }
}
