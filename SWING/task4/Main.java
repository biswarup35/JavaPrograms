import javax.swing.*;
import java.awt.event.*;

/**
 * Main
 */
public class Main implements ActionListener {
    JFrame frame;
    JMenuBar menubar;
    JMenu file,edit,help;
    JMenuItem copy,paste,cut,selectAll;
    JTextArea textArea;

    public Main() {
        frame = new JFrame("Text Editor");
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        menubar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        cut = new JMenuItem("Cut");
        selectAll = new JMenuItem("Select All");
        copy.addActionListener(this);
        paste.addActionListener(this);
        cut.addActionListener(this);
        selectAll.addActionListener(this);

        edit.add(copy);edit.add(paste);edit.add(cut);edit.add(selectAll);
        menubar.add(file);menubar.add(edit);menubar.add(help);

        textArea = new JTextArea();

        frame.add(menubar);frame.add(textArea);
        frame.setJMenuBar(menubar);
        frame.setSize(640,320);
        frame.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            textArea.cut();
        } else if (e.getSource() == copy) {
            textArea.copy();
        } else if (e.getSource() == paste) {
            textArea.paste();
        } else if (e.getSource() == selectAll) {
            textArea.selectAll();
        }
    }

    public static void main(String[] args) {
        
        new Main();
    }

    
}