/**
 * Design a GUI based application to implement coding for more than one commund button
 */
import java.awt.*;
import java.awt.event.*;
public class Main implements ActionListener {
    Frame frame;
    Button add,sub,mul,div;
    TextField textField, textField2, textField3;

    public Main() {
        frame = new Frame("Simple Calculator");
        add = new Button("Add");
        sub = new Button("Sub");
        mul = new Button("Mul");
        div = new Button("Div");

        textField = new TextField(30);
        textField2 = new TextField(5);
        textField3 = new TextField(5);

        textField2.setText("Number 1");
        textField3.setText("Number 2");


        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        frame.add(add); frame.add(sub); 
        frame.add(mul); frame.add(div);
        frame.add(textField);
        frame.add(textField2);
        frame.add(textField3);

        frame.setSize(640,320);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        double num1, num2;
        if(e.getActionCommand() == "Add") {
            num1 = Double.parseDouble(textField2.getText());
            num2 = Double.parseDouble(textField3.getText());
            double result = add(num1, num2);
            String str = Double.toString(result);
            textField.setText(str);
        } else if (e.getActionCommand() == "Sub") {
            num1 = Double.parseDouble(textField2.getText());
            num2 = Double.parseDouble(textField3.getText());
            double result = sub(num1, num2);
            String str = Double.toString(result);
            textField.setText(str);            
            
        } else if (e.getActionCommand()=="Mul") {
            num1 = Double.parseDouble(textField2.getText());
            num2 = Double.parseDouble(textField3.getText());
            double result = mul(num1, num2);
            String str = Double.toString(result);
            textField.setText(str);
        } else if (e.getActionCommand()== "Div") {
            num1 = Double.parseDouble(textField2.getText());
            num2 = Double.parseDouble(textField3.getText());
            double result = div(num1, num2);
            String str = Double.toString(result);
            textField.setText(str);           
        }
    }

    public static void main(String[] args) {
        new Main();
    }
    public double add(double num1, double num2) {
        return num1+num2;
    }
    public double sub(double num1, double num2) {
        return num1-num2;
    }
    public double mul(double num1, double num2) {
        return num1*num2;
    }
    public double div(double num1, double num2) {
        return num1/num2;
    }
    
}

