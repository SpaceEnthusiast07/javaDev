import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;


/////////////////////////////////////////////////////////
// ADD THE KeyListener TO THE JFrame NOT ANYTHING ELSE //
/////////////////////////////////////////////////////////


class KeyboardInput extends JFrame implements KeyListener{
    // Define the main panel
    JPanel mainPanel;
    // Define the labels
    JLabel keyPressedlabel;
    JLabel keyTypedlabel;
    JLabel keyReleasedlabel;
    JLabel label;
    // Define the key variable
    String key;
    
    
    // Constructor
    public KeyboardInput() {
        // Set window title
        super("Keyboard Input Test");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);

        // Initialise the main panel
        mainPanel = new JPanel();
        mainPanel.setOpaque(true);
        // Add the panel to the mainWindow
        add(mainPanel);

        // Initialise the labels
        keyPressedlabel = new JLabel("Press any key!");
        keyPressedlabel.setFont(new Font("Arial", Font.PLAIN, 24));
        keyTypedlabel = new JLabel("Press any key!");
        keyTypedlabel.setFont(new Font("Arial", Font.PLAIN, 24));
        keyReleasedlabel = new JLabel("Press any key!");
        keyReleasedlabel.setFont(new Font("Arial", Font.PLAIN, 24));
        label = new JLabel("Aaaarrrggghhhh!!!!!");
        label.setFont(new Font("Arial", Font.PLAIN, 48));

        // Add them to the mainPanel
        mainPanel.add(keyPressedlabel);
        mainPanel.add(keyTypedlabel);
        mainPanel.add(keyReleasedlabel);
        mainPanel.add(label);

        setVisible(true);
    }
    
    
    public static void main (String[] args) {
        // Initialises a new instance of the KeyboardInput class
        KeyboardInput mainWindow = new KeyboardInput();
    }

    
    // Event handelers for the KeyListener interface
    // Called when the key is pressed down
    public void keyPressed(KeyEvent event){
        // Get the key pressed
        key = event.getKeyText(event.getKeyCode());
        
        keyPressedlabel.setText("keyPressed: " + key);
        label.setText(key);

        if (key.equals("1")) {
            mainPanel.setBackground(new Color(102,124,156));
        }
        else if (key.equals("2")) {
            mainPanel.setBackground(new Color(145, 122, 90));
        }
        else if (key.equals("3")) {
            mainPanel.setBackground(Color.WHITE);
        }
    }

    // Called after the key is pressed
    public void keyTyped(KeyEvent event){
        keyTypedlabel.setText("Key Typed: " + event.getKeyChar());
    }

    // Called when the key is released
    public void keyReleased(KeyEvent event){
        keyReleasedlabel.setText("keyReleased: " + event.getKeyText(event.getKeyCode()));
    }
}