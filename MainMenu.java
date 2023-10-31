import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Menu");
        JPanel panel = new JPanel();
        JLabel heading = new JLabel("Menu Calculator ");

        

        // Create a menu bar and menu items
        JMenuBar menuBar = new JMenuBar();
        JMenu mainMenu = new JMenu("Main Menu");
        JMenuItem additionMenuItem = new JMenuItem("Addition");
        JMenuItem subtractionMenuItem = new JMenuItem("Subtraction");
        JMenuItem multiplicationMenuItem = new JMenuItem("Multiplication");
        JMenuItem divisionMenuItem = new JMenuItem("Division");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // Add menu items to the menu
        mainMenu.add(additionMenuItem);
        mainMenu.add(subtractionMenuItem);
        mainMenu.add(multiplicationMenuItem);
        mainMenu.add(divisionMenuItem);
        mainMenu.add(exitMenuItem);

        // Add the menu to the menu bar
        menuBar.add(mainMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        heading.setFont(new Font("Arial", Font.BOLD, 20));
        heading.setForeground(Color.BLACK);
        heading.setBounds(320, 100, 200, 40);

       
       

        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.add(heading);

        

        panel.setLayout(null);
        panel.setBackground(Color.YELLOW);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add ActionListener for the "Addition" button
       

        // Add ActionListener for the "Subtraction" button
       

        // Add ActionListener for the "Multiplication" button
       

        // Add ActionListener for the "Division" button
       

        // Add ActionListener for the "Exit" button
        
        
        // Add ActionListener for the "Addition" menu item
        additionMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the current window
                Addition.main(null); // Open the addition menu
            }
        });

        // Add ActionListener for the "Subtraction" menu item
        subtractionMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the current window
                Subtraction.main(null); // Open the subtraction menu
            }
        });

        // Add ActionListener for the "Multiplication" menu item
        multiplicationMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the current window
                Multiplication.main(null); // Open the multiplication menu
            }
        });

        // Add ActionListener for the "Division" menu item
        divisionMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the current window
                Division.main(null); // Open the division menu
            }
        });

        // Add ActionListener for the "Exit" menu item
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit the application
            }
        });
    }
}
