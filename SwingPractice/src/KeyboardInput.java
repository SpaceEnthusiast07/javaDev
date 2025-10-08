import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;


/////////////////////////////////////////////////////////
// ADD THE KeyListener TO THE JFrame NOT ANYTHING ELSE //
/////////////////////////////////////////////////////////


class KeyboardInput extends JFrame implements KeyListener {
    // Define the main panel
    JPanel mainPanel;

    // Define the labels
    JLabel keyPressedlabel;
    JLabel keyTypedlabel;
    JLabel keyReleasedlabel;
    JLabel label;

    // Define the key variable
    String key;

    // Define three counters to see how many times the key is pressed
    int counter1 = 0;
    int counter2 = 0;
    int counter3 = 0;
    
    
    // Constructor
    public KeyboardInput() {
        // Set window title and other attributes
        super("Keyboard Input Test");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);


        // Initialise the main panel
        mainPanel = new JPanel();
        mainPanel.setOpaque(true);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Add the panel to the mainWindow
        add(mainPanel);


        // Initialise the label's text, font style and foreground
        keyPressedlabel = new JLabel("Press any key!");
        keyPressedlabel.setFont(new Font("Consolas", Font.PLAIN, 24));
        keyPressedlabel.setForeground(new Color(123,193,175));
        keyPressedlabel.setBorder(new LineBorder(Color.BLACK, 1, false));
        keyPressedlabel.setHorizontalAlignment(SwingConstants.CENTER);

        keyTypedlabel = new JLabel("Press any key!");
        keyTypedlabel.setFont(new Font("Consolas", Font.PLAIN, 24));
        keyTypedlabel.setForeground(new Color(164, 72, 100));
        keyTypedlabel.setBorder(new LineBorder(Color.BLACK, 1, false));

        keyReleasedlabel = new JLabel("Press any key!");
        keyReleasedlabel.setFont(new Font("Consolas", Font.PLAIN, 24));
        keyReleasedlabel.setForeground(new Color(156, 102, 76));
        keyReleasedlabel.setBorder(new LineBorder(Color.BLACK, 1, false));

        label = new JLabel("Aaaarrrggghhhh!!!!!");
        label.setFont(new Font("Consolas", Font.PLAIN, 48));
        label.setHorizontalAlignment(SwingConstants.CENTER);


        // Add them to the mainPanel
        mainPanel.add(keyPressedlabel);
        mainPanel.add(keyTypedlabel);
        mainPanel.add(keyReleasedlabel);
        mainPanel.add(label);


        setVisible(true);
    }
    
    
    public static void main (String[] args) {
        // Initialises a new instance of the KeyboardInput class
        new KeyboardInput();
    }

    
    // Event handelers for the KeyListener interface
    // Called when the key is pressed down and is kept being called whilst the key is down
    public void keyPressed(KeyEvent event){
        // Get the key pressed
        key = KeyEvent.getKeyText(event.getKeyCode());

        // Create the varaible to store the text
        String labelText = "keyPressed: " + key;
        

        // Check which key is pressed to change the colour accordingly
        if (key.equals("1")) {
            mainPanel.setBackground(new Color(102,124,156));
        }
        else if (key.equals("2")) {
            mainPanel.setBackground(new Color(145, 122, 90));
        }
        else if (key.equals("3")) {
            mainPanel.setBackground(Color.WHITE);
        }
        else if (key.equals("W")) {
            counter1++;
            labelText += " - " + counter1 + " times";
        }
        
        // Set the text of the label to include the key pressed
        keyPressedlabel.setText(labelText);
        label.setText(key);
    }

    // Called after the key is pressed and is kept being called whilst the key is down
    public void keyTyped(KeyEvent event){
        String labelText = "keyTyped: " + event.getKeyChar();

        if (key.equals("W")) {
            counter2++;
            labelText += " - " + counter2 + " times";
        }

        // Set the text of the label
        keyTypedlabel.setText(labelText);
    }

    // Called when the key is released
    public void keyReleased(KeyEvent event){
        String labelText = "keyReleased: " + KeyEvent.getKeyText(event.getKeyCode());

        if (key.equals("W")) {
            counter3++;
            labelText += " - " + counter3 + " times";
        }
        
        // Set the text of the label
        keyReleasedlabel.setText(labelText);
    }
}