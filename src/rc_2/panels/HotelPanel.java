package rc_2.panels;

import rc_2.values.image_path.ImagePath;
import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelPanel extends JPanel {

    JLabel label; //основной
    JLabel label_1 = new JLabel(); //bunk
    JLabel label_2 = new JLabel(); //single_bed
    JLabel label_3 = new JLabel(); //bedroom

    JLabel label_1_price = new JLabel();
    JLabel label_2_price = new JLabel();
    JLabel label_3_price = new JLabel();

    JPanel panel = new JPanel();
    JPanel panel_1 = new JPanel();
    JPanel panel_2 = new JPanel();
    JPanel panel_3 = new JPanel();

    JPanel panel_bunk = new JPanel();
    JPanel panel_single_bed = new JPanel();
    JPanel panel_bedroom = new JPanel();

    JLabel label_1_description;
    JLabel label_2_description;
    JLabel label_3_description;

    JButton button_bunk = new JButton("  RELAX  ");
    JButton button_single_bed = new JButton("  RELAX  ");
    JButton button_bedroom = new JButton("  RELAX  ");

    public HotelPanel() {
        setBackground(Color.black);

        label = new JLabel(" -------WELCOME HOTEL------");
        label.setForeground(Color.black);
        add(label);

        Border solidBorder = BorderFactory.createLineBorder(Color.green, 2);
        Border orangeBorder = BorderFactory.createLineBorder(Color.orange, 3);
        Border whiteBorder_size_1 = BorderFactory.createLineBorder(Color.white, 1);

        Font font = new Font("Bernard MT Condensed", Font.PLAIN, 20);
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        //////////////////////////////////////////////////////////////////////////

        add(panel_1);

        //////////1 panel//////////////////
        panel_1.setBackground(Color.black);
        panel_1.setBorder(solidBorder);

        panel_bunk.setBackground(Color.gray);
        label_1 = new JLabel();
        label_1.setIcon(ImagePath.imageBunk_24px);
        panel_bunk.add(label_1);
        panel_bunk.setBorder(orangeBorder);
        panel_1.add(panel_bunk);

        label_1_price.setText(String.valueOf(Values.bunk_price + " credit"));
        label_1_price.setForeground(Color.white);
        label_1_price.setBorder(whiteBorder_size_1);
        panel_1.add(label_1_price);

        //кнопка
        button_bunk.setFont(font);
        button_bunk.setForeground(Color.green);
        button_bunk.setBackground(Color.black);
        button_bunk.setFocusable(false);
        button_bunk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_bunk) {
                    System.out.println("click button_bunk");            // 150 credit - 40 recovery
                    if (Values.credit >= 150) {
                        Values.credit = Values.credit - Values.bunk_price;
                        Values.enegry = Values.enegry + Values.bunk_recovery;

                        CreditPanel.textField.setText("" + Values.credit);
                        EnergyPanel.textField.setText("" + Values.enegry);

                        MessagePanel.textField.setText(" "+ " recovery " + Values.bunk_recovery);
                    }
                    if(Values.credit < 150){
                        MessagePanel.textField.setText("     "+ " no credit's no sleep!!!");
                    }
                }
            }
        });

        button_bunk.setBorder(solidBorder);
        panel_1.add(button_bunk);


        //////////2 panel//////////////////
        add(panel_2);

        panel_2.setBackground(Color.black);
        panel_2.setBorder(solidBorder);

        panel_single_bed.setBackground(Color.gray);
        label_2 = new JLabel();
        label_2.setIcon(ImagePath.imageSingle_24px);
        panel_single_bed.add(label_2);
        panel_single_bed.setBorder(orangeBorder);
        panel_2.add(panel_single_bed);


        label_2_price.setText(String.valueOf(Values.single_bed_price + " credit"));
        label_2_price.setForeground(Color.white);
        label_2_price.setBorder(whiteBorder_size_1);
        panel_2.add(label_2_price);


        //кнопка
        button_single_bed.setFont(font);
        button_single_bed.setForeground(Color.green);
        button_single_bed.setBackground(Color.black);
        button_single_bed.setFocusable(false);
        button_single_bed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_single_bed) {
                    System.out.println("click button_single_bed");          //280 credit  - 80 recovery
                    if (Values.credit >= 280) {
                        Values.credit = Values.credit - Values.single_bed_price;
                        Values.enegry = Values.enegry + Values.single_bed_recovery;

                        CreditPanel.textField.setText("" + Values.credit);
                        EnergyPanel.textField.setText("" + Values.enegry);

                        MessagePanel.textField.setText(" "+ " recovery " + Values.single_bed_recovery);
                    }
                    if(Values.credit < 280){
                        MessagePanel.textField.setText("     "+ " no credit's no sleep!!!");
                    }
                }
            }
        });

        button_single_bed.setBorder(solidBorder);
        panel_2.add(button_single_bed);
        //////////3 panel//////////////////

        add(panel_3);

        panel_3.setBackground(Color.black);
        panel_3.setBorder(solidBorder);

        panel_bedroom.setBackground(Color.gray);
        label_3 = new JLabel();
        label_3.setIcon(ImagePath.imageBedroom_24px);
        panel_bedroom.add(label_3);
        panel_bedroom.setBorder(orangeBorder);
        panel_3.add(panel_bedroom);

        label_3_price.setText(String.valueOf(Values.bedroom_price + " credit"));
        label_3_price.setForeground(Color.white);
        label_3_price.setBorder(whiteBorder_size_1);
        panel_3.add(label_3_price);

        //кнопка
        button_bedroom.setFont(font);
        button_bedroom.setForeground(Color.green);
        button_bedroom.setBackground(Color.black);
        button_bedroom.setFocusable(false);
        button_bedroom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_bedroom) {
                    System.out.println("click button_bedroom");
                    if (Values.credit >= 350) { // 350 credit   - 100 recovery
                        Values.credit = Values.credit - Values.bedroom_price;
                        Values.enegry = Values.enegry + Values.berdoom_recovery;

                        CreditPanel.textField.setText("" + Values.credit);
                        EnergyPanel.textField.setText("" + Values.enegry);

                        MessagePanel.textField.setText(" "+ " recovery " + Values.berdoom_recovery);
                    }
                    if(Values.credit < 350){
                        MessagePanel.textField.setText("     "+ " no credit's no sleep!!!");
                    }
                }
            }
        });
        button_bedroom.setBorder(solidBorder);
        panel_3.add(button_bedroom);
    }
}
