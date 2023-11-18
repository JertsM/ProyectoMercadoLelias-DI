import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LowCost_ClienteEsporadico extends JFrame {

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

    // Fuentes y backgrounds
    Color fondoEmpresaLelia = new Color(113, 212, 93);
    Color fondoPagina = new Color(174, 250, 132);
    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
    Font fuenteDescripciones = new Font("Maiandra GD", Font.BOLD, 30);


    public LowCost_ClienteEsporadico(){
        c = getContentPane();
        panelNorte = new JPanel(new GridLayout());
        panelNorte.setBackground(fondoPagina);

        cabecera = new JLabel("LeliaMerca: Low Cost - Cliente esporádico");
        cabecera.setForeground(Color.WHITE);
        cabecera.setFont(fuenteCabecera);
        panelNorte.add(cabecera);

        panelCentral = new JPanel(gbl);
        panelCentral.setBackground(fondoEmpresaLelia);
        firtsImg = new JPanel();
        firtsImg.setBackground(fondoEmpresaLelia);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Image salmon = cargarImagen("./src/LowCost/salmon.png", 150, 200);
        assert salmon != null;
        JLabel lSalmon = new JLabel(new ImageIcon(salmon));
        firtsImg.add(lSalmon);
        panelCentral.add(firtsImg, gbc);

        firstDesc = new JPanel();
        firstDesc.setBackground(fondoEmpresaLelia);
        gbc = new GridBagConstraints();
        salmonDesc = new JLabel("Salmón Skandia: 2.5€");
        salmonDesc.setFont(fuenteDescripciones);
        salmonDesc.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        firstDesc.add(salmonDesc);
        panelCentral.add(firstDesc, gbc);

        secondImg = new JPanel();
        secondImg.setBackground(fondoEmpresaLelia);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Image vinoBlanco = cargarImagen("./src/LowCost/vino.png", 150, 200);
        assert vinoBlanco != null;
        JLabel lVino = new JLabel(new ImageIcon(vinoBlanco));
        secondImg.add(lVino);
        panelCentral.add(secondImg, gbc);

        secondDesc = new JPanel();
        gbc = new GridBagConstraints();
        secondDesc.setBackground(fondoEmpresaLelia);
        vinoDesc = new JLabel("Vino Blanco 'Don Bernandino': 3€");
        vinoDesc.setFont(fuenteDescripciones);
        vinoDesc.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        secondDesc.add(vinoDesc);
        panelCentral.add(secondDesc, gbc);

        thirdImg = new JPanel();
        thirdImg.setBackground(fondoEmpresaLelia);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Image arroz = cargarImagen("./src/LowCost/arroz.png", 150, 200);
        assert arroz != null;
        JLabel lArroz = new JLabel(new ImageIcon(arroz));
        thirdImg.add(lArroz);
        panelCentral.add(thirdImg, gbc);

        thirdDesc = new JPanel();
        thirdDesc.setBackground(fondoEmpresaLelia);
        gbc = new GridBagConstraints();
        arrozDesc = new JLabel("Arroz SOS: 2€");
        arrozDesc.setFont(fuenteDescripciones);
        arrozDesc.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        thirdDesc.add(arrozDesc);
        panelCentral.add(thirdDesc, gbc);

        fourthImg = new JPanel();
        fourthImg.setBackground(fondoEmpresaLelia);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Image filete = cargarImagen("./src/LowCost/filete.png", 150, 200);
        assert filete != null;
        JLabel lFilete = new JLabel(new ImageIcon(filete));
        fourthImg.add(lFilete);
        panelCentral.add(fourthImg, gbc);

        fourthDesc = new JPanel();
        fourthDesc.setBackground(fondoEmpresaLelia);
        gbc = new GridBagConstraints();
        fileteDesc = new JLabel("Filetes de pollo ELPOZO: 4€");
        fileteDesc.setFont(fuenteDescripciones);
        fileteDesc.setForeground(Color.WHITE);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        fourthDesc.add(fileteDesc);
        panelCentral.add(fourthDesc, gbc);

        panelSur = new JPanel(new GridLayout());
        panelSur.setBackground(fondoEmpresaLelia);

        mensajeCancelar = new JLabel("Para cancelar el pedido pulse el siguiente botón: ");
        mensajeCancelar.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        cancelar = new JButton("Cancelar");
        panelSur.add(mensajeCancelar);
        panelSur.add(cancelar);

        c.add(panelNorte, BorderLayout.NORTH);
        c.add(panelCentral, BorderLayout.CENTER);
        c.add(panelSur, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        LowCost_ClienteEsporadico lc_ce = new LowCost_ClienteEsporadico();
        lc_ce.setTitle("LeliaMerca");
        lc_ce.setVisible(true);
        lc_ce.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lc_ce.setSize(1800, 1000);
    }

    private Image cargarImagen(String ruta, int ancho, int alto) {
        try {
            BufferedImage imagen = ImageIO.read(new File(ruta));
            Image imagenEscalada = imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
            return new ImageIcon(imagenEscalada).getImage();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}