package rc_2.panels;

import rc_2.values.numeric_values.Values;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheatsPanel extends JPanel {

    JButton button_add_credit = new JButton("add credit");
    JButton button_add_enegry = new JButton("add energy");
    JButton button_clear = new JButton("clear ");

    public CheatsPanel() {

        button_add_credit.setFocusable(false);
        button_add_credit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_add_credit) {
                    //   CreditPanel.textField.setText("10000");
                    Values.credit += 1000;
                    CreditPanel.textField.setText(String.valueOf(Values.credit));
                }
            }
        });
        add(button_add_credit);

        button_add_enegry.setFocusable(false);
        button_add_enegry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_add_enegry) {
                    //   CreditPanel.textField.setText("10000");
                    Values.enegry += 1000;
                    EnergyPanel.textField.setText(String.valueOf(Values.enegry));
                }
            }
        });
        add(button_add_enegry);

        button_clear.setFocusable(false);
        button_clear.setBackground(Color.red);
        button_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_clear) {
                    //   CreditPanel.textField.setText("10000");
                    Values.enegry = 0;
                    Values.credit = 0;
                    Values.scrap = 0;
                    EnergyPanel.textField.setText(String.valueOf(Values.enegry));
                    CreditPanel.textField.setText(String.valueOf(Values.credit));
                    SearchPanel.textField.setText(String.valueOf(Values.scrap));
                    TradePanel.textField.setText(String.valueOf(Values.scrap));
                }
            }
        });
        add(button_clear);
    }
}
