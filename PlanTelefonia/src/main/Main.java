package main;

import controller.Controlador;
import model.PlanTelefonia;
import view.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        PlanTelefonia miPlanTelefonia = new PlanTelefonia();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new Controlador(miVentana, miPlanTelefonia);
    }
}
