package rc_2.panels;

import rc_2.values.numeric_values.Values;
import rc_2.values.text_value.Text_Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class CreditPanel extends JPanel {

    JLabel label;
   static JTextField textField;
    Values values;
    Text_Values text_values;
    FlowLayout flowLayout;

    public CreditPanel() {

        /////////////////////////////////////////////////////////////////////////////
        values = new Values();
        text_values = new Text_Values();
        /////////////////////////////////////////////////////////////////////////////
        label = new JLabel("");
        label.setText(text_values.getStr());
        label.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 24));
        //рамка вокруг панели
        setBorder(BorderFactory.createEtchedBorder());
        add(label);

        /////////////////////////////////////////////////////////////////////////////


        textField = new JTextField();
        textField.setText("        "+ String.valueOf(Values.credit)+ "           "  );
        textField.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 24));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);
        textField.setEditable(false);
        add(textField);

        ////////////////////////////////////////////////////////////////////////////////
        //рамка вокруг текста
        Border solidBorder = BorderFactory.createLineBorder(Color.black, 2);
        label.setBorder(solidBorder);

        ////////COLOR BACKGROUND///////////
        setBackground(Color.lightGray);
        //setBackground(Color.black);
        setVisible(true);

    }
}
