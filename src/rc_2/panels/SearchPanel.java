package rc_2.panels;

import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchPanel extends JPanel {

    static JTextField textField;
    static JButton button;
    private static int count = Values.scrap;

    public SearchPanel() {


        setBackground(Color.black);
        setLayout(new FlowLayout());
        // setLayout(null);

        button = new JButton();
        button.setText(" SEARCH ");
        button.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
        button.setForeground(Color.green);
        button.setBackground(Color.black);
        button.setFocusable(false);
        button.addActionListener(new ButtonHandler());
        add(button);

        // values = new Values();
        textField = new JTextField();
        textField.setText("               ");
        textField.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
        textField.setBackground(Color.black);
        Border solidBorder = BorderFactory.createLineBorder(Color.GREEN, 2);
        textField.setBorder(solidBorder);

        textField.setText("   " + String.valueOf(count) + "   ");

        // textField.setBorder(null);
        textField.setForeground(Color.green);
        textField.setEditable(false);

        //  button.setBorder(solidBorder);

        button.setBorder(solidBorder);
        add(textField);

        setVisible(true);
    }

    class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == SearchPanel.button) {
                System.out.println("click search");
                Values.scrap++;
                textField.setText(String.valueOf(Values.scrap));
                TradePanel.textField.setText(String.valueOf(Values.scrap));
            }
        }
    }
}

