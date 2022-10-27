package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelProceso extends JPanel {
        public JButton btnCalcular;
        public JButton btnBorrar;
        public JButton btnSalir;

        public PanelProceso() {
                btnCalcular = new JButton("Calcular");
                btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
                btnCalcular.setForeground(Color.BLACK);
                btnCalcular.setBackground(Color.WHITE);
                btnCalcular.setBorder(BorderFactory.createRaisedBevelBorder());
                btnCalcular.setBounds(82, 22, 95, 40);
                btnCalcular.setActionCommand("calcularMayor");

                btnBorrar = new JButton("Borrar");
                btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
                btnBorrar.setForeground(Color.BLACK);
                btnBorrar.setBackground(Color.WHITE);
                btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
                btnBorrar.setBounds(217, 22, 95, 40);
                btnBorrar.setActionCommand("borrarTexto");

                btnSalir = new JButton("Salir");
                btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
                btnSalir.setForeground(Color.BLACK);
                btnSalir.setBackground(Color.WHITE);
                btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
                btnSalir.setBounds(354, 22, 95, 40);
                btnSalir.setActionCommand("cerrarVentana");

                this.setLayout(null);
                this.setBackground(Color.decode("#734b96"));
                this.setVisible(true);
                this.add(btnCalcular);
                this.add(btnBorrar);
                this.add(btnSalir);
        }
}
