import javax.swing.*;
import java.awt.event.*;

/**
 * JTable demonstration using swing
 */
public class Main {

    JFrame frame;
    JTable table;
    JScrollPane scrollPane;

    public Main() {
        frame = new JFrame("Salary Table");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        String data[][] = {
            {"101","Ankita","670000"},
            {"102","Subhas","680000"},
            {"103","Rakesh","690000"},
        };
        String collumn[] = {"ID","Name","Salary"};

        table = new JTable(data,collumn);
        scrollPane = new JScrollPane(table);
        frame.add(scrollPane);
        frame.setSize(640,320);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Main();
    }
}
