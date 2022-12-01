package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;

public class DialogoDepositar extends JDialog {
        private JLabel lbCantidadDepositar;
        private JTextField tfCantidadDepositar;
        public JButton btnDepositar;

        public DialogoDepositar() {
                lbCantidadDepositar = new JLabel("Cantidad: ");
                lbCantidadDepositar.setBounds(10, 20, 140, 20);

                tfCantidadDepositar = new JTextField();
                tfCantidadDepositar.setBounds(150, 20, 100, 25);

                btnDepositar = new JButton("Depositar");
                btnDepositar.setBounds(120, 180, 100, 25);
                btnDepositar.setActionCommand("depositarCuenta");

                this.setLayout(null);
                this.getContentPane().setBackground(Color.decode("#a3b18a"));
                this.setTitle("Depositar Sueldo");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);
                this.add(lbCantidadDepositar);
                this.add(tfCantidadDepositar);
                this.add(btnDepositar);
        }

        public String getCantidadDepositar() {
                return tfCantidadDepositar.getText();
        }

        public void agregarOyenteBoton(ActionListener al) {
                btnDepositar.addActionListener(al);
        }

        public void cerrarDialogoDepositar() {
                this.dispose();
        }
}
