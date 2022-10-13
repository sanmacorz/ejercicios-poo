package main;

import controller.Controlador;
import model.Empleado;
import model.Empresa;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        Empresa miVentaCarros = new Empresa();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miVentaCarros);
    }
}
