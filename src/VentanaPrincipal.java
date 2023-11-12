import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;

public class VentanaPrincipal extends JFrame implements ActionListener, FocusListener {
    Container c;

    // Paneles
    JPanel panelNorte;

        // Titulo de la empresa
        JLabel empresaLelia = new JLabel("LeliaMerca");
        Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 20);
        Color fondoEmpresaLelia = new Color(103, 224, 93);
    JPanel panelCentral;

        // Color de fondo para el panel central
        Color fondoPanelCentral = new Color(193, 237, 184);

        // Lista de tipos de usuarios
        JLabel labelTipoUsuario = new JLabel("Escoja el tipo de usuario:");
        String [] users = {"Escoja cliente...", "Cliente esporádico", "Cliente Club", "Cliente Premium"};
        JComboBox<String> tipoUsuarios = new JComboBox<>(users);

        // Introducir credencial de usuario
        JLabel labelNombreUsuario = new JLabel("Usuario:");
        JTextField nombreUsuario = new JTextField();

        // Lista de tipo de servicio
        JLabel labelTipoServicio = new JLabel("Escoja el tipo de servicio:");
        String [] servicies = {"Escoja servicio...", "Hipermercado", "Gourmet", "Low Cost"};
        JComboBox<String> tipoServicios = new JComboBox<>(servicies);

    JPanel panelInferior;

    // Botones
    JButton aceptar = new JButton("Aceptar");

    public VentanaPrincipal() throws IOException {
        c = getContentPane();

        // Panel Norte
        panelNorte = new JPanel();
        panelNorte.setBackground(fondoEmpresaLelia);
        empresaLelia.setFont(fuenteCabecera);
        empresaLelia.setForeground(Color.WHITE);


        //Panel Central
        panelCentral = new JPanel();
        // nombreUsuario.setToolTipText("Nombre del usuario");
        panelCentral.setLayout(new GridLayout());
        panelCentral.setBackground(fondoPanelCentral);
        panelCentral.add(labelNombreUsuario);
        panelCentral.add(nombreUsuario);
        panelCentral.add(labelTipoUsuario);
        panelCentral.add(tipoUsuarios);
        panelCentral.add(labelTipoServicio);
        panelCentral.add(tipoServicios);

        // Panel Inferior
        panelInferior = new JPanel();
        // Añadir paneles para mostrar
        panelNorte.add(empresaLelia);
        panelCentral.add(aceptar);
        c.add(panelNorte, BorderLayout.NORTH);
        c.add(panelCentral, BorderLayout.CENTER);
        c.add(panelInferior, BorderLayout.SOUTH);

    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    }

    @Override
    public void focusGained(FocusEvent focusEvent) {

    }

    @Override
    public void focusLost(FocusEvent focusEvent) {

    }

    public static void main(String[] args) throws IOException {
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        vp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vp.setSize(500, 500);
    }
}
