import java.applet.Applet;  
import java.awt.*;
import java.awt.event.*;
public class Main extends Applet implements KeyListener{  
    String msg = "Key";
    public void init() {
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e) {
        msg = "Key is down";
        repaint();
    }
    public void keyTyped(KeyEvent e) {
        msg = "Key is typed";
        repaint();
    }
    public void paint(Graphics graphics) {
        graphics.drawString(msg, 20, 20);
    }
    public void keyReleased(KeyEvent e) {}
}