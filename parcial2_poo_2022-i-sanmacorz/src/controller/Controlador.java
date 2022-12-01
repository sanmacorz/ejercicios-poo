package controller;

import model.Banco;
import model.CuentaBancaria;
import model.CuentaCorriente;
import model.CuentaAhorro;
import model.CuentaLibreta;
import view.VentanaPrincipal;
import view.PanelEntrada;
import view.PanelSalida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador implements ActionListener {
        private VentanaPrincipal miVentanaPrincipal;
        private Banco banco;

        public Controlador(VentanaPrincipal miVentanaPrincipal, Banco banco) {
                this.miVentanaPrincipal = miVentanaPrincipal;
                this.banco = banco;
                this.miVentanaPrincipal.miPanelProceso.btnCrear.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnDepositar.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnRetirar.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
                this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
        }

        public void actionPerformed(ActionEvent ae) {
                String comando = ae.getActionCommand();

                if (comando.equals("crearCuenta")) {
                        Double fondos = Double.valueOf(PanelEntrada.getTfFondos());
                        if (PanelEntrada.getCuenta().equals("Cuenta Corriente")) {
                                CuentaBancaria cuenta = new CuentaCorriente(fondos);
                                banco.agregarCuenta(cuenta);
                        } else if (PanelEntrada.getCuenta().equals("Cuenta de Ahorros")) {
                                banco.agregarCuenta(new CuentaAhorro(fondos));
                        } else if (PanelEntrada.getCuenta().equals("Cuenta de Libreta")) {
                                banco.agregarCuenta(new CuentaLibreta(fondos));
                        }
                        PanelSalida.mostrarResultados("Se ha creado una nueva cuenta!\n");
                } else if (comando.equals("depositarFondos")) {
                        miVentanaPrincipal.crearDialogoDepositar();
                        miVentanaPrincipal.miDialogoDepositar.agregarOyenteBoton(this);
                } else if (comando.equals("retirarFondos")) {
                        miVentanaPrincipal.crearDialogoRetirar();
                        miVentanaPrincipal.miDialogoRetirar.agregarOyenteBoton(this);
                } else if (comando.equals("depositarCuenta")) {
                        // miCuenta = cb.get
                        Integer cantidad = Integer
                                        .valueOf(miVentanaPrincipal.miDialogoDepositar.getCantidadDepositar());
                        // miCuenta.depositar(cantidad);
                        PanelSalida.mostrarResultados("Se ha depositado saldo de la cuenta!");
                } else if (comando.equals("retirarCuenta")) {
                        // cuenta = cb.get
                        Integer cantidad = Integer
                                        .valueOf(miVentanaPrincipal.miDialogoDepositar.getCantidadDepositar());
                        // cuenta.retirar(cantidad);
                        PanelSalida.mostrarResultados("Se ha retirado saldo de la cuenta!");
                } else if (comando.equals("borrarTexto")) {
                        view.PanelEntrada.borrarTf();
                        this.miVentanaPrincipal.miPanelSalida.borrarTa();
                } else if (comando.equals("cerrarVentana")) {
                        JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Caso Banco",
                                        JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                }
        }
}
