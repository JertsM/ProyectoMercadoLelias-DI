import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal2 extends JFrame implements ActionListener {
    Container c;
    GridBagLayout layout1;
    GridBagConstraints constraints1;
    JPanel panelNorte;
    JPanel subPanelNorteCentro;
    JPanel subPanelNorteEste;

    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
    Color fondoEmpresaLelia = new Color(103, 224, 93);
    JLabel cabecera;

    JLabel inputNombre;
    JTextField nombreUsuario;
    JButton inciarSesion;
    public VentanaPrincipal2() {
        c = getContentPane();
        // Panel norte
        panelNorte = new JPanel();
        layout1 = new GridBagLayout();
        panelNorte.setLayout(layout1);
        constraints1 = new GridBagConstraints();
        panelNorte.setBackground(fondoEmpresaLelia);

        // SubPanelCentral
        subPanelNorteCentro = new JPanel();
        nombreUsuario = new JTextField(10);
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.anchor = GridBagConstraints.CENTER;

        // Label de la cabecera
        cabecera = new JLabel("LeliaMerca");
        cabecera.setFont(fuenteCabecera);
        cabecera.setForeground(Color.WHITE);
        subPanelNorteCentro.add(cabecera);

        // SubPanel Este
        subPanelNorteEste = new JPanel();

        // Label del input del nombre de usuario
        inputNombre = new JLabel("Nombre de usuario");
        inputNombre.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        inputNombre.setForeground(Color.WHITE);

        // Cuadro de texto del nombre de usuario


        constraints1 = new GridBagConstraints();

        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.gridwidth = 1;
        constraints1.gridheight = 1;
        constraints1.anchor = GridBagConstraints.EAST;
        subPanelNorteEste.add(inputNombre);
        subPanelNorteEste.add(nombreUsuario);

        // Adición de paneles
        panelNorte.add(subPanelNorteCentro);
        panelNorte.add(subPanelNorteEste);

        c.add(panelNorte);
    }

    public static void main(String[] args) {
        VentanaPrincipal2 mv = new VentanaPrincipal2();
        mv.setVisible(true);
        mv.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mv.setSize(1000, 1000);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
