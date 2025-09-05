import javax.swing.*;
import java.awt.event.*;

public class FirstGUI extends JFrame implements ActionListener{
    // Creates the main window
    JFrame mainWindow = new JFrame("My First GUI");
    // Creates a panel
    JPanel panel = new JPanel();
    // Creates a label
    JLabel label = new JLabel("Hello, Swing!");
    // Creates a button
    JButton button = new JButton("Click Me");
    // Constant to keep track of number of button clicks
    int clickCount = 0;


    public FirstGUI() {
        // Sets up the main window
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(500, 500);
        mainWindow.setVisible(true);

        // Adds the panel to the window
        mainWindow.add(panel);
        // Adds the label and button to the panel
        panel.add(label);
        panel.add(button);
        // Adds action listener to the button
        button.addActionListener(this);
    }


    public static void main(String[] args) {
        new FirstGUI();
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            clickCount++;
            label.setText("Button clicked " + clickCount + " times!");
        }
    }
}
