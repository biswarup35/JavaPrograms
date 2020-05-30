import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 * Main
 */
public class Main extends Applet implements KeyListener {
    int px,py,x,y;
    public void init() {
        px = 10;
        py =  10;
        x =px;
        y=py;

        addKeyListener(this);
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_LEFT:
                x--;
                break;
            case KeyEvent.VK_RIGHT:
                x++;
                break;
            case KeyEvent.VK_UP:
                y--;
                break;
            case KeyEvent.VK_DOWN:
                y++;
                break;
        }
         Graphics g = getGraphics();
         g.setColor(Color.BLUE);
         g.drawLine(px, py, x, y);
         px= x;
         py =y;
    }
    public void paint(Graphics graphics) {
        graphics.drawLine(px, py, x, y);
        px = x;
        py = y;
    }


    
}