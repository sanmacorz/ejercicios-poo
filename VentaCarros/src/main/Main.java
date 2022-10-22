package main;

import controller.Controlador;
import model.Empresa;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
        Empresa miEmpresa = new Empresa();
        new Controlador(miVentanaPrincipal, miEmpresa);
    }
}
