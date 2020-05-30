import java.awt.*;
import java.awt.event.*;
/**
 * Use MouseMotionListener to draw lines
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
        frame.addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e) {
                Graphics graphis = frame.getGraphics();
                graphis.setColor(Color.ORANGE);
                graphis.fillOval(e.getX(), e.getY(), 15, 15);
            }
        });

    }

    public static void main(String[] args) {
        new Main();
    }
}