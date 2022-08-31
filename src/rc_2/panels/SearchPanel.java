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
                if (Values.enegry != 0) {
                    Values.scrap++;
                    Values.enegry--;
                    EnergyPanel.textField.setText("        "+ String.valueOf(Values.enegry)+ "           ");
                    textField.setText("    " + String.valueOf(Values.scrap) + "   ");
                    TradePanel.textField.setText("    " + String.valueOf(Values.scrap) + "    ");

              /*  if (EnergyPanel.countEnergy != 0) {

                    System.out.println("EnergyPanel.countEnergy: " + EnergyPanel.countEnergy);
                    switch (EnergyPanel.countEnergy) {

                        case 1:
                            EnergyPanel.panel_1.setBackground(Color.red);
                            break;
                        case 2:
                            EnergyPanel.panel_2.setBackground(Color.red);
                            break;
                        case 3:
                            EnergyPanel.panel_3.setBackground(Color.red);
                            break;
                        case 4:
                            EnergyPanel.panel_4.setBackground(Color.orange);
                            break;
                        case 5:
                            EnergyPanel.panel_5.setBackground(Color.orange);
                            break;
                        case 6:
                            EnergyPanel.panel_6.setBackground(Color.orange);
                            break;
                        case 7:
                            EnergyPanel.panel_7.setBackground(Color.orange);
                            break;
                        case 8:
                            EnergyPanel.panel_8.setBackground(Color.white);
                            break;
                        case 9:
                            EnergyPanel.panel_9.setBackground(Color.white);
                            break;
                        case 10:
                            EnergyPanel.panel_10.setBackground(Color.white);
                            break;
                    }
                    EnergyPanel.countEnergy--;
                }
                if (EnergyPanel.countEnergy == 0) {
                    button.setEnabled(false);
                }*/
                }else
                    JOptionPane.showMessageDialog(null, " Не хватает энергии!");

            }
        }
    }
}

