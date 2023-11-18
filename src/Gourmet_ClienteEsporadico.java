import javax.swing.*;
import java.awt.*;

public class Gourmet_ClienteEsporadico extends JFrame {

    // Contenedor
    Container c;

    // Layouts
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    // Paneles
    JPanel panelNorte;
    JPanel panelSur;
    JPanel panelCentral;
    JPanel firtsImg;
    JPanel firstDesc;
    JPanel secondImg;
    JPanel secondDesc;
    JPanel thirdImg;
    JPanel thirdDesc;
    JPanel fourthImg;
    JPanel fourthDesc;

    // Panel superior
    JLabel cabecera;

    // Panel Central
    JLabel salmonDesc;
    JLabel vinoDesc;
    JLabel arrozDesc;
    JLabel fileteDesc;

    // Panel inferior
    JLabel mensajeCancelar;
    JButton cancelar;

    // Fuentes y Backgrounds
    Color fondoEmpresaLelia = new Color(207, 74, 74);
    Color fondoPagina = new Color(145, 15, 15);
    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
    Font fuenteDescripciones = new Font("Maiandra GD", Font.BOLD, 30);


    public Gourmet_ClienteEsporadico() {
        c = getContentPane();
        c.setBackground(fondoPagina);
        panelNorte = new JPanel(new GridLayout());
        panelNorte.setBackground(fondoEmpresaLelia);

        cabecera = new JLabel("LeliaMerca: Low Cost - Cliente esporádico");
        cabecera.setForeground(new Color(234, 190, 63));
        cabecera.setFont(fuenteCabecera);
        panelNorte.add(cabecera);

        // TODO: Panel Central

        panelSur = new JPanel(new GridLayout());
        panelSur.setBackground(fondoEmpresaLelia);

        mensajeCancelar = new JLabel("Para cancelar el pedido pulse el siguiente botón: ");
        mensajeCancelar.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        cancelar = new JButton("Cancelar");
        panelSur.add(mensajeCancelar);
        panelSur.add(cancelar);

        c.add(panelNorte, BorderLayout.NORTH);
        c.add(panelSur, BorderLayout.SOUTH);
       }

    public static void main(String[] args) {
        Gourmet_ClienteEsporadico lc_gm = new Gourmet_ClienteEsporadico();
        lc_gm.setTitle("LeliaMerca");
        lc_gm.setVisible(true);
        lc_gm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lc_gm.setSize(1800, 1000);
    }
}
