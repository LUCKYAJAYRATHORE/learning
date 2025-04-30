import javax.swing.*;
import java.awt.event.*;
public class SimpleGUIB implements ActionListener {
  JButton button;

  public static void main(String[] args) {
    SimpleGUIB gui = new SimpleGUIB();
    gui.go();
  }

  public void go() {
    JFrame frame = new JFrame();
    button = new JButton("click me");

    button.addActionListener(this);

    frame.getContentPane().add(button);
    graphics.fillOval(70,70,100,100);
    graphics.drawImage(myPic,10,10,this);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    button.setText("I have been clicked");
  }

}
