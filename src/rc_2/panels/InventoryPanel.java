package rc_2.panels;

import rc_2.values.image_path.ImagePath;
import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryPanel extends JPanel {

    JLabel label; //основной

    JButton jButton_1 = new JButton();
    JButton jButton_2 = new JButton();
    JButton jButton_3 = new JButton();

    public InventoryPanel() {

        Border solidBorder = BorderFactory.createLineBorder(Color.GREEN, 2);

        jButton_1.setIcon(ImagePath.imageBottle_16px);
        jButton_1.setFocusable(false);
        jButton_1.setToolTipText("RECOVERY ENERGY: " + Values.water_recovery + "  QUANTITY: " + Values.water_count);  //// TODO: 01.09.2022  no count!!!update
        jButton_1.setBackground(Color.orange);
        jButton_1.setBorder(solidBorder);
        jButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jButton_1) {
                    System.out.println("click InventoryPanel jbutton_1");
                    System.out.println("water_count: " + Values.water_count);
                    if (Values.water_count > 0) {
                        Values.water_count--;
                        Values.enegry += Values.water_recovery;
                        EnergyPanel.textField.setText("        " + String.valueOf(Values.enegry + "       "));
                        MessagePanel.textField.setText("RECOVERY " + Values.water_recovery + " ENERGY!!!");
                    }
                    if (Values.water_count == 0)
                        MessagePanel.textField.setText("  water need to buy!");
                }
            }
        });


        jButton_2.setIcon(ImagePath.imagePizza_16px);
        jButton_2.setFocusable(false);
        jButton_2.setToolTipText("RECOVERY ENERGY: " + Values.pizza_recovery);
        jButton_2.setBackground(Color.orange);
        jButton_2.setBorder(solidBorder);
        jButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jButton_2) {
                    System.out.println("click InventoryPanel jbutton_2");
                    System.out.println("pizza_count: " + Values.pizza_count);
                    if (Values.pizza_count > 0) {
                        Values.pizza_count--;
                        Values.enegry += Values.pizza_recovery;
                        EnergyPanel.textField.setText("          " + Values.enegry + "           ");
                        MessagePanel.textField.setText("RECOVERY " + Values.pizza_recovery + " ENERGY!!!");
                    }
                    if (Values.pizza_count == 0)
                        MessagePanel.textField.setText("  pizza need to buy!");
                }
            }
        });

        jButton_3.setIcon(ImagePath.imageBurger_16px);
        jButton_3.setFocusable(false);
        jButton_3.setToolTipText("RECOVERY ENERGY: " + Values.burger_recovery);
        jButton_3.setBackground(Color.orange);
        jButton_3.setBorder(solidBorder);
        jButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jButton_3) {
                    System.out.println("click InventoryPanel jbutton_3");
                    System.out.println("burger_count: " + Values.burger_count);
                    if (Values.burger_count > 0) {
                        Values.burger_count--;
                        Values.enegry += Values.burger_recovery;
                        EnergyPanel.textField.setText("         " + Values.enegry + "              ");
                        MessagePanel.textField.setText("RECOVERY " + Values.burger_recovery + " ENERGY!!!");
                    }
                    if (Values.burger_count == 0)
                        MessagePanel.textField.setText("  burger need to buy!");
                }
            }
        });
        /*label = new JLabel(" -------INVENTORY------");
        add(label);
*/
        add(jButton_1);
        add(jButton_2);
        add(jButton_3);

        setBorder(BorderFactory.createEtchedBorder());

        setBackground(Color.black);
        setVisible(true);
    }
}
