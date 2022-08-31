package rc_2.panels;

import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class EnergyPanel extends JPanel {

    JLabel label;
    static JTextField textField;

    static int countEnergy = 10;

    static JPanel panel_1 = new JPanel();
    static JPanel panel_2 = new JPanel();
    static JPanel panel_3 = new JPanel();
    static JPanel panel_4 = new JPanel();
    static JPanel panel_5 = new JPanel();
    static JPanel panel_6 = new JPanel();
    static JPanel panel_7 = new JPanel();
    static JPanel panel_8 = new JPanel();
    static JPanel panel_9 = new JPanel();
    static JPanel panel_10 = new JPanel();

    public EnergyPanel() {


        label = new JLabel(" ENERGY ");
        label.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 24));
        Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 2);
        label.setBorder(solidBorder);

        add(label);

        /*panel_1.setBackground(Color.green);
        panel_1.setBorder(solidBorder);
        add(panel_1);
        panel_2.setBackground(Color.green);
        panel_2.setBorder(solidBorder);
        add(panel_2);
        panel_3.setBackground(Color.green);
        panel_3.setBorder(solidBorder);
        add(panel_3);
        panel_4.setBackground(Color.green);
        panel_4.setBorder(solidBorder);
        add(panel_4);
        panel_5.setBackground(Color.green);
        panel_5.setBorder(solidBorder);
        add(panel_5);
        panel_6.setBackground(Color.green);
        panel_6.setBorder(solidBorder);
        add(panel_6);
        panel_7.setBackground(Color.green);
        panel_7.setBorder(solidBorder);
        add(panel_7);
        panel_8.setBackground(Color.green);
        panel_8.setBorder(solidBorder);
        add(panel_8);
        panel_9.setBackground(Color.green);
        panel_9.setBorder(solidBorder);
        add(panel_9);
        panel_10.setBackground(Color.green);
        panel_10.setBorder(solidBorder);
        add(panel_10);*/

        ///////////////////////////////////////////////

        textField = new JTextField();
        textField.setText("        " + String.valueOf(Values.enegry) + "           ");
        textField.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 24));
        textField.setBackground(Color.black);
        textField.setForeground(Color.green);
        textField.setEditable(false);
        add(textField);
        ////////////////////////////////////////////////

        setBackground(Color.lightGray);
        setVisible(true);
        //    setLayout(new FlowLayout());
        //Border solidBorder = BorderFactory.createLineBorder(Color.GREEN, 2);
        //setBorder(solidBorder);
        setBorder(BorderFactory.createEtchedBorder());
    }
}
