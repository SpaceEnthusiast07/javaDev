import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class MultiplePages extends JFrame implements ActionListener {
    // Creates the main panel
    JPanel mainPanel;
    // Creates panels
    JPanel panel1;
    JPanel panel2;
    
    public MultiplePages() {
        // Accesses the constructor of JFrame and sets window title
        super("Java Swing with Multiple Pages");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
    }
    
    public static void main (String[] args) {
        MultiplePages mainWindow = new MultiplePages();

        // Initializes the three panels
        mainWindow.mainPanel = new JPanel();
        mainWindow.panel1 = new JPanel();
        mainWindow.panel2 = new JPanel();
        
        // Adds the main panel to the JFrame's content pane
        mainWindow.getContentPane().add(mainWindow.mainPanel, "Center");

        // Adds the two panels to the main panel
        mainWindow.mainPanel.add(mainWindow.panel1);
        mainWindow.mainPanel.add(mainWindow.panel2);

        // Adds a label to each panel
        JLabel label1 = new JLabel("This is Panel 1");
        mainWindow.panel1.add(label1);
        JLabel label2 = new JLabel("This is Panel 2");
        mainWindow.panel2.add(label2);

        mainWindow.panel1.setBackground(Color.GREEN);
        mainWindow.panel2.setBackground(Color.BLUE);

        mainWindow.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
// Yooooooo! Whatsup github!!
// Oooooo i am editing this from another device!!