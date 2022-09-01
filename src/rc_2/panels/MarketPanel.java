package rc_2.panels;

import rc_2.values.image_path.ImagePath;
import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarketPanel extends JPanel {

    //панель предметов
    JPanel panel_water = new JPanel();
    JPanel panel_pizza = new JPanel();
    JPanel panel_burger = new JPanel();

    //панель рамка
    JPanel panel_1 = new JPanel();
    JPanel panel_2 = new JPanel();
    JPanel panel_3 = new JPanel();

    //лейбы предметов
    JLabel label; //основной
    JLabel label_1; //вода
    JLabel label_2; //пицца
    JLabel label_3; //бургер

    //лейбы цен
    JLabel price_water = new JLabel();
    JLabel price_pizza = new JLabel();
    JLabel price_burger = new JLabel();

    //кнопки
    JButton button_water = new JButton("  BUY  ");
    JButton button_pizza = new JButton("  BUY  ");
    JButton button_burger = new JButton("  BUY  ");

    public MarketPanel() {

        label = new JLabel(" -------WELCOME------");
        add(label);

        Border solidBorder = BorderFactory.createLineBorder(Color.green, 2);
        Border orangeBorder = BorderFactory.createLineBorder(Color.orange, 3);
        Border whiteBorder_size_1 = BorderFactory.createLineBorder(Color.white, 1);

        Font font = new Font("Bernard MT Condensed", Font.PLAIN, 20);

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));


        ////////////////////////////Бутылка//////////////////////////////////////////
        add(panel_1);
        panel_1.setBackground(Color.black);
        panel_1.setBorder(solidBorder);

        panel_water.setBackground(Color.gray);
        label_1 = new JLabel();
        label_1.setIcon(ImagePath.imageBottle);
        panel_water.add(label_1);
        panel_water.setBorder(orangeBorder);
        panel_1.add(panel_water);

        //цена
        price_water.setForeground(Color.white);
        // price_water.setText("price:  "+Values.price_water + " Credit");
        price_water.setBorder(whiteBorder_size_1);
        price_water.setText("  " + Values.price_water + " Credit  ");
        panel_1.add(price_water);

        //кнопка
        button_water.setFont(font);
        button_water.setForeground(Color.green);
        button_water.setBackground(Color.black);
        button_water.setFocusable(false);
        button_water.addActionListener(new ButtonHandlerWater());

        button_water.setBorder(solidBorder);
        panel_1.add(button_water);

        /////////////////////////////ПИЦЦА//////////////////////////////////////////
        add(panel_2);
        panel_2.setBackground(Color.black);
        panel_2.setBorder(solidBorder);

        panel_pizza.setBackground(Color.gray);
        label_2 = new JLabel();
        label_2.setIcon(ImagePath.imagePizza);
        panel_pizza.add(label_2);
        panel_pizza.setBorder(orangeBorder);
        panel_2.add(panel_pizza);

        //цена
        price_pizza.setForeground(Color.white);
        price_pizza.setBorder(whiteBorder_size_1);
        price_pizza.setText("  " + Values.price_pizza + " Credit   ");
        panel_2.add(price_pizza);

        //кнопка
        button_pizza.setFont(font);
        button_pizza.setForeground(Color.green);
        button_pizza.setBackground(Color.black);
        button_pizza.setFocusable(false);
        button_pizza.addActionListener(new ButtonHandlerPizza());
        button_pizza.setBorder(solidBorder);
        panel_2.add(button_pizza);


        ////////////////////////////БУРГЕР//////////////////////////////////////////
        add(panel_3);
        panel_3.setBackground(Color.black);
        panel_3.setBorder(solidBorder);

        panel_burger.setBackground(Color.gray);
        label_3 = new JLabel();
        label_3.setIcon(ImagePath.imageBurger);
        panel_burger.add(label_3);
        panel_burger.setBorder(orangeBorder);
        panel_3.add(panel_burger);

        //цена
        price_burger.setForeground(Color.white);
        price_burger.setBorder(whiteBorder_size_1);
        price_burger.setText("  " + Values.price_burger + " Credit   ");
        panel_3.add(price_burger);

        //кнопка
        button_burger.setFont(font);
        button_burger.setForeground(Color.green);
        button_burger.setBackground(Color.black);
        button_burger.setFocusable(false);
        button_burger.setBorder(solidBorder);
        button_burger.addActionListener(new ButtonHandlerBurger());
        panel_3.add(button_burger);


        ////////////////////////////

        setBorder(BorderFactory.createEtchedBorder());

        setBackground(Color.green);
        setVisible(true);
    }

    class ButtonHandlerWater implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == button_water) {
                System.out.println("click button_water");
                if (Values.credit >= 30) {
                    Values.water_count++;
                    Values.credit -= Values.price_water;
                    CreditPanel.textField.setText("    " + String.valueOf(Values.credit) + "    ");
                    MessagePanel.textField.setText(" Buy water :) Thanks!");
                } else
                    // JOptionPane.showMessageDialog(null, " Нет кредитов!");
                    MessagePanel.textField.setText(" NO CREDIT!!!");
            }
        }
    }

    class ButtonHandlerPizza implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == button_pizza) {
                System.out.println("click button_pizza");
                if (Values.credit >= 150) {
                    Values.pizza_count++;
                    Values.credit -= Values.price_pizza;
                    CreditPanel.textField.setText("    " + String.valueOf(Values.credit) + "    ");
                    MessagePanel.textField.setText(" Buy pizza :) Thanks!");
                } else
                    // JOptionPane.showMessageDialog(null, " Нет кредитов!");
                    MessagePanel.textField.setText(" NO CREDIT!!!");
            }
        }
    }

    class ButtonHandlerBurger implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == button_burger) {
                System.out.println("click button_burger");
                if (Values.credit >= 75) {
                    Values.burger_count++;
                    Values.credit -= Values.price_burger;
                    CreditPanel.textField.setText("    " + String.valueOf(Values.credit) + "    ");
                    MessagePanel.textField.setText(" Buy burger :) Thanks!");
                } else
                    //  JOptionPane.showMessageDialog(null, " Нет кредитов!");
                    MessagePanel.textField.setText(" NO CREDIT!!!");
            }
        }
    }
}
