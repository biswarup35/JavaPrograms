import java.awt.*;
import java.awt.event.*;
/**
 * Demonstrate AWT menu bar
 */
public class Main implements ActionListener {
    Frame frame;
    MenuBar menuBar;
    Menu menu;
    MenuItem item,item2,item3,item4,item5;

    public Main() {
        frame = new Frame("AWT Menu bar");
        menuBar = new MenuBar();
        menu = new Menu("Color");
        item = new MenuItem("Red");
        item2 = new MenuItem("Blue");
        item3 = new MenuItem("Green");
        item4 = new MenuItem("Yellow");
        item5 = new MenuItem("Orange");

        item.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        item4.addActionListener(this);
        item5.addActionListener(this);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        menu.add(item);menu.add(item2);
        menu.add(item3);menu.add(item4);
        menu.add(item5);menuBar.add(menu);

        frame.setMenuBar(menuBar);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        String string = e.getActionCommand();
        if (string.equals("Red")) {
            frame.setBackground(Color.RED);
        } else if(string.equals("Blue")){
            frame.setBackground(Color.BLUE);
        } else if (string.equals("Green")) {
            frame.setBackground(Color.GREEN);
        } else if (string.equals("Yellow")) {
            frame.setBackground(Color.YELLOW);
        } else if (string.equals("Orange")) {
            frame.setBackground(Color.ORANGE);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}