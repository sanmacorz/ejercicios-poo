package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class DialogoCarro extends JDialog {
    private JLabel lbPrecioCarro;
    private JLabel lbNombreEmpleado;
    private JTextField tfPrecioCarro;
    private JButton btVenderCarro;
    private String nombreEmpleado;

    public DialogoCarro() {
        nombreEmpleado = PanelEntrada.getEmpleado();
        lbNombreEmpleado = new JLabel("Vendedor: " + nombreEmpleado);
        lbNombreEmpleado.setBounds(10, 20, 140, 20);

        lbPrecioCarro = new JLabel("Precio Carro: ");
        lbPrecioCarro.setBounds(10, 50, 140, 20);

        tfPrecioCarro = new JTextField();
        tfPrecioCarro.setBounds(150, 50, 100, 25);

        btVenderCarro = new JButton("Vender");
        btVenderCarro.setBounds(20, 140, 260, 25);
        btVenderCarro.setActionCommand("vender");

        this.add(btVenderCarro);
        this.setLayout(null);
        this.add(lbNombreEmpleado);
        this.add(lbPrecioCarro);
        this.add(tfPrecioCarro);
        this.setTitle("Vender Carro");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    public String getPrecioCarro() {
        return tfPrecioCarro.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL) {
        btVenderCarro.addActionListener(pAL);
    }

    public void cerrarDialogoVenderCarro() {
        this.dispose();
    }
}
