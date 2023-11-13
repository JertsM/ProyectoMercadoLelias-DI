import LowCost.LowCost_ClienteClub;
import LowCost.LowCost_ClienteEsporadico;
import LowCost.LowCost_ClientePremium;

import Hipermercado.Hipermercado_ClienteEsporadico;
import Hipermercado.Hipermercado_ClienteClub;
import Hipermercado.Hipermercado_ClientePremium;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;

public class VentanaPrincipal extends JFrame implements ActionListener, FocusListener {
    Container c;

    // Paneles
    JPanel panelNorte;

        // Titulo de la empresa
        JLabel empresaLelia = new JLabel("LeliaMerca");
        Font fuenteCabecera = new Font("Maiandra GD", Font.BOLD, 20);
        Color fondoEmpresaLelia = new Color(103, 224, 93);
    JPanel panelCentral;

        // Color de fondo para el panel central
        Color fondoPanelCentral = new Color(193, 237, 184);

        // Lista de tipos de usuarios
        JLabel labelTipoUsuario = new JLabel("Escoja el tipo de usuario:");
        String [] users = {"Escoja cliente...", "Cliente esporádico", "Cliente Club", "Cliente Premium"};
        JComboBox<String> tipoUsuarios = new JComboBox<>(users);

        // Introducir credencial de usuario
        JLabel labelNombreUsuario = new JLabel("Usuario:");
        JTextField nombreUsuario = new JTextField();

        // Lista de tipo de servicio
        JLabel labelTipoServicio = new JLabel("Escoja el tipo de servicio:");
        String [] servicies = {"Escoja servicio...", "Hipermercado", "Gourmet", "Low Cost"};
        JComboBox<String> tipoServicios = new JComboBox<>(servicies);

    JPanel panelInferior;
        JLabel lowCost = new JLabel();
        JLabel hipermercado = new JLabel();
        JLabel gourmet = new JLabel();


    // Botones
    JButton aceptar = new JButton("Aceptar");

    public VentanaPrincipal() {
        c = getContentPane();

        // Panel Norte
        panelNorte = new JPanel();
        panelNorte.setBackground(fondoEmpresaLelia);
        empresaLelia.setFont(fuenteCabecera);
        empresaLelia.setForeground(Color.WHITE);


        //Panel Central
        panelCentral = new JPanel();
        // nombreUsuario.setToolTipText("Nombre del usuario");
        panelCentral.setLayout(new GridLayout());
        panelCentral.setBackground(fondoPanelCentral);
        aceptar.addActionListener(this);

        panelCentral.add(labelNombreUsuario);
        panelCentral.add(nombreUsuario);
        panelCentral.add(labelTipoUsuario);
        panelCentral.add(tipoUsuarios);
        panelCentral.add(labelTipoServicio);
        panelCentral.add(tipoServicios);

        // Panel Inferior
        panelInferior = new JPanel();
        this.setLocationRelativeTo(this);
        SetImageLabel(lowCost, "./cenaLowCost.jpg");
        SetImageLabel(hipermercado, "./cesta.jpg");
        SetImageLabel(gourmet, "./cenaGourmet.jpg");


        lowCost.setPreferredSize(new Dimension(400, 100));

        panelInferior.add(lowCost);
        // Añadir paneles para mostrar
        panelNorte.add(empresaLelia);
        panelCentral.add(aceptar);
        c.add(panelNorte, BorderLayout.NORTH);
        c.add(panelCentral, BorderLayout.CENTER);
        c.add(panelInferior, BorderLayout.SOUTH);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String users = tipoUsuarios.getSelectedItem().toString();
        String services = tipoServicios.getSelectedItem().toString();

        if(actionEvent.getSource() == aceptar){
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

    @Override
    public void focusGained(FocusEvent focusEvent) {

    }

    @Override
    public void focusLost(FocusEvent focusEvent) {

    }

    public static void main(String[] args) {
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
        vp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        vp.setSize(500, 500);
    }

    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icono = new ImageIcon(image.getImage().getScaledInstance(500, 1000, Image.SCALE_DEFAULT));
        labelName.setIcon(icono);
        this.repaint();
    }
}
