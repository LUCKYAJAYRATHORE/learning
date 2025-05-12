import java.awt.*;
import javax.swing.*;
public class Paint extends JPanel {
  public void paintComponent(Graphics g) {

    g.setColor(Color.ORANGE);

    g.fillRect(20, 50, 100, 100);

    Graphics2D g2D = (Graphics2D) g;

    GradientPaint gradiant = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);
    g2D.setPaint(gradiant);

    g2D.fillOval(70, 70, 100, 100);

    };

  }
