package controller;

import model.PlanTelefonia;
import view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
        private VentanaPrincipal miVentanaPrincipal;
        private PlanTelefonia modelo;

        public Controlador(VentanaPrincipal miVentanaPrincipal, PlanTelefonia modelo) {
                this.miVentanaPrincipal = miVentanaPrincipal;
                this.modelo = modelo;
                this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
        }

        public void actionPerformed(ActionEvent ae) {
                String comando = ae.getActionCommand();

                if (comando.equals("calcularMayor")) {
                        try {
                                this.modelo.setNumeroCelular(view.PanelEntrada.getTfNumero());
                                this.modelo.setOperadorCelular(view.PanelEntrada.getTfOperador());
                                this.modelo.setCantidadMinutos(Integer.parseInt(view.PanelEntrada.getTfMinutos()));
                                this.modelo.setCostoMinuto(Double.parseDouble(view.PanelEntrada.getTfCosto()));
                                this.modelo.calcularCostoTotal();
                                if (this.modelo.getOperadorCelular().equals("Movilujo")) {
                                        this.miVentanaPrincipal.miPanelSalida
                                                        .mostrarResultados(this.modelo.toString()
                                                                        + "\nCantidad de descuento: 50%");
                                } else {
                                        this.miVentanaPrincipal.miPanelSalida
                                                        .mostrarResultados(this.modelo.toString()
                                                                        + "\nCantidad de descuento: 0%");
                                }
                        } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Datos incorrectos.\nLos datos deben ser enteros!",
                                                "Suma 3 Enteros", JOptionPane.ERROR_MESSAGE);
                                view.PanelEntrada.borrarTf();
                        }
                } else if (comando.equals("borrarTexto")) {
                        view.PanelEntrada.borrarTf();
                        this.miVentanaPrincipal.miPanelSalida.borrarTa();
                } else if (comando.equals("cerrarVentana")) {
                        JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Suma 3 Enteros",
                                        JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                }
        }
}
