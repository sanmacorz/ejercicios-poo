package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;

public class DialogoRetirar extends JDialog {
        private JLabel lbCantidadRetirar;
        private JTextField tfCantidadRetirar;
        public JButton btnRetirar;

        public DialogoRetirar() {
                lbCantidadRetirar = new JLabel("Cantidad: ");
                lbCantidadRetirar.setBounds(10, 20, 140, 20);

                tfCantidadRetirar = new JTextField();
                tfCantidadRetirar.setBounds(150, 20, 100, 25);

                btnRetirar = new JButton("Retirar");
                btnRetirar.setBounds(120, 180, 100, 25);
                btnRetirar.setActionCommand("retirarCuenta");

                this.setLayout(null);
                this.getContentPane().setBackground(Color.decode("#a3b18a"));
                this.setTitle("Retirar Sueldo");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);
                this.add(lbCantidadRetirar);
                this.add(tfCantidadRetirar);
                this.add(btnRetirar);
        }

        public String getCantidadDepositar() {
                return tfCantidadRetirar.getText();
        }

        public void agregarOyenteBoton(ActionListener al) {
                btnRetirar.addActionListener(al);
        }

        public void cerrarDialogoRetirar() {
                this.dispose();
        }
}
