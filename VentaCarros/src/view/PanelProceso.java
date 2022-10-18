package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelProceso extends JPanel {
    public JButton btnVender;
    public static JButton btnCalcular;
    public JButton btnBorrar;
    public JButton btnSalir;

    public PanelProceso() {
        btnVender = new JButton("Vender");
        btnVender.setFont(new Font("Arial", Font.PLAIN, 14));
        btnVender.setForeground(Color.BLACK);
        btnVender.setBackground(Color.WHITE);
        btnVender.setBorder(BorderFactory.createRaisedBevelBorder());
        btnVender.setBounds(40, 22, 95, 40);
        btnVender.setActionCommand("venderCarro");

        btnCalcular = new JButton("Calcular");
        btnCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
        btnCalcular.setForeground(Color.BLACK);
        btnCalcular.setBackground(Color.WHITE);
        btnCalcular.setBorder(BorderFactory.createRaisedBevelBorder());
        btnCalcular.setBounds(155, 22, 95, 40);
        btnCalcular.setActionCommand("calcularSalario");

        btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        btnBorrar.setForeground(Color.BLACK);
        btnBorrar.setBackground(Color.WHITE);
        btnBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        btnBorrar.setBounds(270, 22, 95, 40);
        btnBorrar.setActionCommand("borrarTexto");

        btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Arial", Font.PLAIN, 14));
        btnSalir.setForeground(Color.BLACK);
        btnSalir.setBackground(Color.WHITE);
        btnSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        btnSalir.setBounds(385, 22, 95, 40);
        btnSalir.setActionCommand("cerrarVentana");

        this.setLayout(null);
        this.setBackground(Color.decode("#5c9993"));
        this.setVisible(true);
        this.add(btnVender);
        this.add(btnCalcular);
        this.add(btnBorrar);
        this.add(btnSalir);
    }

    public static void desactivarBotonCalcular() {
        btnCalcular.setEnabled(false);
    }

    public static void activarBotonCalcular() {
        btnCalcular.setEnabled(true);
    }
}
