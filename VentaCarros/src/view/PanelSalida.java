package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelSalida extends JPanel {
    private JTextArea taResultado;
    private JScrollPane spResultado;

    public PanelSalida() {
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10, 20, 360, 150);
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);

        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.add(spResultado);
        this.setBorder(borde);
    }

    public void mostrarResultado(String msj) {
        taResultado.setText(msj);
    }
}
