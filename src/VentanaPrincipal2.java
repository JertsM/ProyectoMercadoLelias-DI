import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VentanaPrincipal2 extends JFrame implements ActionListener {

    Container c;
    GridBagConstraints gbc = new GridBagConstraints();

    // Layouts
    GridBagLayout layout = new GridBagLayout();
    GridLayout layoutGrid = new GridLayout(1, 3);  // Modificado para mostrar las imágenes de forma consecutiva
    FlowLayout layoutFlow = new FlowLayout(FlowLayout.CENTER, 0, 0);

    JPanel panel;
    JPanel panelSuperior;
    JPanel panelTitulo;
    JPanel panelUsuario;
    JPanel panelCentral;
    JPanel panelImgLowCost;
    JPanel panelImgLHiper;
    JPanel panelImgGourmet;

    JLabel cabecera;
    JLabel cabecera2;
    JLabel user;

    JTextField cuadroUser;
    JButton btnUser;

    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
    Font fuenteCabeceraMenor = new Font("Maiandra GD", Font.BOLD, 17);
    Color fondoEmpresaLelia = new Color(69, 110, 218);
    Color fondoPagina = new Color(6, 51, 170);

    public VentanaPrincipal2() {
        c = getContentPane();
        panel = new JPanel(layout);
        panel.setBackground(fondoEmpresaLelia);


        // Panel superior
        panelSuperior = new JPanel(new GridBagLayout());  // Usar un GridBagLayout específico para panelSuperior
        panelSuperior.setBackground(fondoEmpresaLelia);
        panelTitulo = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja el fondo directamente en el JPanel
                g.setColor(fondoEmpresaLelia);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        cabecera = new JLabel("LeliaMerca");
        cabecera.setForeground(Color.WHITE);
        cabecera.setFont(fuenteCabecera);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.CENTER;
        panelTitulo.add(cabecera, gbc);

        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0;
        gbcTitulo.gridy = 0;
        gbcTitulo.anchor = GridBagConstraints.CENTER;
        panelSuperior.add(panelTitulo, gbcTitulo);


        panelUsuario = new JPanel(new GridBagLayout());  // Usar un GridBagLayout específico para panelUsuario
        panelUsuario.setBackground(fondoEmpresaLelia);
        user = new JLabel("Usuario:");
        user.setForeground(Color.WHITE);
        user.setFont(fuenteCabeceraMenor);
        gbc.gridx = 0;
        gbc.gridy = 0;
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

        GridBagConstraints gbcUsuario = new GridBagConstraints();
        gbcUsuario.gridx = 0;
        gbcUsuario.gridy = 1;
        gbcUsuario.anchor = GridBagConstraints.CENTER;
        panelSuperior.add(panelUsuario, gbcUsuario);

        // Panel central
        panelCentral = new JPanel(layoutFlow){
                @Override
                protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja el fondo directamente en el JPanel
                g.setColor(fondoPagina);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        panelCentral.setBackground(fondoPagina);

        // Agregar una separación entre la parte superior y las imágenes
        panelCentral.add(Box.createRigidArea(new Dimension(0, 20)));

        Image imagenLC = cargarImagen("./cenaLowCost.jpg", 492, 400);
        JLabel etiquetaLC = new JLabel(new ImageIcon(imagenLC));
        etiquetaLC.setBorder(BorderFactory.createEmptyBorder()); // Elimina los márgenes

        Image imagenHM = cargarImagen("./cesta.jpg", 530, 400);
        JLabel etiquetaHM = new JLabel(new ImageIcon(imagenHM));
        etiquetaHM.setBorder(BorderFactory.createEmptyBorder()); // Elimina los márgenes

        Image imagenGM = cargarImagen("./cenaGourmet.jpg", 500, 400);
        JLabel etiquetaGM = new JLabel(new ImageIcon(imagenGM));
        etiquetaGM.setBorder(BorderFactory.createEmptyBorder()); // Elimina los márgenes

        panelCentral.add(etiquetaLC, BorderLayout.WEST);
        panelCentral.add(etiquetaHM, BorderLayout.CENTER);
        panelCentral.add(etiquetaGM, BorderLayout.EAST);

        // Agregar paneles al contenedor principal
        c.add(panelSuperior, BorderLayout.NORTH);
        c.add(panelCentral, BorderLayout.CENTER);

        // Agregar paneles al contenedor principal
        c.add(panelSuperior, BorderLayout.NORTH);
        c.add(panelCentral, BorderLayout.CENTER);
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
