import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class MultiplePages extends JFrame implements ActionListener {
    // Creates the main panel
    JPanel mainPanel;
    // Creates panels
    JPanel panel1;
    JPanel panel2;
    // Creates two buttons
    JButton button1;
    JButton button2;
    
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

        // Sets the layout of the main panel to grid layout with 2 rows and 2 columns
        mainWindow.mainPanel.setLayout(new java.awt.GridLayout(2, 2));

        // Initializes the two buttons
        mainWindow.button1 = new JButton("View panel 1");
        mainWindow.button2 = new JButton("View panel 2");
        
        // Adds the main panel to the JFrame's content pane
        mainWindow.getContentPane().add(mainWindow.mainPanel);

        // Adds button1 to row 1 column 1 of the main panel
        mainWindow.mainPanel.add(mainWindow.button1);

        // Adds button2 to row 1 column 2 of the main panel
        mainWindow.mainPanel.add(mainWindow.button2);

        // Adds both panels to row 2 column 1&2 of the main panel
        mainWindow.mainPanel.add(mainWindow.panel1);
        mainWindow.mainPanel.add(mainWindow.panel2);

        // Adds a label to each panel
        JLabel label1 = new JLabel("This is Panel 1");
        mainWindow.panel1.add(label1);
        JLabel label2 = new JLabel("This is Panel 2");
        mainWindow.panel2.add(label2);

        // Sets the background color of each panel
        mainWindow.panel1.setBackground(Color.GREEN);
        mainWindow.panel2.setBackground(Color.BLUE);

        // Sets the visibility of each panel
        mainWindow.panel1.setVisible(true);
        mainWindow.panel2.setVisible(false);

        // Disables button1
        mainWindow.button1.setEnabled(false);

        // Adds action listeners to the buttons
        mainWindow.button1.addActionListener(mainWindow);
        mainWindow.button2.addActionListener(mainWindow);

        mainWindow.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            button1.setEnabled(false);
            button2.setEnabled(true);
            panel1.setVisible(true);
            panel2.setVisible(false);
        }
        else if (e.getSource() == button2) {
            button1.setEnabled(true);
            button2.setEnabled(false);
            panel1.setVisible(false);
            panel2.setVisible(true);
        }
    }
}
// Yooooooo! Whatsup github!!
// Oooooo i am editing this from another device!!