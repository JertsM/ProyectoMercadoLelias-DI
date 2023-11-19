import javax.swing.*;
import java.awt.*;

public class Hipermercado_ClienteEsporadico extends JDialog {

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

Color fondoEmpresaLelia = new Color(113, 212, 93);
        Color fondoPagina = new Color(174, 250, 132);
        Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
        Font fuenteDescripciones = new Font("Maiandra GD", Font.BOLD, 30);
    }

    public Hipermercado_ClienteEsporadico() {



        

    public static void main(String[] args) {
        Hipermercado_ClienteEsporadico lc_hm = new Hipermercado_ClienteEsporadico();
        lc_hm.setTitle("LeliaMerca");
        lc_hm.setVisible(true);
        lc_hm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lc_hm.setSize(1800, 1000);
    }
}
