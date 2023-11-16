import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ElectricBill extends JFrame {


   
    


    // For Panel
    private final static JPanel PANEL = new JPanel();

    // Variables
    private final static int FRAME_HEIGHT = 800;
    private final static int FRAME_WIDTH = 1300;
    private final static int TEXT_FIELDS_HEIGHT = 30;
    private final static int TEXT_FIELDS_WIDTH = 230;
    private final static int LABEL_SIZE = 25;
    private final static int BUTTON_WIDTH = 200;
    private final static int BUTTON_HEIGHT = 80;

    final String TITLE = "<html><p>MGE Electric Company<br>Electric Bill Computation</p></html>";
    final String KWH_LABEL = "No. of Kilowatt-hour Used ";
    final String CUSTOMER_CODE_LABEL = "Customer Code ";
    final String CUSTOMER_TYPE_LABEL = "Customer Type ";
    final String BASIC_CHARGE_LABEL = "Basic Charge ";
    final String GENERATION_CHARGE_LABEL = "Generation Charge ";
    final String TOTAL_BILL_LABEL = "Total Electric Bill ";

    // Frame Contents
    private final static JLabel TITLE_LABEL = new JLabel();
    private final static JLabel KWH_LABEL_LABEL = new JLabel();
    private final static JLabel CUSTOMER_CODE_LABEL_LABEL = new JLabel();
    private final static JLabel CUSTOMER_TYPE_LABEL_LABEL = new JLabel();
    private final static JLabel BASIC_CHARGE_LABEL_LABEL = new JLabel();
    private final static JLabel GENERATION_CHARGE_LABEL_LABEL = new JLabel();
    private final static JLabel TOTAL_BILL_LABEL_LABEL = new JLabel();
    private final static JTextField KWH_TEXT_FIELD = new JTextField();
    private final static JTextField CUSTOMER_CODE_TEXT_FIELD = new JTextField();
    private final static JTextField CUSTOMER_TYPE_TEXT_FIELD = new JTextField();
    private final static JTextField BASIC_CHARGE_TEXT_FIELD = new JTextField();
    private final static JTextField GENERATION_CHARGE_TEXT_FIELD = new JTextField();
    private final static JTextField TOTAL_BILL_TEXT_FIELD = new JTextField();
    private final static JButton COMPUTE = new JButton();
    private final static JButton CLEAR = new JButton();
    private final static JButton EXIT = new JButton();
    Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

    public ElectricBill() {
        JFrame frame = new JFrame("Electric Bill Computation");
        frame.getContentPane().add(PANEL);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // For Main Method
        mainMethod();
    }

    private void mainMethod() {
        // For Panels Method
        panels();
        // For Labels Method
        labels();
        // For TextFields Method
        textFields();
        // For Compute Method
        compute();
        // For Clear Method
        clear();
        // For Exit Method
        exit();
    }

    private void panels() {
        PANEL.setBackground(Color.LIGHT_GRAY);
        PANEL.setLayout(null);
        PANEL.add(TITLE_LABEL);
        PANEL.add(KWH_LABEL_LABEL);
        PANEL.add(KWH_TEXT_FIELD);
        PANEL.add(CUSTOMER_CODE_LABEL_LABEL);
        PANEL.add(CUSTOMER_CODE_TEXT_FIELD);
        PANEL.add(CUSTOMER_TYPE_LABEL_LABEL);
        PANEL.add(CUSTOMER_TYPE_TEXT_FIELD);
        PANEL.add(BASIC_CHARGE_LABEL_LABEL);
        PANEL.add(BASIC_CHARGE_TEXT_FIELD);
        PANEL.add(GENERATION_CHARGE_LABEL_LABEL);
        PANEL.add(GENERATION_CHARGE_TEXT_FIELD);
        PANEL.add(TOTAL_BILL_LABEL_LABEL);
        PANEL.add(TOTAL_BILL_TEXT_FIELD);
        PANEL.add(COMPUTE);
        PANEL.add(CLEAR);
        PANEL.add(EXIT);
    }

    private void labels() {
        TITLE_LABEL.setText(TITLE);
        TITLE_LABEL.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        TITLE_LABEL.setBounds(280, 50, 900, 70);
        KWH_LABEL_LABEL.setText(KWH_LABEL);
        KWH_LABEL_LABEL.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        KWH_LABEL_LABEL.setBounds(100, 200, 300, 60);
        CUSTOMER_CODE_LABEL_LABEL.setText(CUSTOMER_CODE_LABEL);
        CUSTOMER_CODE_LABEL_LABEL.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        CUSTOMER_CODE_LABEL_LABEL.setBounds(100, 250, 300, 60);
        CUSTOMER_TYPE_LABEL_LABEL.setText(CUSTOMER_TYPE_LABEL);
        CUSTOMER_TYPE_LABEL_LABEL.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        CUSTOMER_TYPE_LABEL_LABEL.setBounds(100, 300, 300, 60);
        BASIC_CHARGE_LABEL_LABEL.setText(BASIC_CHARGE_LABEL);
        BASIC_CHARGE_LABEL_LABEL.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        BASIC_CHARGE_LABEL_LABEL.setBounds(100, 350, 300, 60);
        GENERATION_CHARGE_LABEL_LABEL.setText(GENERATION_CHARGE_LABEL);
        GENERATION_CHARGE_LABEL_LABEL.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        GENERATION_CHARGE_LABEL_LABEL.setBounds(100, 400, 300, 60);
        TOTAL_BILL_LABEL_LABEL.setText(TOTAL_BILL_LABEL);
        TOTAL_BILL_LABEL_LABEL.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        TOTAL_BILL_LABEL_LABEL.setBounds(100, 450, 300, 60);
    }

    private void textFields() {
        KWH_TEXT_FIELD.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        KWH_TEXT_FIELD.setBounds(400, 215, TEXT_FIELDS_WIDTH, TEXT_FIELDS_HEIGHT);
        CUSTOMER_CODE_TEXT_FIELD.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        CUSTOMER_CODE_TEXT_FIELD.setBounds(400, 265, TEXT_FIELDS_WIDTH, TEXT_FIELDS_HEIGHT);
        CUSTOMER_TYPE_TEXT_FIELD.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        CUSTOMER_TYPE_TEXT_FIELD.setBounds(400, 315, TEXT_FIELDS_WIDTH, TEXT_FIELDS_HEIGHT);
        BASIC_CHARGE_TEXT_FIELD.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        BASIC_CHARGE_TEXT_FIELD.setBounds(400, 365, TEXT_FIELDS_WIDTH, TEXT_FIELDS_HEIGHT);
        BASIC_CHARGE_TEXT_FIELD.setEditable(false);
        GENERATION_CHARGE_TEXT_FIELD.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        GENERATION_CHARGE_TEXT_FIELD.setBounds(400, 415, TEXT_FIELDS_WIDTH, TEXT_FIELDS_HEIGHT);
        GENERATION_CHARGE_TEXT_FIELD.setEditable(false);
        TOTAL_BILL_TEXT_FIELD.setFont(new Font("Serif", Font.BOLD, LABEL_SIZE));
        TOTAL_BILL_TEXT_FIELD.setBounds(400, 465, TEXT_FIELDS_WIDTH, TEXT_FIELDS_HEIGHT);
        TOTAL_BILL_TEXT_FIELD.setEditable(false);
    }

    private void compute() {
        COMPUTE.setText("Compute");
        COMPUTE.setBounds(250, 550, BUTTON_WIDTH, BUTTON_HEIGHT);
        COMPUTE.setFont(new Font("Times New Roman", Font.BOLD, LABEL_SIZE));
        COMPUTE.setBackground(new Color(255, 165, 0));
        COMPUTE.setBorderPainted(false);
        COMPUTE.setCursor(cursor);
        COMPUTE.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                // handle mouse enter event
            }
    
            public void mouseExited(MouseEvent evt) {
                COMPUTE.setBackground(UIManager.getColor("control"));
                COMPUTE.setForeground(Color.BLACK);
            }
        });
    
        COMPUTE.addActionListener(e -> calculateElectricBill());
    }

    private double computeResidentialGenerationCharge(double kilowattHours) {
        
        if (kilowattHours <= 100) {
            return 50;
        } else if (kilowattHours <= 200) {
            return 550;
        } else if (kilowattHours <= 300) {
            return 600;
        } else if (kilowattHours <= 400) {
            return 650;
        } else if (kilowattHours <= 500) {
            return 700;
        } else if (kilowattHours <= 600) {
            return 750;
        } else if (kilowattHours <= 700) {
            return 800;
        } else if (kilowattHours <= 800) {
            return 850;
        } else if (kilowattHours <= 900) {
            return 900;
        } else if (kilowattHours <= 1000) {
            return 950;
        } else {
            return 950; // Assuming a default rate for values above 1000
        }
    }
    
    private double computeCommercialGenerationCharge(double kilowattHours) {
        
        if (kilowattHours <= 100) {
            return 500;
        } else if (kilowattHours <= 200) {
            return 2000;
        } else if (kilowattHours <= 300) {
            return 6000;
        } else if (kilowattHours <= 400) {
            return 7000;
        } else if (kilowattHours <= 500) {
            return 8000;
        } else if (kilowattHours <= 600) {
            return 9000;
        } else if (kilowattHours <= 700) {
            return 10000;
        } else if (kilowattHours <= 800) {
            return 11000;
        } else if (kilowattHours <= 900) {
            return 12000;
        } else {
            return 12000; // Assuming a default rate for values above 900
        }
    }
    
    
    private void calculateElectricBill() {
        try {
            // Get user inputs
            double kilowattHours = Double.parseDouble(KWH_TEXT_FIELD.getText());
            char customerCode = CUSTOMER_CODE_TEXT_FIELD.getText().toUpperCase().charAt(0);
    
            // Constants
            double residentialBasicCharge = 50;
            double commercialBasicCharge = 100;
            double residentialGenerationCharge = 0;
            double commercialGenerationCharge = 0;

            
    // Assuming residentialBasicCharge and commercialBasicCharge are declared and initialized
double basicCharge = (customerCode == 'A') ? residentialBasicCharge : commercialBasicCharge;

// Compute generation charge based on kilowatt hours and customer type
if (customerCode == 'A') {
    residentialGenerationCharge = computeResidentialGenerationCharge(kilowattHours);
    BASIC_CHARGE_TEXT_FIELD.setText(String.valueOf(basicCharge));  // Fix here
    GENERATION_CHARGE_TEXT_FIELD.setText(String.valueOf(residentialGenerationCharge));
} else if (customerCode == 'B') {
    commercialGenerationCharge = computeCommercialGenerationCharge(kilowattHours);
    BASIC_CHARGE_TEXT_FIELD.setText(String.valueOf(basicCharge));  // Fix here
    GENERATION_CHARGE_TEXT_FIELD.setText(String.valueOf(commercialGenerationCharge));
} else {
    JOptionPane.showMessageDialog(null, "Invalid customer code. Please enter 'A' for Residential or 'B' for Commercial.", "Error", JOptionPane.ERROR_MESSAGE);
    clearFields();
    return;
}


            // Assuming GENERATION_CHARGE_TEXT_FIELD is a JTextField or another appropriate component
            String generationChargeText = GENERATION_CHARGE_TEXT_FIELD.getText();
            if (!generationChargeText.isEmpty()) {
                try {
                    double generationCharge = Double.parseDouble(generationChargeText);
    
                    // Compute total electric bill
                    double totalBill = basicCharge + generationCharge;
                    TOTAL_BILL_TEXT_FIELD.setText(String.valueOf(totalBill));
                } catch (NumberFormatException ex) {
                    // Handle the case where the text in GENERATION_CHARGE_TEXT_FIELD is not a valid double
                    TOTAL_BILL_TEXT_FIELD.setText("Invalid input");
                }
            } else {
                TOTAL_BILL_TEXT_FIELD.setText("Invalid input");
            }
    
            // Set customer type
            String customerType = (customerCode == 'A') ? "Residential" : "Commercial";
            CUSTOMER_TYPE_TEXT_FIELD.setText(customerType);
    
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numerical values for kilowatt hours.", "Error", JOptionPane.ERROR_MESSAGE);
            clearFields();
        }
    }
    
    private void clearFields() {
        // Assuming these are JTextField components, update based on your actual components
        KWH_TEXT_FIELD.setText("");
        CUSTOMER_CODE_TEXT_FIELD.setText("");
        BASIC_CHARGE_TEXT_FIELD.setText("");
        GENERATION_CHARGE_TEXT_FIELD.setText("");
        TOTAL_BILL_TEXT_FIELD.setText("");
        // Add more fields if needed
    

           

    
    CLEAR.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseExited(MouseEvent evt) {
            CLEAR.setBackground(UIManager.getColor("control"));
            CLEAR.setForeground(Color.BLACK);
        }
    });
    
        

        CLEAR.addActionListener(e -> {
            KWH_TEXT_FIELD.setText("");
            CUSTOMER_CODE_TEXT_FIELD.setText("");
            CUSTOMER_TYPE_TEXT_FIELD.setText("");
            BASIC_CHARGE_TEXT_FIELD.setText("");
            GENERATION_CHARGE_TEXT_FIELD.setText("");
            TOTAL_BILL_TEXT_FIELD.setText("");
        });
    }
    
    private void clear() {
        CLEAR.setText("Clear");
        CLEAR.setBounds(500, 550, BUTTON_WIDTH, BUTTON_HEIGHT);
        CLEAR.setFont(new Font("Times New Roman", Font.BOLD, LABEL_SIZE));
        CLEAR.setBackground(new Color(255, 69, 0));
        CLEAR.setBorderPainted(false);
        CLEAR.setCursor(cursor);
        CLEAR.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                // handle mouse enter event
            }



            public void mouseExited(MouseEvent evt) {
                CLEAR.setBackground(UIManager.getColor("control"));
                CLEAR.setForeground(Color.BLACK);
            }
        });
        CLEAR.addActionListener(e -> {
            KWH_TEXT_FIELD.setText("");
            CUSTOMER_CODE_TEXT_FIELD.setText("");
            CUSTOMER_TYPE_TEXT_FIELD.setText("");
            BASIC_CHARGE_TEXT_FIELD.setText("");
            GENERATION_CHARGE_TEXT_FIELD.setText("");
            TOTAL_BILL_TEXT_FIELD.setText("");
        });
    }

    private void exit() {
        EXIT.setText("Exit");
        EXIT.setBounds(750, 550, BUTTON_WIDTH, BUTTON_HEIGHT);
        EXIT.setFont(new Font("Times New Roman", Font.BOLD, LABEL_SIZE));
        EXIT.setBackground(new Color(255, 0, 0));
        EXIT.setBorderPainted(false);
        EXIT.setCursor(cursor);
        EXIT.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                // handle mouse enter event
            }

            public void mouseExited(MouseEvent evt) {
                EXIT.setBackground(UIManager.getColor("control"));
                EXIT.setForeground(Color.BLACK);
            }
        });
        EXIT.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new ElectricBill());



    }
}
