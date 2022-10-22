package controller;

import model.Carro;
import model.Empleado;
import model.Empresa;
import view.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Empresa empresa;

    public Controlador(VentanaPrincipal pVenPrin, Empresa pEmpresa) {
        this.miVentanaPrincipal = pVenPrin;
        this.empresa = pEmpresa;
        this.miVentanaPrincipal.miPanelProceso.agregarOyentesBotones(this);
        this.miVentanaPrincipal.miPanelSalida.mostrarResultado(
                "App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nEmpresaAutomotriz\nControlador");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("agregarVendedor")) {
            miVentanaPrincipal.crearDialogoAgregarVendedor();
            this.miVentanaPrincipal.miDialogoEmpleado.agregarOyenteBoton(this);
        }

        if (comando.equals("agregar")) {
            String nombre = miVentanaPrincipal.miDialogoEmpleado.getNombreVendedor();
            empresa.agregarEmpleado(new Empleado(nombre));
            miVentanaPrincipal.miPanelEntrada.setEmpleado(nombre);
            miVentanaPrincipal.miPanelSalida.mostrarResultado("Se ha agreado un nuevo empleado. \nNombre: " + nombre);
            miVentanaPrincipal.miDialogoEmpleado.cerrarDialogoAgregarVendedor();
        }

        if (comando.equals("venderCarro")) {
            miVentanaPrincipal.crearDialogoVenderCarro();
            this.miVentanaPrincipal.miDialogoCarro.agregarOyenteBoton(this);
        }

        if (comando.equals("vender")) {
            int indexVendedor = miVentanaPrincipal.miPanelEntrada.getIndexEmpleado();

            double precio = Double.parseDouble(miVentanaPrincipal.miDialogoCarro.getPrecioCarro());

            Empleado emp = empresa.getEmpleado(indexVendedor);
            emp.venderCarro(new Carro(precio));
            miVentanaPrincipal.miPanelSalida
                    .mostrarResultado("El empleado: " + emp.getNombre() + " ha vendido un carro\nValor: " + precio);
            miVentanaPrincipal.miDialogoCarro.cerrarDialogoVenderCarro();
        }

        if (comando.equals("calcularSueldo")) {
            int indexVendedor = miVentanaPrincipal.miPanelEntrada.getIndexEmpleado();
            Empleado emple = empresa.getEmpleado(indexVendedor);
            emple.calcularSueldo();
            miVentanaPrincipal.miPanelSalida
                    .mostrarResultado("El sueldo del empleado: " + emple.getNombre() + " es " + emple.getSueldo());
        }

        if (comando.equals("liquidarNomina")) {
            double valorNomina = empresa.calcularNomina();
            StringBuilder listaEmpleados = new StringBuilder();
            for (int i = 0; i < empresa.getNumeroEmpleados(); i++) {
                listaEmpleados.append(listaEmpleados + empresa.getEmpleado(i).getNombre());
                listaEmpleados.append(": " + empresa.getEmpleado(i).getSueldo() + "\n");
            }
            miVentanaPrincipal.miPanelSalida
                    .mostrarResultado("El valor total de la nómina es." + valorNomina + "\n" + listaEmpleados);
        }

        if (comando.equals("salir")) {
            System.exit(0);
        }
    }
}
