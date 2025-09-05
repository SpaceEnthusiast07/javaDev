import javax.swing.*;
import java.awt.event.*;

public class MultiplePages extends JFrame implements ActionListener {
    // Creates the two main panels
    JPanel panel1;
    JPanel panel2;
    
    public MultiplePages() {
        // Accesses the constructor of JFrame and sets window title
        super("Java Swing with Multiple Pages");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setVisible(true);
        // Adds the two panels to the JFrame
        add("North", panel1);
        add("South", panel2);
    }
    
    public static void main (String[] args) {
        MultiplePages mainWindow = new MultiplePages();        
    }

    public void actionPerformed(ActionEvent e) {

    }
}
// Yooooooo! Whatsup github!!
// Oooooo i am editing this from another device!!