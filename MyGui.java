import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGui implements ActionListener {

  JFrame frame;
  JButton colorButton;
  JButton labelButton ;

  public static void main(String[] args) {
    SimpleGUI3C gui = new SimpleGUI3C();
    gui.go();
  }

  public void go() {
    colorButton = new JButton("Change colors");
    labelButton = new JButton("Change labels");
    colorButton.addActionListener(this);
    labelButton.addActionListener(this);
  }

  public void actionPerformed(ActionEvent action) {
    if(action.getSource() == colorButton) {
      frame.repaint();
    } else {
      labelButton.setText("That hurts!");
    }
}

}
