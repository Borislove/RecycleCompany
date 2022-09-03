package rc_2.panels;

import rc_2.values.numeric_values.Values;
import rc_2.values.text_value.Text_Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MessagePanel extends JPanel {

    JLabel label;
  public static   JTextField textField;

    public MessagePanel() {
        label = new JLabel(" MESSAGE: ");
        label.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 24));
      //  setBorder(BorderFactory.createEtchedBorder());

        setLayout(new BorderLayout());

        textField = new JTextField(Text_Values.str_search);
        textField.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 24));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);
        textField.setEditable(false);

        setBackground(Color.lightGray);

        Border solidBorder = BorderFactory.createLineBorder(Color.black, 2);
     //   label.setBorder(solidBorder);

        setBorder(solidBorder);

        add(label, BorderLayout.WEST);
        //add(label);
        add(textField);
    }
}
