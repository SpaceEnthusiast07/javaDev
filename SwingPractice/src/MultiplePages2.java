import javax.swing.*;
import java.awt.event.*;
import java.awt.Color.*;

public class MultiplePages2 implements ActionListener {
    // Create a window
    static JFrame mainWindow;
    // Create the main panel
    static JPanel mainPanel;
    
    public static void main (String[] args) {
        mainWindow = new JFrame("Multiple Pages Example"); // Set title of window
        mainWindow.setSize(400, 400); // Set dimensions
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit program when window is closed
        
        mainPanel = new JPanel();
        mainWindow.add(mainPanel); // Add panel to window

        mainWindow.setVisible(true); // Make window visible
    }

    public void actionPerformed(ActionEvent e) {
        
    }
}
