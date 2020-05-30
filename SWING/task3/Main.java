import javax.swing.*;
import java.awt.event.*;

/**
 * Main
 */
public class Main {

    JMenu menu,submenu;
    JMenuItem item,item2,item3,item4,item5;
    JMenuBar menuBar;
    JFrame frame;

    public Main() {
        frame = new JFrame("Swing Menu");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub Menu");
        item = new JMenuItem("Item 1");
        item2 = new JMenuItem("Item 2");
        item3 = new JMenuItem("Item 3");
        item4 = new JMenuItem("Item 4");
        item5 = new JMenuItem("Item 5");

        menu.add(item);menu.add(item2);menu.add(item3);
        submenu.add(item4);submenu.add(item5);
        menu.add(submenu); menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setSize(640,320);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Main();
    }
}