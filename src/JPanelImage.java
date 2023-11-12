import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class JPanelImage extends JLabel {
    private int x, y;
    private final String path;

    public JPanelImage(JPanel panel, String path){
        this.path = path;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon img = new ImageIcon(Objects.requireNonNull(getClass().getResource(path)));
            g.drawImage(img.getImage(), 0, 0, x, y, null);
    }
}
