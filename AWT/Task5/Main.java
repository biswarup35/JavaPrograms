/**
 * Demostration of ItemListener
 */
import java.awt.*;
import java.awt.event.*;
public class Main implements ItemListener {
    Frame frame;
    CheckboxGroup checkboxGroup;
    Checkbox checkbox1, checkbox2;
    TextField textfield;

    public Main() {
        frame = new Frame("Checkbox Demo");
        textfield = new TextField(20);
        checkboxGroup = new CheckboxGroup();
        checkbox1 = new Checkbox("Tea",checkboxGroup,false);
        checkbox2 = new Checkbox("Coffe",checkboxGroup,false);

        frame.add(textfield); frame.add(checkbox1); frame.add(checkbox2);
        checkbox1.addItemListener(this); checkbox2.addItemListener(this);
        frame.setSize(640,320);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == checkbox1) {
            textfield.setText("Tea is checked");
            
        } else if (e.getSource()== checkbox2) {
            textfield.setText("Coffe is checked");
        }

    }

    public static void main(String[] args) {
        new Main();
    }

    

    
}