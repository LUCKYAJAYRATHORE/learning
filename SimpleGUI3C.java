import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI3C {

  JFrame frame;
  JButton colorButton;
  JButton labelButton ;

  public static void main(String[] args) {
    SimpleGUI3C gui = new SimpleGUI3C();
    gui.go();
  }

  public void go() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    colorButton = new JButton("Change colors");
    labelButton = new JButton("Change labels");
    colorButton.addActionListener(new colorButtonListener());
    labelButton.addActionListener(new labelButtonListener());

    frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
    frame.getContentPane().add(BorderLayout.CENTER, colorButton);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  class colorButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
      }
  }

  class labelButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        frame.setTitle("that hurts");
      }
  }

}
