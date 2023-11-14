import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.GridBagConstraints.CENTER;
import static java.awt.GridBagConstraints.REMAINDER;

public class VentanaPrincipal2 extends JFrame implements ActionListener {

    Container c;

    // GridBagConstraint
    GridBagConstraints gbc = new GridBagConstraints();
    GridBagLayout layout = new GridBagLayout();
    GridLayout layoutGrid = new GridLayout();

    // Paneles
    JPanel panel;
    JPanel panel2;
    JPanel panelTitulo;
    JPanel panelUsuario;
    JPanel panelSuperior;

    // Panel titulo
    JLabel cabecera;
    JLabel cabecera2;

    // Panel usuario
    JTextField cuadroUser;
    JLabel user;
    JButton btnUser;

    // Colores y fuentes
    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
    Font fuenteCabeceraMenor = new Font("Maiandra GD", Font.BOLD, 17);
    Color fondoEmpresaLelia = new Color(103, 224, 93);

    public VentanaPrincipal2() {
        c = getContentPane();

        panel = new JPanel(layout);
        panel.setBackground(fondoEmpresaLelia);

        panelSuperior = new JPanel(layoutGrid);

        panelTitulo = new JPanel();
        panelTitulo.setBackground(fondoEmpresaLelia);
        cabecera = new JLabel("                                                   LeliaMerca");
        cabecera.setForeground(Color.WHITE);
        cabecera2 = new JLabel("                                                                                                                                                             ");
        cabecera.setFont(fuenteCabecera);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = CENTER;
        panelTitulo.add(cabecera, gbc);
        panelTitulo.add(cabecera2, gbc);

        panelUsuario = new JPanel();
        panelUsuario.setBackground(fondoEmpresaLelia);

        user = new JLabel("Usuario:");
        user.setForeground(Color.WHITE);
        user.setFont(fuenteCabeceraMenor);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUsuario.add(user, gbc);

        cuadroUser = new JTextField(12);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUsuario.add(cuadroUser, gbc);

        btnUser = new JButton("Entrar");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelUsuario.add(btnUser, gbc);

        panelSuperior.add(panelTitulo);
        panelSuperior.add(panelUsuario);

        panel.add(panelSuperior);

        c.add(panel, BorderLayout.NORTH);

    }

    public static void main(String[] args) {
        VentanaPrincipal2 mv = new VentanaPrincipal2();
        mv.setVisible(true);
        mv.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        mv.setSize(screenSize.width, screenSize.height);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
