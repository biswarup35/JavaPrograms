import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * MyClient
 */
public class MyClient implements ActionListener{
    JFrame frame;
    JButton button;
    static JLabel label;
    static JTextField textField;

    static Socket socket;
    static DataOutputStream dataOut;
    static DataInputStream dataIn;
    BufferedReader read;

    public MyClient() {
        frame = new JFrame();
        frame.setTitle("Factorial Calculator");
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        label = new JLabel();
        textField = new JTextField();
        textField.setBounds(100, 125, 100, 25);
        label.setBounds(100, 50, 100, 25);
        button = new JButton("Click");
        button.setBounds(100, 150, 100, 25);
        frame.add(button);frame.add(label);frame.add(textField);
        frame.setLayout(null);
        frame.setSize(640,320);
        frame.setVisible(true);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            dataOut = new DataOutputStream(socket.getOutputStream());
            String str = textField.getText().trim();
            dataOut.writeUTF(str);
        } catch (Exception ae) {
            System.out.println("Client error: "+ae.getMessage());
            }
    }
    public static void main(String[] args) {
        new MyClient();
        try {
            socket = new Socket("localhost",5000);
            dataIn = new DataInputStream(socket.getInputStream());

            while(true) {
                String str = dataIn.readUTF();
                label.setText("Factorial is :"+str);

                if (str.equals("0")) {
                    break;
                }
            }
            socket.close();
        } catch (Exception e) {
            System.out.println("Client error: "+e.getMessage());
        }
    }



    
}