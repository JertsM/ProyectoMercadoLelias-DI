import javax.swing.*;
import java.awt.*;

public class Hipermercado_ClienteEsporadico extends JDialog {
    public Hipermercado_ClienteEsporadico() {



        Color fondoEmpresaLelia = new Color(113, 212, 93);
        Color fondoPagina = new Color(174, 250, 132);
        Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
        Font fuenteDescripciones = new Font("Maiandra GD", Font.BOLD, 30);
    }

    public static void main(String[] args) {
        Hipermercado_ClienteEsporadico lc_hm = new Hipermercado_ClienteEsporadico();
        lc_hm.setTitle("LeliaMerca");
        lc_hm.setVisible(true);
        lc_hm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lc_hm.setSize(1800, 1000);
    }
}
