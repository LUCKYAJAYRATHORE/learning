import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.*;

public class MyDrawPanel extends JPanel{

   int x = 70;
  int y = 70;
  JButton button;

  JFrame frame = new JFrame();

  public void paintComponent (Graphics g) {

    g.setColor(Color.orange);
    g.fillRect(x,y, 100, 100);
    // button = new JButton("start");
    // button.addActionListener(this);
   // Graphics2D g2D = (Graphics2D) g;

   // GradientPaint gradient = new GradientPaint(70, 70, Color.BLUE, 150, 150, Color.orange);

   // g2D.setPaint(gradient);



    //Image image = new ImageIcon("catzilla.jpg").getImage();

    //g.drawImage(image, 3, 4, this);

    // g.fillRect(0,0, this.getWidth(), this.getHeight());

    // int red = (int) (Math.random() * 256);
    // int green = (int) (Math.random() * 256);
    // int blue = (int) (Math.random() * 256);

    // Color randomColor = new Color(red, green, blue);
    // g.setColor(randomColor);
    // g.fillOval(70, 70, 100, 100);

    // JFrame frame = new JFrame();
    // frame.getContentPane().add(BorderLayout.CENTER, button);
    // frame.setSize(300,300);
    // frame.setVisible(true);

  public void actionPerformed(ActionEvent event, x, y) {
    Graphics2D g2D = (Graphics2D) g;

    GradientPaint gradient = new GradientPaint(70, 70, Color.BLUE, 150, 150, Color.orange);

    g2D.setPaint(gradient);

    g.setColor(Color.orange);
    g.fillRect(x,y, 100, 100);
    button.setText("finish");
}
}
