package rc_2.panels;

import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TradePanel extends JPanel {

    static JButton button;
    static JLabel label = new JLabel();
    static JTextField textField = new JTextField();

    // Values values;
    CreditPanel creditPanel = new CreditPanel();
    private static int count = Values.scrap;


    public TradePanel() {
        //   values = new Values();

        setBackground(Color.black);
        setLayout(new FlowLayout());

        button = new JButton();
        button.setText(" SELL ");
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
                }
            }
        }
    }
}
