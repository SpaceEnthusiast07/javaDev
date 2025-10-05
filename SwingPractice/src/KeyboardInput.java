import javax.swing.*;
import java.awt.event.*;


/////////////////////////////////////////////////////////
// ADD THE KeyListener TO THE JFrame NOT ANYTHING ELSE //
/////////////////////////////////////////////////////////


class KeyboardInput extends JFrame implements KeyListener{
    // Define the main panel
    JPanel mainPanel;
    // Define a label
    JLabel label;
    
    
    // Constructor
    public KeyboardInput() {
        // Set window title
        super("Keyboard Input Test");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);

        // Initialise the main panel
        mainPanel = new JPanel();
        add(mainPanel);

        // Initialise the label
        label = new JLabel("Press any key!");
        mainPanel.add(label);

        setVisible(true);
    }
    
    
    public static void main (String[] args) {
        // Initialises a new instance of the KeyboardInput class
        KeyboardInput mainWindow = new KeyboardInput();
    }

    
    // Event handelers for the KeyListener interface
    // Called when the key is pressed down
    public void keyPressed(KeyEvent event){}

    // Called after the key is pressed
    public void keyTyped(KeyEvent event){
        label.setText("Key Pressed: " + event.getKeyChar());
    }

    // Called when the key is released
    public void keyReleased(KeyEvent event){}
}