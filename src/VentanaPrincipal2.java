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

    // Paneles
    JPanel panel;
    JPanel panelTitulo;
    JPanel panelTitulo2;
    JPanel panelTitulo3;
    JPanel panelUsuario;

    // Panel titulo
    JLabel cabecera;
    JLabel cabecera2;

    // Panel usuario
    JTextField cuadroUser;
    JLabel user;

    // Colores y fuentes
    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
    Font fuenteCabeceraMenor = new Font("Maiandra GD", Font.BOLD, 15);
    Color fondoEmpresaLelia = new Color(103, 224, 93);

    public VentanaPrincipal2() {
        c = getContentPane();

        panel = new JPanel(layout);
        panel.setBackground(fondoEmpresaLelia);

        panelTitulo = new JPanel();
        panelTitulo.setBackground(fondoEmpresaLelia);
        cabecera = new JLabel("                                    LeliaMerca");
        cabecera2 = new JLabel("                                                                                                                                                   ");
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
        user.setFont(fuenteCabeceraMenor);
        cuadroUser = new JTextField(12);
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = REMAINDER;
        panelUsuario.add(user, gbc);
        panelUsuario.add(cuadroUser, gbc);

        panel.add(panelTitulo);
        panel.add(panelUsuario);

        c.add(panel);

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
