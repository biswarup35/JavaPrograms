/**
 * Demonstrate frame in AWT
 */

import java.awt.*;
public class Main {

    public static void main(String[] args) {
        Frame frame = new Frame("Frame Example");
        frame.setSize(640, 320);
        frame.setLayout(new FlowLayout());
        TextField textField = new TextField(15);
        textField.setText("This is Frame in AWT");
        frame.add(textField);
        frame.setVisible(true);
    }
}