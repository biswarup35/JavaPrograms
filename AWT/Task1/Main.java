/**
 * Main
 */
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {
    Frame frame;
    Button button;
    TextField textField;

    public Main() {
        frame = new Frame("Action Listener");
        button = new Button("Click");
        textField = new TextField(15);
        button.addActionListener(this);

        frame.add(button); frame.add(textField);

        frame.setSize(640,320);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("Hello RGP");

    }

    
}