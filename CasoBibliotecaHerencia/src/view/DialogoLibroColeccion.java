package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class DialogoLibroColeccion extends JDialog {
        private JLabel lbNombreLibro;
        private static JTextField tfNombreLibro;
        private JLabel lbNombreAutores;
        private static JTextField tfNombreAutores;
        private JLabel lbAnioEdicion;
        private static JTextField tfAnioEdicion;
        private JLabel lbLibroDeLujo;
        private ButtonGroup bgEsLibroDeLujo;
        private static JRadioButton rbEsLibroDeLujo;
        private static JRadioButton rbNoEsLibroDeLujo;
        private JLabel lbNombreColeccion;
        private static JTextField tfNombreColeccion;
        private JLabel lbNumeroColeccion;
        private static JTextField tfNumeroColeccion;
        public JButton btnAgregarLibro;

        public DialogoLibroColeccion() {
                lbNombreLibro = new JLabel("Nombre =");
                lbNombreLibro.setBounds(10, 20, 140, 20);

                tfNombreLibro = new JTextField();
                tfNombreLibro.setBounds(150, 20, 100, 25);

                lbNombreAutores = new JLabel("Autores =");
                lbNombreAutores.setBounds(10, 50, 260, 25);

                tfNombreAutores = new JTextField();
                tfNombreAutores.setBounds(150, 50, 100, 25);

                lbAnioEdicion = new JLabel("Año =");
                lbAnioEdicion.setBounds(10, 90, 140, 20);

                tfAnioEdicion = new JTextField();
                tfAnioEdicion.setBounds(150, 90, 100, 25);

                lbLibroDeLujo = new JLabel("Edición de lujo = ");
                lbLibroDeLujo.setBounds(10, 130, 140, 20);

                bgEsLibroDeLujo = new ButtonGroup();

                rbEsLibroDeLujo = new JRadioButton("Sí");
                rbEsLibroDeLujo.setFont(new Font("Serif", Font.PLAIN, 18));
                rbEsLibroDeLujo.setBackground(Color.decode("#eac435"));
                rbEsLibroDeLujo.setBounds(150, 130, 50, 30);
                bgEsLibroDeLujo.add(rbEsLibroDeLujo);

                rbNoEsLibroDeLujo = new JRadioButton("No");
                rbNoEsLibroDeLujo.setFont(new Font("Serif", Font.PLAIN, 18));
                rbNoEsLibroDeLujo.setBackground(Color.decode("#eac435"));
                rbNoEsLibroDeLujo.setBounds(200, 130, 50, 30);
                bgEsLibroDeLujo.add(rbNoEsLibroDeLujo);

                lbNombreColeccion = new JLabel("Nombre de colección =");
                lbNombreColeccion.setBounds(10, 170, 140, 20);

                tfNombreColeccion = new JTextField();
                tfNombreColeccion.setBounds(150, 170, 100, 25);

                lbNumeroColeccion = new JLabel("Número de colección =");
                lbNumeroColeccion.setBounds(10, 210, 140, 20);

                tfNumeroColeccion = new JTextField();
                tfNumeroColeccion.setBounds(150, 210, 100, 25);

                btnAgregarLibro = new JButton("Agregar");
                btnAgregarLibro.setBounds(120, 240, 100, 25);
                btnAgregarLibro.setActionCommand("crearLibroColeccion");

                this.setLayout(null);
                this.getContentPane().setBackground(Color.decode("#eac435"));
                this.setTitle("Agregar Libro de Colección");
                this.setSize(300, 300);
                this.setLocationRelativeTo(null);
                this.setResizable(false);
                this.setVisible(true);
                this.add(lbNombreLibro);
                this.add(tfNombreLibro);
                this.add(lbNombreAutores);
                this.add(tfNombreAutores);
                this.add(lbAnioEdicion);
                this.add(tfAnioEdicion);
                this.add(lbLibroDeLujo);
                this.add(rbEsLibroDeLujo);
                this.add(rbNoEsLibroDeLujo);
                this.add(lbNombreColeccion);
                this.add(tfNombreColeccion);
                this.add(lbNumeroColeccion);
                this.add(tfNumeroColeccion);
                this.add(btnAgregarLibro);
        }

        public static String getTfNombreLibro() {
                return tfNombreLibro.getText();
        }

        public static String getTfNombreAutores() {
                return tfNombreAutores.getText();
        }

        public static String getTfAnioEdicion() {
                return tfAnioEdicion.getText();
        }

        public static boolean getRbLibroDeLujo() {
                if (rbEsLibroDeLujo.isSelected()) {
                        return true;
                } else {
                        return false;
                }
        }

        public static String getTfNombreColeccion() {
                return tfNombreColeccion.getText();
        }

        public static String getTfNumeroColeccion() {
                return tfNumeroColeccion.getText();
        }

        public void agregarOyenteBoton(ActionListener al) {
                btnAgregarLibro.addActionListener(al);
        }

        public void cerrarDialogoAgregarJugador() {
                this.dispose();
        }
}
