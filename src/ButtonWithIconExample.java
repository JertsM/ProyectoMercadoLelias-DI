import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class ButtonWithIconExample  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de estilo de fuente en JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Texto de ejemplo");
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Cambia la fuente y el estilo
        label.setForeground(Color.BLUE); // Cambia el color del texto
        label.setHorizontalAlignment(SwingConstants.CENTER); // Alineación horizontal
        label.setVerticalAlignment(SwingConstants.CENTER); // Alineación vertical
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // Borde
        label.setOpaque(true); // Hace que el JLabel sea opaco
        label.setBackground(Color.YELLOW); // Cambia el color de fondo

        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    }
