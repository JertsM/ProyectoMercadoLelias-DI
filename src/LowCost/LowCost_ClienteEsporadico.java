package LowCost;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LowCost_ClienteEsporadico extends JDialog {

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

    // Panel inferior
    JLabel mensajeCancelar;
    JButton cancelar;

    // Fuentes y backgrounds
    Color fondoEmpresaLelia = new Color(69, 110, 200);
    Color fondoPagina = new Color(6, 51, 170);
    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 30);


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
        Image salmon = cargarImagen("./src/LowCost/salmon.jpg", 200, 250);
        assert salmon != null;
        JLabel lSalmon = new JLabel(new ImageIcon(salmon));
        firtsImg.add(lSalmon);
        panelCentral.add(firtsImg, gbc);

        firstDesc = new JPanel();
        firstDesc.setBackground(fondoEmpresaLelia);
        gbc = new GridBagConstraints();
        salmonDesc = new JLabel("Salmón Skandia: 2.5€");
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
        Image vinoBlanco = cargarImagen("./src/LowCost/vino.jpg", 200, 250);
        assert vinoBlanco != null;
        JLabel lVino = new JLabel(new ImageIcon(vinoBlanco));
        secondImg.add(lVino);
        panelCentral.add(secondImg, gbc);

        secondDesc = new JPanel();
        gbc = new GridBagConstraints();
        secondDesc.setBackground(fondoEmpresaLelia);
        vinoDesc = new JLabel("Vino Blanco 'Don Bernandino': 3€");
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
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Image arroz = cargarImagen("./src/LowCost/arroz.jpg", 200, 250);
        assert arroz != null;
        JLabel lArroz = new JLabel(new ImageIcon(arroz));
        thirdImg.add(lArroz);
        panelCentral.add(thirdImg, gbc);

        thirdDesc = new JPanel();
        thirdDesc.setBackground(fondoEmpresaLelia);
        gbc = new GridBagConstraints();
        arrozDesc = new JLabel("Arroz SOS: 2€");
        arrozDesc.setForeground(Color.WHITE);
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        thirdDesc.add(arrozDesc);
        panelCentral.add(thirdDesc, gbc);

        panelSur = new JPanel(new GridLayout());
        panelSur.setBackground(fondoEmpresaLelia);

        mensajeCancelar = new JLabel("Para cancelar el pedido pulse el siguiente botón: ");
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
        lc_ce.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        lc_ce.setSize(screenSize.width, screenSize.height);
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
