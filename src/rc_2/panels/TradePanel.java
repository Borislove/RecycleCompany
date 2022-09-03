package rc_2.panels;

import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TradePanel extends JPanel {

    static JButton button;
    JButton button_sell_x10 = new JButton(" SELL x 10");
    JButton button_sell_all = new JButton(" SELL ALL");
    static JLabel label = new JLabel();
    static JTextField textField = new JTextField();

    // Values values;
    CreditPanel creditPanel = new CreditPanel();
    private static int count = Values.scrap;


    //test
    SpinnerModel model;
    JSpinner jSpinner;


    public TradePanel() {
        //   values = new Values();

        setBackground(Color.black);
        setLayout(new FlowLayout());

        button = new JButton();
        button.setText(" SELL x 1 ");
        button.setForeground(Color.green);
        button.setBackground(Color.black);
        button.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
        button.setFocusable(false);
        button.addActionListener(new ButtonHandler());
        add(button);

        // textField = new JTextField();
        textField.setText("    " + String.valueOf(Values.scrap) + "    ");
        textField.updateUI();
        textField.setSize(200, 200);
        textField.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);
        textField.setEditable(false);


        ////BORDER////////
        Border solidBorder = BorderFactory.createLineBorder(Color.GREEN, 2);
        textField.setBorder(solidBorder);
        button.setBorder(solidBorder);

        add(textField);

        label.setText("price: " + Values.price);
        label.setForeground(Color.orange);
        add(label);

        //SPINNER
/*
        model = new SpinnerNumberModel(0, 0, Values.scrap, 1);
        jSpinner = new JSpinner(model);
        add(jSpinner);*/


        button_sell_x10.setFocusable(false);
        button_sell_x10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_sell_x10) {
                    System.out.println("sell x 10");
                    System.out.println("values price = " + Values.price);
                    if (Values.scrap >= 10) {
                        int total = Values.price * 10;
                        MessagePanel.textField.setText(" SOLD: " + 10 + " metal scrap |" + " PRICE " + Values.price + "| TOTAL  " + total + " credit |");

                        Values.scrap -= 10;
                        Values.credit += Values.price * 10;
                        System.out.println("values priceRand");
                        System.out.println(Values.price);
                        CreditPanel.textField.setText(String.valueOf(Values.credit));
                        SearchPanel.textField.setText(String.valueOf(Values.scrap));
                        TradePanel.textField.setText(String.valueOf(Values.scrap));

                    }
                }
            }
        });
        add(button_sell_x10);

        //////////////////////////////////////////
        button_sell_all.setFocusable(false);
        button_sell_all.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_sell_all) {
                    System.out.println("sell all");
                    if (Values.scrap >= 1) {
                        int total = Values.price * Values.scrap;
                        MessagePanel.textField.setText(" SOLD: " + Values.scrap + " metal scrap |" + " PRICE " + Values.price + "| TOTAL  " + total + " credit |");

                        Values.credit += Values.price * Values.scrap;
                        Values.scrap = 0;
                        CreditPanel.textField.setText(String.valueOf(Values.credit));
                        SearchPanel.textField.setText(String.valueOf(Values.scrap));
                        TradePanel.textField.setText(String.valueOf(Values.scrap));
                    }
                }
            }
        });
        add(button_sell_all);
    }

    class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == TradePanel.button) {
                System.out.println("click trade button");
                System.out.println("getScrap: " + Values.scrap);

                if (Values.scrap != 0) {

                    Values.credit += Values.price;
                    System.out.println("test price:" + Values.price);

                    Values.scrap--;
                    textField.setText("    " + String.valueOf(Values.scrap) + "    ");
                    CreditPanel.textField.setText("    " + String.valueOf(Values.credit) + "    ");
                    SearchPanel.textField.setText("    " + String.valueOf(Values.scrap) + "    ");

                    label.setText("price: " + Values.priceRand());

                    MessagePanel.textField.setText(" You sell scrap");
                }

                if (Values.scrap == 0) {
                    MessagePanel.textField.setText(" need more scrap!!!");
                }
            }
        }
    }
}
