package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntrada extends JPanel {
    private JLabel lbTitulo;
    private JLabel lbNombre;
    private JLabel lbPrecio;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfNombre;
    private static JTextField tfPrecio;

    public PanelEntrada() {
        lbTitulo = new JLabel("VENTA DE CARROS", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(10, 10, 480, 30);

        lbNombre = new JLabel("Nombre =");
        lbNombre.setFont(new Font("Serif", Font.PLAIN, 18));
        lbNombre.setForeground(Color.BLACK);
        lbNombre.setBounds(240, 55, 480, 30);

        tfNombre = new JTextField();
        tfNombre.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNombre.setForeground(Color.BLACK);
        tfNombre.setBounds(280, 55, 190, 30);

        lbPrecio = new JLabel("Precio =");
        lbPrecio.setFont(new Font("Serif", Font.PLAIN, 18));
        lbPrecio.setForeground(Color.BLACK);
        lbPrecio.setBounds(240, 95, 480, 30);

        tfPrecio = new JTextField();
        tfPrecio.setFont(new Font("Arial", Font.PLAIN, 18));
        tfPrecio.setForeground(Color.BLACK);
        tfPrecio.setBounds(280, 95, 190, 30);

        iLogo = new ImageIcon("src/imgs/carro.png");

        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(20, 60, 192, 96);

        this.setLayout(null);
        this.setBackground(Color.decode("#5c9993"));
        this.setVisible(true);
        this.add(lbTitulo);
        this.add(lbNombre);
        this.add(tfNombre);
        this.add(lbPrecio);
        this.add(tfPrecio);
        this.add(lbLogo);
    }

    public static String getTfNombre() {
        return tfNombre.getText();
    }

    public static String getTfPrecio() {
        return tfPrecio.getText();
    }

    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Venta de Carros",
                JOptionPane.WARNING_MESSAGE);
        tfNombre.setText("");
        tfPrecio.setText("");
        PanelSalida.taResultados.setText("");
    }
}
