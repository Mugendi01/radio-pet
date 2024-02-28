import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetDisplayApp extends JFrame {
    private JLabel petLabel;
    private JRadioButton dogButton, catButton, birdButton, fishButton, rabbitButton;

    public PetDisplayApp() {
        setTitle("Pet Display App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        petLabel = new JLabel("No pet selected");
        add(petLabel);

        dogButton = new JRadioButton("Dog");
        catButton = new JRadioButton("Cat");
        birdButton = new JRadioButton("Bird");
        fishButton = new JRadioButton("Fish");
        rabbitButton = new JRadioButton("Rabbit");

        ButtonGroup group = new ButtonGroup();
        group.add(dogButton);
        group.add(catButton);
        group.add(birdButton);
        group.add(fishButton);
        group.add(rabbitButton);

        add(dogButton);
        add(catButton);
        add(birdButton);
        add(fishButton);
        add(rabbitButton);

        // Add action listeners to the radio buttons
        dogButton.addActionListener(new RadioButtonListener());
        catButton.addActionListener(new RadioButtonListener());
        birdButton.addActionListener(new RadioButtonListener());
        fishButton.addActionListener(new RadioButtonListener());
        rabbitButton.addActionListener(new RadioButtonListener());
    }

    private class RadioButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == dogButton) {
                petLabel.setText("Displaying a dog");
            } else if (e.getSource() == catButton) {
                petLabel.setText("Displaying a cat");
            } else if (e.getSource() == birdButton) {
                petLabel.setText("Displaying a bird");
            } else if (e.getSource() == fishButton) {
                petLabel.setText("Displaying a fish");
            } else if (e.getSource() == rabbitButton) {
                petLabel.setText("Displaying a rabbit");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PetDisplayApp().setVisible(true);
            }
        });
    }
}
