package view;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public PanelEntrada miPanelEntrada;
    public PanelProceso miPanelProceso;
    public PanelSalida miPanelSalida;

    public VentanaPrincipal() {
        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10, 10, 530, 240);

        miPanelProceso = new PanelProceso();
        miPanelProceso.setBounds(10, 260, 530, 80);

        miPanelSalida = new PanelSalida();
        miPanelSalida.setBounds(10, 350, 530, 140);

        this.setTitle("Venta de Carros");
        this.setSize(558, 532);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(miPanelEntrada);
        this.add(miPanelProceso);
        this.add(miPanelSalida);
    }
}
