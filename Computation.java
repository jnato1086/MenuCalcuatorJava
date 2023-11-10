import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Computation {

    public static void main(String[] args) {
        JFrame frame = new JFrame("School Tuition Fee Computation");
        JPanel panel = new JPanel();
        JLabel heading = new JLabel("St.Vincent De Ferrer College of Camarin,Inc");
        JLabel heading1 = new JLabel("Tuition Fee Computation");

         // Add icon to the JFrame
         ImageIcon icon = new ImageIcon("background.jpg "); // Replace with the actual path to your icon
         Image image = icon.getImage();
         frame.setIconImage(image);

        // All Components on the left Side
        JLabel q1 = new JLabel("No. of units Enrolled:");
        JTextField field1 = new JTextField(10);
        JLabel q2 = new JLabel("Year Level:");
        JTextField field2 = new JTextField(10);
        JLabel q3 = new JLabel("Student Code");
        JTextField field3 = new JTextField(10);
        JLabel q4 = new JLabel("Student Discount:");
        JTextField field4 = new JTextField(10);
        JLabel q9 = new JLabel("Student Classification");
        JTextField field9 = new JTextField(10);

        // All Components on the right Side
        JLabel q5 = new JLabel("Rate Per Unit");
        JTextField field5 = new JTextField(10);
        JLabel q6 = new JLabel("Miscellaneous Fee");
        JTextField field6 = new JTextField(10);
        JLabel q7 = new JLabel("Total Tuition Fee");
        JTextField field7 = new JTextField(10);
        JLabel q8 = new JLabel("Total Matriculation Fee");
        JTextField field8 = new JTextField(10);

        JButton btn1 = new JButton("Compute");
        JButton btn2 = new JButton("Clear");
        JButton btn3 = new JButton("Exit");

    
        heading = new JLabel("St.Vincent De Ferrer College of Camarin,Inc");
        heading.setFont(new Font("Brush Script MT", Font.BOLD, 20));
        heading.setForeground(Color.RED);
        

        heading.setBounds(380,30,380, 40);
        heading.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally

        heading1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        heading1.setForeground(Color.RED);
        heading1.setBounds(450,55,380, 40);
        
        heading.setHorizontalAlignment(SwingConstants.CENTER); // Center horizontally
        q1.setFont(new Font("Verdana", Font.BOLD, 15));
        q1.setForeground(Color.BLACK);

        q1.setBounds(50, 150, 200, 40);
        field1.setBounds(250, 150, 150, 30);
        
        q2.setFont(new Font("Verdana", Font.BOLD, 15));
        q2.setForeground(Color.BLACK);
        q2.setBounds(50, 200, 200, 40);
        field2.setBounds(250, 200, 150, 30);
        q3.setFont(new Font("Verdana", Font.BOLD, 16));
        q3.setForeground(Color.BLACK);
        q3.setBounds(50, 250, 200, 40);
        field3.setBounds(250, 250, 150, 30);
        btn1.setBounds(50, 380, 100, 40);
        q4.setFont(new Font("Verdana", Font.BOLD, 16));
        q4.setForeground(Color.BLACK);
        q4.setBounds(50, 300, 200, 40);
        field4.setBounds(250, 300, 150, 30);

        q5.setFont(new Font("Georgia", Font.BOLD, 16));
        q5.setForeground(Color.BLACK);
        q5.setBounds(600, 150, 200, 40);
        field5.setBounds(800, 150, 150, 30);
        
        q6.setFont(new Font("Georgia", Font.BOLD, 16));
        q6.setForeground(Color.BLACK);
        q6.setBounds(600, 200, 200, 40);
        field6.setBounds(800, 200, 150, 30);
        q7.setFont(new Font("Georgia", Font.BOLD, 16));
        q7.setForeground(Color.BLACK);
        q7.setBounds(600, 250, 200, 40);
        field7.setBounds(800, 250, 150, 30);

        q8.setFont(new Font("Georgia", Font.BOLD, 16));
        q8.setForeground(Color.BLACK);
         // Move q8 down and adjust its size
        q8.setBounds(600, 400, 200, 40);
       // Move field8 down and adjust its size
        field8.setBounds(800, 400, 150, 30);

        q9.setFont(new Font("Georgia", Font.BOLD, 16));
        q9.setForeground(Color.BLACK);
        
        q9.setBounds(50, 400, 200, 40); // Move q9 down
        field9.setBounds(250, 400, 150, 30); // Move field9 down

        int buttonWidth = 100;
        int buttonHeight = 40;
        int panelWidth = 1000;
        int panelHeight = 600;
        int spacing = 20;
        int buttonY = panelHeight - 3 * buttonHeight - spacing;

        btn1.setBounds((panelWidth - (buttonWidth * 3 + 3 * spacing)) / 2, buttonY, buttonWidth, buttonHeight);
        btn1.setBackground(Color.ORANGE); 
        Font buttonFont = new Font("Comic Sans MS", Font.BOLD, 15); // You can change "Arial" and 16 to your desired values
        btn1.setFont(buttonFont);
        Color textColor = Color.BLUE; // Replace with the desired text color
        btn1.setForeground(textColor);

        btn2.setBounds((panelWidth - (buttonWidth * 3 + 2 * spacing)) / 2 + buttonWidth + spacing, buttonY, buttonWidth, buttonHeight);
        btn2.setBackground(Color.ORANGE);
        Font font = new Font("Comic Sans MS", Font.BOLD, 15); // You can change "Arial" to the desired font name, Font style (e.g., Font.BOLD), and font size (e.g., 16)
        btn2.setFont(font);
        btn2.setForeground(Color.BLUE);
    
        
        btn3.setBounds((panelWidth - (buttonWidth * 3 + 2 * spacing)) / 2 + 2 * (buttonWidth + spacing), buttonY, buttonWidth, buttonHeight);
        btn3.setBackground(Color.ORANGE); 
        btn3.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn3.setForeground(Color.BLUE);
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.add(heading);
        panel.add(heading1);
        panel.add(q1);
        panel.add(field1);
        panel.add(q2);
        panel.add(field2);
        panel.add(q3);
        panel.add(field3);
        panel.add(q4);
        panel.add(field4);
        panel.add(q5);
        panel.add(field5);
        panel.add(q6);
        panel.add(field6);
        panel.add(q7);
        panel.add(field7);
        panel.add(q8);
        panel.add(field8);
        panel.add(q9);
        panel.add(field9);

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Add this section to your existing code to determine student classification based on student code

        // Create a mapping from student code to student classification
        HashMap<Integer, String> studentClassificationMap = new HashMap<>();
        studentClassificationMap.put(1, "Ordinary student");
        studentClassificationMap.put(2, "Student scholar");
        studentClassificationMap.put(3, "Student athlete");

        // ...

        // Add ActionListener for the "Compute" button
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double unitsEnrolled = Double.parseDouble(field1.getText());
                    int yearLevel = Integer.parseInt(field2.getText());
                    int studentCode = Integer.parseInt(field3.getText());

                    // Example computation: lookup rate per unit and miscellaneous fee
                    double ratePerUnit;
                    double miscellaneousFee;

                    switch (yearLevel) {
                        case 1:
                            ratePerUnit = 500;
                            miscellaneousFee = 4000;
                            break;
                        case 2:
                            ratePerUnit = 600;
                            miscellaneousFee = 5000;
                            break;
                        case 3:
                            ratePerUnit = 700;
                            miscellaneousFee = 6000;
                            break;
                        case 4:
                            ratePerUnit = 800;
                            miscellaneousFee = 7000;
                            break;
                        default:
                            ratePerUnit = 0;
                            miscellaneousFee = 0;
                            break;
                    }

                    double totalTuitionFee = unitsEnrolled * ratePerUnit;
                    field5.setText(String.valueOf(ratePerUnit));
                    field6.setText(String.valueOf(miscellaneousFee));

                    // Calculate student discount based on student code
                    double studentDiscount = 0;

                    if (studentClassificationMap.containsKey(studentCode)) {
                        String studentClassification = studentClassificationMap.get(studentCode);
                        field9.setText(studentClassification); // Set the student classification in the field
                        // Apply the percentage discount based on student classification
                        if (studentClassification.equals("Student scholar")) {
                            studentDiscount = totalTuitionFee * 0.5;
                        } else if (studentClassification.equals("Student athlete")) {
                            studentDiscount = totalTuitionFee;
                        }
                    } else {
                        field9.setText("Unknown");
                    }

                    field4.setText(String.format("%.2f", studentDiscount));

                    double totalMatriculationFee = totalTuitionFee + miscellaneousFee - studentDiscount;
                    field7.setText(String.format("%.2f", totalTuitionFee));
                    field8.setText(String.format("%.2f", totalMatriculationFee));
                    
                    switch (yearLevel) {
                        case 1:
                            totalMatriculationFee = totalTuitionFee + 14000; // Adjusted for half-year first semester
                            break;
                        case 2:
                            totalMatriculationFee = totalTuitionFee + 11000; // Adjusted for half-year first semester
                            break;
                        case 3:
                            totalMatriculationFee = totalTuitionFee + 7000; // Adjusted for half-year first semester
                            break;
                        case 4:
                            totalMatriculationFee = totalTuitionFee + 6000; // Adjusted for half-year first semester
                            break;
                        default:
                            totalMatriculationFee = totalTuitionFee + 10000; // Use a default value if year level is not specified
                            break;
                    }
                    
        
        field7.setText(String.format("%.2f", totalTuitionFee));
        

                } catch (NumberFormatException ex) {
                    // Handle invalid input
                }
            }
        });

        // Add AactionListener for the "Clear" button
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText("");
                field2.setText("");
                field3.setText("");
                field4.setText("");
                field5.setText("");
                field6.setText("");
                field7.setText("");
                field8.setText("");
                field9.setText("");
            }
        });

        // Add ActionListener for the "Exit" button
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

