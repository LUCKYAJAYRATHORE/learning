import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;;

public class SimpleGUI implements ActionListener {
  JButton button;
  public static void main(String[] args) {
    SimpleGUI simpleGUI = new SimpleGUI();
    simpleGUI.go();
  }

  public void go() {
    JFrame jFrame = new JFrame();
    button = new JButton("click me");

    button.addActionListener(this);

    jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

    // jFrame.getContentPane().add(button);

    jFrame.getContentPane().add(BorderLayout.AFTER_LAST_LINE, button);

    jFrame.setSize(300,300);

    jFrame.setVisible(true);
  }

  public void actionPerformed(ActionEvent action) {
    button.setText("I've been clicked!");
    SimpleAnimation anim = new SimpleAnimation();
    anim.go();
}
}
