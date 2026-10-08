import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;

public class Currency_Converter extends JFrame implements ActionListener {

    private JTextField amountField;
    private JComboBox<String> fromCurrency, toCurrency;
    private JButton convertButton;
    private JLabel resultLabel;
    HashMap<String, Double> rates = new HashMap<>();

    public Currency_Converter() {
        rates.put("INR", 1.0);
        // 1 USD ≈ ₹95.20
        rates.put("USD", 1.0 / 92.21);
        // 1 EUR ≈ ₹110.00
        rates.put("EUR", 1.0 / 110.00);
        // 1 GBP ≈ ₹128.30
        rates.put("GBP", 1.0 / 128.30);
        String[] currencies = {
            "INR",
            "USD",
            "EUR",
            "GBP"
        };

        fromCurrency = new JComboBox<>(currencies);
        toCurrency = new JComboBox<>(currencies);
        amountField = new JTextField(10);
        convertButton = new JButton("Convert");
        resultLabel = new JLabel("Result: ");
        convertButton.addActionListener(this);
        setLayout(new FlowLayout());
        add(new JLabel("Amount:"));
        add(amountField);
        add(new JLabel("From:"));
        add(fromCurrency);
        add(new JLabel("To:"));
        add(toCurrency); 
 add(convertButton);
add(resultLabel);
        setTitle("Currency Converter");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

@Override
    public void actionPerformed(ActionEvent e) {

        try {
            double amount =Double.parseDouble(amountField.getText());
            String from = (String) fromCurrency.getSelectedItem();
            String to =(String) toCurrency.getSelectedItem();            
            double amountInINR =amount / rates.get(from);
            double convertedAmount =amountInINR * rates.get(to);
            /*
             * Display the result.
             */
            resultLabel.setText(
                String.format(
                    "Result: %.2f %s = %.2f %s",
                    amount,
                    from,
                    convertedAmount,
                    to
                )
            );
        } catch (NumberFormatException ex) {
            resultLabel.setText(
                "Invalid input! Please enter a number."
            );
        }
    }
    public static void main(String[] args) {
        new Currency_Converter();
}

} 
