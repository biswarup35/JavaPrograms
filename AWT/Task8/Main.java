import java.awt.*;
import java.awt.event.*;
/**
 * Main
 */
public class Main {

    Frame frame;
    public Main() {
        frame = new Frame("New Frame");
        frame.setSize(640,320);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        frame.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                Graphics g = frame.getGraphics();
                g.setColor(Color.BLUE);
                g.fillOval(e.getX(), e.getY(), 30, 30);
            }
        });

    }

    public static void main(String[] args) {
        new Main();
    }
}