package controller;

import model.Carro;
import model.Empleado;
import model.Empresa;
import view.PanelEntrada;
import view.PanelSalida;
import view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Carro miCarro;
    private ArrayList<Carro> carrosVendidos = new ArrayList<>();

    public Controlador(VentanaPrincipal miVentanaPrincipal, Empresa modelo) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.miPanelProceso.btnAgregar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("agregarCarro")) {
            String nombre = PanelEntrada.getTfNombre();
            int precio = Integer.parseInt(PanelEntrada.getTfPrecio());
            miCarro = new Carro(nombre, precio);
            PanelSalida.mostrarResultados("Se ha registrado una nueva venta!\n");
            carrosVendidos.add(miCarro);
        } else if (comando.equals("calcularSalario")) {
            Empleado.calcularSalario(carrosVendidos);

        } else if (comando.equals("borrarTexto")) {
            carrosVendidos.clear();
            view.PanelEntrada.borrarTf();
            this.miVentanaPrincipal.miPanelSalida.borrarTa();
        } else if (comando.equals("cerrarVentana")) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Venta de Carros",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
