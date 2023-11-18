import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VentanaPrincipal2 extends JFrame implements ActionListener {

    Container c;
    GridBagConstraints gbc = new GridBagConstraints();

    // Layouts
    GridBagLayout layout = new GridBagLayout();
    FlowLayout layoutFlow = new FlowLayout(FlowLayout.CENTER, 0, 0);

    // Paneles
    JPanel panel;
    JPanel panelSuperior;
    JPanel panelTitulo;
    JPanel panelUsuario;
    JPanel panelCentral;
    JPanel panelInferior;
    JPanel panelPrimerBloque;
    JPanel panelSegundoBloque;
    JPanel panelTercerBloque;

    // Botones Centrales
    JButton btnLowCost;
    JButton btnHipermercado;
    JButton btnGourmet;
    JLabel cabecera;
    JLabel user;

    JTextField cuadroUser;
    JButton btnUser;
    JButton boton;

    //Panel Inferior
    JLabel labelTipoUsuario;
    JLabel labelTipoServicio;
    JButton btnAceptar;

    // Fuentes y Backgrounds
    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
    Font fuenteCabeceraMenor = new Font("Maiandra GD", Font.BOLD, 17);
    Color fondoEmpresaLelia = new Color(113, 212, 93);
    Color fondoPagina = new Color(174, 250, 132);

    //  Arrays de opciones
    String [] users = {"Escoja cliente...", "Cliente esporádico", "Cliente Club", "Cliente Premium"};
    JComboBox<String> tipoUsers = new JComboBox<>(users);

    String [] servicies = {"Escoja servicio...", "Hipermercado", "Gourmet", "Low Cost"};
    JComboBox<String> tipoServices = new JComboBox<>(servicies);

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
        user = new JLabel("Introduzca un nombre de usuario:");
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
        panelCentral.add(Box.createRigidArea(new Dimension(0, 50)));

        Image imagenLC = cargarImagen("./cenaLowCost.jpg", 492);
        assert imagenLC != null;
        JLabel etiquetaLC = new JLabel(new ImageIcon(imagenLC));
        etiquetaLC.setBorder(BorderFactory.createEmptyBorder());// Elimina los márgenes

        panelCentral.add(Box.createRigidArea(new Dimension(0, 50)));

        Image imagenHM = cargarImagen("./cesta.jpg", 530);
        assert imagenHM != null;
        JLabel etiquetaHM = new JLabel(new ImageIcon(imagenHM));
        etiquetaHM.setBorder(BorderFactory.createEmptyBorder()); // Elimina los márgenes

        panelCentral.add(Box.createRigidArea(new Dimension(0, 50)));

        Image imagenGM = cargarImagen("./cenaGourmet.jpg", 500);
        assert imagenGM != null;
        JLabel etiquetaGM = new JLabel(new ImageIcon(imagenGM));
        etiquetaGM.setBorder(BorderFactory.createEmptyBorder()); // Elimina los márgenes

        btnLowCost = new JButton("Acceder a LowCost");
        btnHipermercado = new JButton("Acceder a Hipermercado");
        btnGourmet = new JButton("Acceder a Gourmet");

        btnLowCost.addActionListener(this);
        btnHipermercado.addActionListener(this);
        btnGourmet.addActionListener(this);

        panelCentral.add(etiquetaLC, BorderLayout.WEST);
        panelCentral.add(etiquetaHM, BorderLayout.CENTER);
        panelCentral.add(etiquetaGM, BorderLayout.EAST);

        panelCentral.add(btnLowCost, BorderLayout.WEST);
        panelCentral.add(btnHipermercado, BorderLayout.CENTER);
        panelCentral.add(btnGourmet, BorderLayout.EAST);

        // Panel Inferior
        panelInferior = new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibuja el fondo directamente en el JPanel
                g.setColor(fondoPagina);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        // Agregar paneles al contenedor principal
        c.add(panelSuperior, BorderLayout.NORTH);
        c.add(panelCentral, BorderLayout.CENTER);
        c.add(panelInferior, BorderLayout.SOUTH);
    }

    private Image cargarImagen(String ruta, int ancho) {
        try {
            BufferedImage imagen = ImageIO.read(new File(ruta));
            if(imagen != null){
                Image imagenEscalada = imagen.getScaledInstance(ancho, 400, Image.SCALE_SMOOTH);
                return new ImageIcon(imagenEscalada).getImage();
            }else{
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        VentanaPrincipal2 mv = new VentanaPrincipal2();
        mv.setVisible(true);
        mv.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mv.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLowCost){
            LowCost_ClienteEsporadico cliente = new LowCost_ClienteEsporadico();
            cliente.setVisible(true);
            cliente.setExtendedState(Frame.MAXIMIZED_BOTH);
        }
        if(e.getSource() == btnHipermercado){
            Hipermercado_ClienteEsporadico cliente = new Hipermercado_ClienteEsporadico();
            cliente.setVisible(true);
        }
        if(e.getSource() == btnGourmet){
            Gourmet_ClienteEsporadico cliente = new Gourmet_ClienteEsporadico();
            cliente.setVisible(true);
            cliente.setExtendedState(Frame.MAXIMIZED_BOTH);
        }
    }
}
