import java.awt.*;
import java.awt.event.*;

/**
 * Demonstration of WindowListener
 * with WindowListener abstract class
 * with WindowListener adater class
 */
public class Main {

    Frame frame;
    Label label;

    public Main() {
        frame = new Frame("Window Listener");
        label = new Label();

        label.setText("WindowListener");
        // frame.addWindowListener(this);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        label.setBounds(250,100,100,20);
        frame.add(label);
        frame.setSize(640,320);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // public void windowClosing(WindowEvent e) {
    //     frame.dispose();
    // }
    // public void windowOpened(WindowEvent e) {}
    // public void windowDeiconified(WindowEvent e) {}
    // public void windowAcivated(WindowEvent e) {}
    // public void windowActivated(WindowEvent e) {}
    // public void windowClosed(WindowEvent e) {}
    // public void windowDeactivated(WindowEvent e) {}
    // public void windowIconified(WindowEvent e) {}

    public static void main(String[] args) {
        new Main();
    }
    
}