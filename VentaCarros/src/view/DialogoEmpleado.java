package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoEmpleado extends JDialog {
    private JLabel lbNombreVendedor;
    private JTextField tfNombreVendedor;
    private JButton btAgregarVendedor;

    public DialogoEmpleado() {
        lbNombreVendedor = new JLabel("Vendedor: ");
        lbNombreVendedor.setBounds(10, 50, 140, 20);

        tfNombreVendedor = new JTextField();
        tfNombreVendedor.setBounds(150, 50, 100, 25);

        btAgregarVendedor = new JButton("Agregar");
        btAgregarVendedor.setBounds(20, 140, 260, 25);
        btAgregarVendedor.setActionCommand("agregar");

        this.setLayout(null);
        this.add(lbNombreVendedor);
        this.add(tfNombreVendedor);
        this.add(btAgregarVendedor);
        this.setTitle("Agregar Vendedor");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public String getNombreVendedor() {
        return tfNombreVendedor.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL) {
        btAgregarVendedor.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarVendedor() {
        this.dispose();
    }
}
