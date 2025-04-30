import javax.swing.*;

import java.awt.*;

public class SimpleAnimation {

  int x = 70;
  int y = 70;

  public static void main(String[] args) {
    SimpleAnimation gui = new SimpleAnimation();
    gui.go();
  }

  public void go() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    for (int i = 0; i < 130; i++) {
      x++;
      y++;
      // drawPanel.repaint();
      try {
        Thread.sleep(50);
      } catch (Exception e) {
        // TODO: handle exception
      }
    }
    Paint paint = new Paint();
    frame.getContentPane().add(paint);
    frame.setSize(300000, 300000);
    frame.setVisible(true);
    frame.repaint();

  }

  // public class MyDrawPanel extends JPanel{

  // public void paintComponent (Graphics g) {

  // g.setColor(Color.orange);
  // g.fillRect(x,y, 100, 100);

  // Image image = new ImageIcon("Image/ajay.jpeg").getImage();
  // g.drawImage(image, x, y, this);

  // }

  // }

  public class Paint extends JPanel {
    public void paintComponent(Graphics g) {
      Image image = new ImageIcon("Image/ajay.jpeg").getImage();
      g.drawImage(image, 3, 4, this);
      // g.setColor(Color.ORANGE);

      // g.fillRect(20, 50, 100, 100);
    }

    // public void paintComponent(Graphics g) {
    // g.fillRect(0,0,this.getWidth(), this.getHeight());

    // int red = (int) (Math.random() * 256);
    // int green = (int) (Math.random() * 256);
    // int blue = (int) (Math.random() * 256);

    // Color randomColor = new Color(red, green, blue);

    // red = (int) (Math.random() * 256);
    // green = (int) (Math.random() * 256);
    // blue = (int) (Math.random() * 256);

    // Color randomColor2 = new Color(red, green, blue);
    // g.setColor(randomColor);
    // g.fillOval(70, 70, 100, 100);

    // g.setColor(Color.ORANGE);

    // g.fillRect(20, 50, 100, 100);

    // Graphics2D g2D = (Graphics2D) g;

    // GradientPaint gradiant = new GradientPaint(70, 70, randomColor, 150, 150,
    // randomColor2);
    // g2D.setPaint(gradiant);

    // g2D.fillOval(70, 70, 100, 100);

    // };
  }
}
