import java.awt.*;
import java.awt.event.*;

/**
 * Demonstrate MouseListener using methid
 * 1. mouseClicked()
 * 2. mousePressed()
 * 3. mouseReleased()
 * 4. mouseEntered()
 * 5. mouseExited()
 */
public class Main implements MouseListener {
    Frame frame;
    TextField textField;

    public Main() {
        frame = new Frame("Mouse Event");
        textField = new TextField(15);

        textField.setBounds(250,100,100,25);

        frame.addMouseListener(this);
        frame.add(textField);
        frame.setSize(640,320);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    public void mouseClicked(MouseEvent e) {
        textField.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e) {
        textField.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        textField.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent e) {
        textField.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        textField.setText("Mouse Exited");
    }
    
}