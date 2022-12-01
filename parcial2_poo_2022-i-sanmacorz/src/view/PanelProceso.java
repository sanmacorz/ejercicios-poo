package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelProceso extends JPanel {
        public JButton btnCrear;
        public JButton btnDepositar;
        public JButton btnRetirar;
        public JButton btnBorrar;
        public JButton btnSalir;

        public PanelProceso() {
                btnCrear = new JButton("Crear");
                btnCrear.setFont(new Font("Arial", Font.PLAIN, 14));
                btnCrear.setForeground(Color.BLACK);
                btnCrear.setBackground(Color.WHITE);
                btnCrear.setBorder(BorderFactory.createRaisedBevelBorder());
                btnCrear.setBounds(5, 22, 90, 40);
                btnCrear.setActionCommand("crearCuenta");

                btnDepositar = new JButton("Depositar");
                btnDepositar.setFont(new Font("Arial", Font.PLAIN, 14));
                btnDepositar.setForeground(Color.BLACK);
                btnDepositar.setBackground(Color.WHITE);
                btnDepositar.setBorder(BorderFactory.createRaisedBevelBorder());
                btnDepositar.setBounds(100, 22, 90, 40);
                btnDepositar.setActionCommand("depositarFondos");

                btnRetirar = new JButton("Retirar");
                btnRetirar.setFont(new Font("Arial", Font.PLAIN, 14));
                btnRetirar.setForeground(Color.BLACK);
                btnRetirar.setBackground(Color.WHITE);
                btnRetirar.setBorder(BorderFactory.createRaisedBevelBorder());
                btnRetirar.setBounds(195, 22, 90, 40);
                btnRetirar.setActionCommand("retirarFondos");

                btnBorrar = new JButton("Borrar");
                btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
                btnBorrar.setForeground(Color.BLACK);
                btnBorrar.setBackground(Color.WHITE);
                btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
                btnBorrar.setBounds(290, 22, 90, 40);
                btnBorrar.setActionCommand("borrarTexto");

                btnSalir = new JButton("Salir");
                btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
                btnSalir.setForeground(Color.BLACK);
                btnSalir.setBackground(Color.WHITE);
                btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
                btnSalir.setBounds(385, 22, 90, 40);
                btnSalir.setActionCommand("cerrarVentana");

                this.setLayout(null);
                this.setBackground(Color.decode("#a3b18a"));
                this.setVisible(true);
                this.add(btnCrear);
                this.add(btnDepositar);
                this.add(btnRetirar);
                this.add(btnBorrar);
                this.add(btnSalir);
        }
}
