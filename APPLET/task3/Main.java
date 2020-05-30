import java.applet.Applet;  
import java.awt.*;
import java.awt.event.*;
public class Main extends Applet implements KeyListener{
    char ch; 
    String msg = "";
    public void init() {
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {
        ch = e.getKeyChar();
        msg = msg +ch;
        repaint();
    }
    public void paint(Graphics graphics) {
        graphics.drawString(msg, 20, 20);
    }
    public void keyReleased(KeyEvent e) {}
}