package rc_1_Gui;

import rc_1.RC_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RC_1_Gui extends JFrame {
    private JPanel panel1;
    private JButton collectButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel test_panel;
    private JTextField scrapTextField;
    private JTextField creditTextField;
    private JPanel panel_counter;
    private JPanel panel_buttons;
    private JPanel panel_2;


    private RC_1_Gui() {
        super("go go go");

        //  this.setContentPane(panel1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(800, 600);
        setLocationRelativeTo(null);
        add(panel1);
        //   pack();


        scrapTextField.setBorder(null);
        scrapTextField.setText(String.valueOf(RC_1.money));

        creditTextField.setBorder(null);

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button4) {
                    test_panel.setBackground(Color.red);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button3) {
                    test_panel.setBackground(Color.orange);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button2) {
                    panel_2.setVisible(false);
                }
            }
        });
        collectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == collectButton) {
                    RC_1.countScrapMetal++;
                    scrapTextField.setText(String.valueOf(RC_1.countScrapMetal));
                }
            }
        });
    }

    public static void main(String[] args) {

        RC_1_Gui rc_1_gui = new RC_1_Gui();
        rc_1_gui.setVisible(true);
    }
}
