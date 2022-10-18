package view;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

public class PanelEntrada extends JPanel {
    private JLabel lbTitulo;
    public static JComboBox<String> cbEmpleados;
    private JLabel lbMarca;
    private JLabel lbPrecio;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfMarca;
    private static JTextField tfPrecio;
    private static final int NUMERO_EMPLEADOS = 10;

    public PanelEntrada() {
        lbTitulo = new JLabel("VENTA DE CARROS", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(10, 10, 480, 30);

        String[] nombresmiListaEmpleados = new String[NUMERO_EMPLEADOS];
        for (int i = 0; i < NUMERO_EMPLEADOS; i++) {
            nombresmiListaEmpleados[i] = "Empleado " + (i + 1);
        }

        cbEmpleados = new JComboBox<>(nombresmiListaEmpleados);
        cbEmpleados.setBounds(280, 70, 210, 30);

        lbMarca = new JLabel("Marca =");
        lbMarca.setFont(new Font("Serif", Font.PLAIN, 18));
        lbMarca.setForeground(Color.BLACK);
        lbMarca.setBounds(250, 115, 480, 30);

        tfMarca = new JTextField();
        tfMarca.setFont(new Font("Arial", Font.PLAIN, 18));
        tfMarca.setForeground(Color.BLACK);
        tfMarca.setBounds(340, 115, 170, 30);

        lbPrecio = new JLabel("Precio =");
        lbPrecio.setFont(new Font("Serif", Font.PLAIN, 18));
        lbPrecio.setForeground(Color.BLACK);
        lbPrecio.setBounds(250, 160, 480, 30);

        tfPrecio = new JTextField();
        tfPrecio.setFont(new Font("Arial", Font.PLAIN, 18));
        tfPrecio.setForeground(Color.BLACK);
        tfPrecio.setBounds(340, 160, 170, 30);

        iLogo = new ImageIcon("src/imgs/carro.png");

        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(20, 50, 220, 176);

        this.setLayout(null);
        this.setBackground(Color.decode("#5c9993"));
        this.setVisible(true);
        this.add(lbTitulo);
        this.add(cbEmpleados);
        this.add(lbMarca);
        this.add(tfMarca);
        this.add(lbPrecio);
        this.add(tfPrecio);
        this.add(lbLogo);
    }

    public static String getTfMarca() {
        return tfMarca.getText();
    }

    public static String getTfPrecio() {
        return tfPrecio.getText();
    }

    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Venta de Carros",
                JOptionPane.WARNING_MESSAGE);
        tfMarca.setText("");
        tfPrecio.setText("");
        PanelSalida.taResultados.setText("");
    }
}
