
// All the currencies value are according to August 2023

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Currency_Converter {

    public static void main(String[] args) {

        new Convert();

    }

}

class Convert extends JFrame implements ActionListener {

    JLabel heading, chooseCurrency, enterAmount, currency1_rupee, currency2_dollar, currency3_pound, currency4_euro,
            currency5_yen, currency6_ringgit;

    JComboBox<String> currencies;
    JTextField amount;
    JButton btn;

    Convert() {

        heading = new JLabel("CURRENCY CONVERTER");
        heading.setFont(new Font("San Serif", Font.BOLD, 22));
        heading.setBounds(100, 20, 285, 40);

        chooseCurrency = new JLabel("Choose Currency: ");
        chooseCurrency.setFont(new Font("San Serif", Font.PLAIN, 18));
        chooseCurrency.setBounds(80, 80, 220, 50);

        String[] currenciesList = { "Rupee", "Dollar", "Pound", "Euro", "Yen", "Ringgit" };
        currencies = new JComboBox<>(currenciesList);
        currencies.setBounds(270, 92, 120, 30);
        currencies.setFont(new Font("San Serif", Font.BOLD, 15));

        enterAmount = new JLabel("Enter Amount: ");
        enterAmount.setFont(new Font("San Serif", Font.PLAIN, 18));
        enterAmount.setBounds(80, 150, 220, 50);

        amount = new JTextField();
        amount.setFont(new Font("San Serif", Font.PLAIN, 18));
        amount.setBounds(270, 160, 120, 30);

        btn = new JButton("CONVERT");
        btn.setFont(new Font("San Serif", Font.BOLD, 13));
        btn.setBounds(180, 230, 100, 30);
        btn.setFocusable(false);
        btn.setBackground(new Color(197, 227, 132));
        btn.addActionListener(this);

        currency1_rupee = new JLabel("Rupee: ");
        currency1_rupee.setFont(new Font("San Serif", Font.BOLD, 18));
        currency1_rupee.setBounds(80, 300, 150, 30);

        currency2_dollar = new JLabel("Dollar: ");
        currency2_dollar.setFont(new Font("San Serif", Font.BOLD, 18));
        currency2_dollar.setBounds(80, 350, 150, 30);

        currency3_pound = new JLabel("Pound: ");
        currency3_pound.setFont(new Font("San Serif", Font.BOLD, 18));
        currency3_pound.setBounds(80, 400, 150, 30);

        currency4_euro = new JLabel("Euro: ");
        currency4_euro.setFont(new Font("San Serif", Font.BOLD, 18));
        currency4_euro.setBounds(280, 300, 150, 30);

        currency5_yen = new JLabel("Yen: ");
        currency5_yen.setFont(new Font("San Serif", Font.BOLD, 18));
        currency5_yen.setBounds(280, 350, 150, 30);

        currency6_ringgit = new JLabel("Ringgit: ");
        currency6_ringgit.setFont(new Font("San Serif", Font.BOLD, 18));
        currency6_ringgit.setBounds(280, 400, 150, 30);

        add(heading);
        add(chooseCurrency);
        add(currencies);
        add(amount);
        add(enterAmount);
        add(btn);
        add(currency1_rupee);
        add(currency2_dollar);
        add(currency3_pound);
        add(currency4_euro);
        add(currency5_yen);
        add(currency6_ringgit);

        setTitle("Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 180, 500, 500);
        setLayout(null);
        setResizable(false);
        getContentPane().setBackground(new Color(0x229955));
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double amountValue = Double.parseDouble(amount.getText());
        double rupee, dollar, pound, euro, yen, ringgit = 0;

        if (amount.getText().isEmpty()) {

            System.out.println("empty");

        } else {

            if (currencies.getSelectedItem() == "Rupee") {

                dollar = amountValue / 82.55;
                pound = amountValue / 103.89;
                euro = amountValue / 89.14;
                yen = amountValue / 0.56;
                ringgit = amountValue / 17.79;
                currency1_rupee.setText("Rupee: " + amountValue);
                currency2_dollar.setText("Dollar: " + String.format("%.2f", dollar));
                currency3_pound.setText("Pound: " + String.format("%.2f", pound));
                currency4_euro.setText("Euro: " + String.format("%.2f", euro));
                currency5_yen.setText("Yen: " + String.format("%.2f", yen));
                currency6_ringgit.setText("Ringgit: " + String.format("%.2f", ringgit));

            } else if (currencies.getSelectedItem() == "Dollar") {

                rupee = amountValue * 82.55;
                pound = amountValue * 0.79;
                euro = amountValue * 0.93;
                yen = amountValue * 146.45;
                ringgit = amountValue * 4.64;
                currency1_rupee.setText("Rupee: " + String.format("%.2f", rupee));
                currency2_dollar.setText("Dollar: " + amountValue);
                currency3_pound.setText("Pound: " + String.format("%.2f", pound));
                currency4_euro.setText("Euro: " + String.format("%.2f", euro));
                currency5_yen.setText("Yen: " + String.format("%.2f", yen));
                currency6_ringgit.setText("Ringgit: " + String.format("%.2f", ringgit));

            } else if (currencies.getSelectedItem() == "Pound") {

                rupee = amountValue * 103.89;
                dollar = amountValue * 1.26;
                euro = amountValue * 1.17;
                yen = amountValue * 184.29;
                ringgit = amountValue * 5.84;
                currency1_rupee.setText("Rupee: " + String.format("%.2f", rupee));
                currency2_dollar.setText("Dollar: " + String.format("%.2f", dollar));
                currency3_pound.setText("Pound: " + amountValue);
                currency4_euro.setText("Euro: " + String.format("%.2f", euro));
                currency5_yen.setText("Yen: " + String.format("%.2f", yen));
                currency6_ringgit.setText("Ringgit: " + String.format("%.2f", ringgit));

            } else if (currencies.getSelectedItem() == "Euro") {

                rupee = amountValue * 89.13;
                dollar = amountValue * 1.08;
                pound = amountValue * 0.86;
                yen = amountValue * 158.13;
                ringgit = amountValue * 5.02;
                currency1_rupee.setText("Rupee: " + String.format("%.2f", rupee));
                currency2_dollar.setText("Dollar: " + String.format("%.2f", dollar));
                currency3_pound.setText("Pound: " + String.format("%.2f", pound));
                currency4_euro.setText("Euro: " + amountValue);
                currency5_yen.setText("Yen: " + String.format("%.2f", yen));
                currency6_ringgit.setText("Ringgit: " + String.format("%.2f", ringgit));

            } else if (currencies.getSelectedItem() == "Yen") {

                rupee = amountValue * 0.56;
                dollar = amountValue * 0.0068;
                pound = amountValue * 0.0054;
                euro = amountValue * 0.0063;
                ringgit = amountValue * 0.032;
                currency1_rupee.setText("Rupee: " + String.format("%.2f", rupee));
                currency2_dollar.setText("Dollar: " + String.format("%.2f", dollar));
                currency3_pound.setText("Pound: " + String.format("%.2f", pound));
                currency4_euro.setText("Euro: " + String.format("%.2f", euro));
                currency5_yen.setText("Yen: " + amountValue);
                currency6_ringgit.setText("Ringgit: " + String.format("%.2f", ringgit));

            } else if (currencies.getSelectedItem() == "Ringgit") {

                rupee = amountValue * 17.79;
                dollar = amountValue * 0.22;
                pound = amountValue * 0.17;
                euro = amountValue * 0.20;
                yen = amountValue * 31.56;
                currency1_rupee.setText("Rupee: " + String.format("%.2f", rupee));
                currency2_dollar.setText("Dollar: " + String.format("%.2f", dollar));
                currency3_pound.setText("Pound: " + String.format("%.2f", pound));
                currency4_euro.setText("Euro: " + String.format("%.2f", euro));
                currency5_yen.setText("Yen: " + String.format("%.2f", yen));
                currency6_ringgit.setText("Ringgit: " + amountValue);

            }

        }
    }

}