import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Swing progress bar
 */
public class Main {

    JFrame frame;
    JProgressBar progressBar;
    JLabel label;
    int i = 0;
    public Main() {
        frame = new JFrame("Progress Bar");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        label = new JLabel();

        progressBar = new JProgressBar(0,100);
        progressBar.setStringPainted(true);
        progressBar.setSize(160,30);
        progressBar.setBounds(40, 40, 100, 20);
        frame.add(progressBar);
        frame.add(label);
        frame.setLayout(new FlowLayout());
        frame.setSize(640,320);
        frame.setVisible(true);
    }
    public void iterate() {
        while(true) {
            progressBar.setValue(i);
            i+=1;
            if (i > 100) {
                label.setText("Completed");
                break;
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Thread interuption "+e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
       Main m = new Main();
       m.iterate();
    }
}