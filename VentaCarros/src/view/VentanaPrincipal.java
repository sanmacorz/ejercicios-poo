package view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public PanelEntrada miPanelEntrada;
    public PanelProceso miPanelProceso;
    public PanelSalida miPanelSalida;
    public DialogoEmpleado miDialogoEmpleado = null;
    public DialogoCarro miDialogoCarro = null;

    public VentanaPrincipal() {
        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10, 10, 380, 190);

        miPanelProceso = new PanelProceso();
        miPanelProceso.setBounds(10, 220, 380, 120);

        miPanelSalida = new PanelSalida();
        miPanelSalida.setBounds(10, 350, 380, 190);

        this.setLayout(null);
        this.add(miPanelEntrada);
        this.add(miPanelProceso);
        this.add(miPanelSalida);
        this.setTitle("Empresa Automotriz");
        this.setSize(400, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void crearDialogoAgregarVendedor() {
        miDialogoEmpleado = new DialogoEmpleado();
    }

    public void crearDialogoVenderCarro() {
        miDialogoCarro = new DialogoCarro();
    }
}
