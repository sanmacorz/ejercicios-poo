package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelProceso extends JPanel {
    private JButton btAgregarVendedor;
    private JButton btVenderCarro;
    private JButton btCalcularSueldo;
    private JButton btLiquidarNomina;
    private JButton btSalir;

    public PanelProceso() {
        btAgregarVendedor = new JButton("Agregar Vendedor");
        btAgregarVendedor.setBounds(10, 20, 170, 20);
        btAgregarVendedor.setActionCommand("agregarVendedor");

        btVenderCarro = new JButton("Vender Carro");
        btVenderCarro.setBounds(10, 50, 170, 20);
        btVenderCarro.setActionCommand("venderCarro");

        btCalcularSueldo = new JButton("Calcular Sueldo");
        btCalcularSueldo.setBounds(10, 80, 170, 20);
        btCalcularSueldo.setActionCommand("calcularSueldo");

        btLiquidarNomina = new JButton("Liquidar Nómina");
        btLiquidarNomina.setBounds(190, 20, 170, 20);
        btLiquidarNomina.setActionCommand("liquidarNomina");

        btSalir = new JButton("Salir");
        btSalir.setBounds(190, 50, 170, 20);
        btSalir.setActionCommand("salir");

        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);

        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.add(btAgregarVendedor);
        this.add(btVenderCarro);
        this.add(btCalcularSueldo);
        this.add(btLiquidarNomina);
        this.add(btSalir);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL) {
        btAgregarVendedor.addActionListener(pAL);
        btVenderCarro.addActionListener(pAL);
        btCalcularSueldo.addActionListener(pAL);
        btLiquidarNomina.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }

}
