package main;

import controller.Controlador;
import model.Banco;
import view.VentanaPrincipal;

public class Main {
        public static void main(String[] args) {
                VentanaPrincipal miVentana = new VentanaPrincipal();
                Banco miBanco = new Banco();
                new Controlador(miVentana, miBanco);
        }
}
