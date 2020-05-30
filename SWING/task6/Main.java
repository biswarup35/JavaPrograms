import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Color picker using SWING
 */
public class Main {

    JFrame frame;
    Container container;
    JButton button;
    public Main() {
        frame = new JFrame("Color Picker");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        container = frame.getContentPane();
        button = new JButton("Color");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color ic = Color.RED;
                Color c1 = JColorChooser.showDialog(container, "Pick a color", ic);
                container.setBackground(c1);
            }
        });
        container.add(button);
        frame.setLayout(new FlowLayout());
        frame.setSize(640,320);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}