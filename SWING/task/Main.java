import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Demonstrate Jtable on Swing
 */
public class Main {

    JFrame frame;
    JTable table;

    public Main() {
        frame = new JFrame("JTable");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        int row = 10, col = 2;
        table = new JTable(row, col);

        for (int i = 0; i < row; i++) {
                table.setValueAt(i, i, 0);
                table.setValueAt(i * i, i, 1);                
        }

        frame.add(table);
        frame.setSize(640, 320);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}