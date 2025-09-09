import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
import java.awt.Color.*;

public class MultiplePages2 implements ActionListener {
    // Create a window
    static JFrame mainWindow;
    // Create the main panel
    static JPanel mainPanel;
    // Create a button
    static JButton button1;
    
    public static void main (String[] args) {
        mainWindow = new JFrame("Multiple Pages Example"); // Set title of window
        mainWindow.setSize(1280, 720); // Set dimensions
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit program when window is closed
        
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2)); // Set layout to grid with 1 row and 2 columns
        mainWindow.add(mainPanel); // Add panel to window

        

        mainWindow.setVisible(true); // Make window visible
    }

    public void actionPerformed(ActionEvent e) {
        
    }
}
