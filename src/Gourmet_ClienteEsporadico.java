import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Gourmet_ClienteEsporadico extends JFrame implements ActionListener {

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
    JPanel panelPrecio;

    // Panel superior
    JLabel cabecera;

    // Panel Central
    JLabel salmonDesc;
    JLabel vinoDesc;
    JLabel arrozDesc;
    JLabel fileteDesc;
    JLabel facturaDesc;
    JTextArea area;

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

        cabecera = new JLabel("LeliaMerca: Low Cost - Ofertas");
        cabecera.setForeground(new Color(234, 190, 63));
        cabecera.setFont(fuenteCabecera);
        panelNorte.add(cabecera);

        panelCentral = new JPanel(gbl);
        panelCentral.setBackground(fondoPagina);
        firtsImg = new JPanel();
        firtsImg.setBackground(fondoPagina);
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
        firstDesc.setBackground(fondoPagina);
        gbc = new GridBagConstraints();
        salmonDesc = new JLabel("Salmón Skandia: 9€");
        salmonDesc.setFont(fuenteDescripciones);
        salmonDesc.setForeground(new Color(234, 190, 63));
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
        secondImg.setBackground(fondoPagina);
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
        secondDesc.setBackground(fondoPagina);
        vinoDesc = new JLabel("Vino Blanco 'Don Bernandino': 14€");
        vinoDesc.setFont(fuenteDescripciones);
        vinoDesc.setForeground(new Color(234, 190, 63));
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
        thirdImg.setBackground(fondoPagina);
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
        thirdDesc.setBackground(fondoPagina);
        gbc = new GridBagConstraints();
        arrozDesc = new JLabel("Arroz SOS: 4€");
        arrozDesc.setFont(fuenteDescripciones);
        arrozDesc.setForeground(new Color(234, 190, 63));
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
        fourthImg.setBackground(fondoPagina);
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
        fourthDesc.setBackground(fondoPagina);
        gbc = new GridBagConstraints();
        fileteDesc = new JLabel("Filetes de pollo ELPOZO: 6€");
        fileteDesc.setFont(fuenteDescripciones);
        fileteDesc.setForeground(new Color(234, 190, 63));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        fourthDesc.add(fileteDesc);
        panelCentral.add(fourthDesc, gbc);

        panelPrecio = new JPanel();
        gbc = new GridBagConstraints();
        facturaDesc = new JLabel("Factura:");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        gbc.weighty = 0.5;
        facturaDesc.setFont(new Font("Maiandra GB", Font.BOLD, 20));
        gbc = new GridBagConstraints();
        area = new JTextArea();
        gbc.gridx = 2;
        gbc.gridy = -1;
        gbc.gridheight = -1;
        gbc.gridwidth = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panelPrecio.add(facturaDesc);
        panelPrecio.add(area);
        panelCentral.add(panelPrecio, gbc);

        panelSur = new JPanel(new GridLayout());
        panelSur.setBackground(fondoPagina);

        mensajeCancelar = new JLabel("Para cancelar el pedido pulse el siguiente botón: ");
        mensajeCancelar.setFont(new Font("Maiandra GD", Font.BOLD, 20));
        mensajeCancelar.setForeground(new Color(234, 190, 63));
        cancelar = new JButton("Cancelar");
        cancelar.addActionListener(this);
        panelSur.add(mensajeCancelar);
        panelSur.add(cancelar);

        c.add(panelNorte, BorderLayout.NORTH);
        c.add(panelCentral, BorderLayout.CENTER);
        c.add(panelSur, BorderLayout.SOUTH);
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

    public static void main(String[] args) {
        Gourmet_ClienteEsporadico lc_gm = new Gourmet_ClienteEsporadico();
        lc_gm.setTitle("LeliaMerca");
        lc_gm.setVisible(true);
        lc_gm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        lc_gm.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancelar){
            int opcion = JOptionPane.showConfirmDialog(Gourmet_ClienteEsporadico.this, "¿Está seguro de que desea cancelar la compra?", "Menú de salida de Gourmet", JOptionPane.YES_NO_OPTION);
            if(opcion == JOptionPane.YES_OPTION){
                dispose();
            }
        }
    }
}
