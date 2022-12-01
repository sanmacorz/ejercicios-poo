package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Banco;
import model.CuentaBancaria;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class DialogoDepositar extends JDialog {
        private JLabel lbCuentas;
        public JComboBox<CuentaBancaria> cbCuentas;
        private JLabel lbCantidadDepositar;
        private JTextField tfCantidadDepositar;
        public JButton btnDepositar;

        public DialogoDepositar() {
                lbCuentas = new JLabel("Cuentas =");
                lbCuentas.setFont(new Font("Serif", Font.PLAIN, 18));
                lbCuentas.setForeground(Color.BLACK);
                lbCuentas.setBounds(230, 95, 480, 30);

                cbCuentas = new JComboBox<>();
                cbCuentas.setFont(new Font("Arial", Font.PLAIN, 18));
                cbCuentas.setForeground(Color.BLACK);
                cbCuentas.setBounds(330, 95, 190, 30);

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
