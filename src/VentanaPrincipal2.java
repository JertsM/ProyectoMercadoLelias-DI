import Hipermercado.Hipermercado_ClienteClub;
import Hipermercado.Hipermercado_ClienteEsporadico;
import Hipermercado.Hipermercado_ClientePremium;
import LowCost.LowCost_ClienteClub;
import LowCost.LowCost_ClienteEsporadico;
import LowCost.LowCost_ClientePremium;

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
import java.util.Objects;

public class VentanaPrincipal2 extends JFrame implements ActionListener {

    Container c;
    GridBagConstraints gbc = new GridBagConstraints();

    // Layouts
    GridBagLayout layout = new GridBagLayout();
    FlowLayout layoutFlow = new FlowLayout(FlowLayout.CENTER, 0, 0);

    JPanel panel;
    JPanel panelSuperior;
    JPanel panelTitulo;
    JPanel panelUsuario;
    JPanel panelCentral;
    JPanel panelInferior;
    JPanel panelPrimerBloque;
    JPanel panelSegundoBloque;
    JPanel panelTercerBloque;

    JLabel cabecera;
    JLabel user;

    JTextField cuadroUser;
    JButton btnUser;

    //Panel Inferior
    JLabel labelTipoUsuario;
    JLabel labelTipoServicio;
    JButton btnAceptar;

    // Fuentes y Backgrounds
    Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 40);
    Font fuenteCabeceraMenor = new Font("Maiandra GD", Font.BOLD, 17);
    Color fondoEmpresaLelia = new Color(69, 110, 218);
    Color fondoPagina = new Color(6, 51, 170);

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
        panelCentral.add(Box.createRigidArea(new Dimension(0, 50)));

        Image imagenLC = cargarImagen("./cenaLowCost.jpg", 492);
        assert imagenLC != null;
        JLabel etiquetaLC = new JLabel(new ImageIcon(imagenLC));
        etiquetaLC.setBorder(BorderFactory.createEmptyBorder());// Elimina los márgenes
        etiquetaLC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                abrirNuevaVentana("cenaLowCost.jpg");
            }
        });

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

        panelCentral.add(etiquetaLC, BorderLayout.WEST);
        panelCentral.add(etiquetaHM, BorderLayout.CENTER);
        panelCentral.add(etiquetaGM, BorderLayout.EAST);

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
        panelInferior.setLayout(new GridLayout(2, 1));
        panelInferior.setBackground(fondoPagina);
        panelInferior.setOpaque(true);

        panelPrimerBloque = new JPanel();
        panelPrimerBloque.setBackground(fondoPagina);

        labelTipoUsuario = new JLabel("Escoja el tipo de usuario:");
        labelTipoUsuario.setForeground(Color.WHITE);
        labelTipoUsuario.setFont(fuenteCabeceraMenor);
        panelPrimerBloque.add(labelTipoUsuario);
        panelPrimerBloque.add(tipoUsers);

        labelTipoServicio = new JLabel("Escoja el tipo de servicio:");
        labelTipoServicio.setForeground(Color.WHITE);
        labelTipoServicio.setFont(fuenteCabeceraMenor);

        panelSegundoBloque = new JPanel();
        panelSegundoBloque.setBackground(fondoPagina);
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(this);

        panelSegundoBloque.add(labelTipoServicio);
        panelSegundoBloque.add(tipoServices);
        panelSegundoBloque.add(btnAceptar);

        panelInferior.add(panelPrimerBloque);
        panelInferior.add(panelSegundoBloque);

        // Agregar paneles al contenedor principal
        c.add(panelSuperior, BorderLayout.NORTH);
        c.add(panelCentral, BorderLayout.CENTER);
        c.add(panelInferior, BorderLayout.SOUTH);
    }

    private void abrirNuevaVentana(String nombreImagen) {
        try {
            File imagenFile = new File(nombreImagen);

            if (imagenFile.exists()) {
                Desktop.getDesktop().browse(imagenFile.toURI());
            } else {
                System.out.println("La imagen no existe: " + nombreImagen);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    private Image cargarImagen(String ruta, int ancho) {
        try {
            BufferedImage imagen = ImageIO.read(new File(ruta));
            Image imagenEscalada = imagen.getScaledInstance(ancho, 400, Image.SCALE_SMOOTH);
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

        mv.setSize(1800, 1000);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String users = tipoUsers.getSelectedItem().toString();
        String services = tipoServices.getSelectedItem().toString();

        if(e.getSource() == btnAceptar){
            // Condicionales de Low Cost
            if(users.equalsIgnoreCase("Cliente esporádico") && services.equalsIgnoreCase("Low Cost")){
                LowCost_ClienteEsporadico vLow = new LowCost_ClienteEsporadico();
            }
            if(users.equalsIgnoreCase("Cliente Club") && services.equalsIgnoreCase("Low Cost")){
                LowCost_ClienteClub vLow = new LowCost_ClienteClub();
            }
            if(users.equalsIgnoreCase("Cliente Premium") && services.equalsIgnoreCase("Low Cost")){
                LowCost_ClientePremium vLow = new LowCost_ClientePremium();
            }

            // Condicionales de Hipermercados
            if(users.equalsIgnoreCase("Cliente esporádico") && services.equalsIgnoreCase("Hipermercado")){
                Hipermercado_ClienteEsporadico vLow = new Hipermercado_ClienteEsporadico();
            }
            if(users.equalsIgnoreCase("Cliente Club") && services.equalsIgnoreCase("Hipermercado")){
                Hipermercado_ClienteClub vLow = new Hipermercado_ClienteClub();
            }
            if(users.equalsIgnoreCase("Cliente Premium") && services.equalsIgnoreCase("Hipermercado")){
                Hipermercado_ClientePremium vLow = new Hipermercado_ClientePremium();
            }

            // Condicionales de Gourmet
            if(users.equalsIgnoreCase("Cliente esporádico") && services.equalsIgnoreCase("Gourmet")){
                Hipermercado_ClienteEsporadico vLow = new Hipermercado_ClienteEsporadico();
            }
            if(users.equalsIgnoreCase("Cliente Club") && services.equalsIgnoreCase("Gourmet")){
                Hipermercado_ClienteClub vLow = new Hipermercado_ClienteClub();
            }
            if(users.equalsIgnoreCase("Cliente Premium") && services.equalsIgnoreCase("Gourmet")){
                Hipermercado_ClientePremium vLow = new Hipermercado_ClientePremium();
            }
        }
    }
}
