/**
 * Use delegation method to implement ActionListener in another class
 */
import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {
    Button button;
    TextField textField;

    public Main() {
        button = new Button("Click");
        textField = new TextField(30);

        add(button);
        add(textField);

        InnerMain main = new InnerMain(this);

        button.addActionListener(main);
        setSize(640, 320);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}
class InnerMain implements ActionListener {
    Main main;
    public InnerMain(Main main) {
        this.main = main;
    }
    public void actionPerformed(ActionEvent e) {
        main.textField.setText("Hello RGP from Delegation Method");

    }
}