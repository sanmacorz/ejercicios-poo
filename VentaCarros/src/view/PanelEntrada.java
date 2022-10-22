package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {
    private JLabel lbEmpleados;
    private static JComboBox<String> cbEmpleados;

    public PanelEntrada() {
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        lbEmpleados = new JLabel("Empleados: ", SwingConstants.RIGHT);
        lbEmpleados.setBounds(0, 90, 100, 20);
        this.add(lbEmpleados);

        cbEmpleados = new JComboBox<>();
        cbEmpleados.setBounds(100, 90, 260, 20);
        this.add(cbEmpleados);

        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public static String getEmpleado() {
        return (String) cbEmpleados.getSelectedItem();
    }

    public int getIndexEmpleado() {
        return cbEmpleados.getSelectedIndex();
    }

    public void setEmpleado(String emp) {
        cbEmpleados.addItem(emp);
    }
}
