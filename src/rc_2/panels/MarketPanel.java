package rc_2.panels;

import rc_2.values.image_path.ImagePath;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MarketPanel extends JPanel {

    JLabel label;

    JPanel panel_1 = new JPanel();
    JPanel panel_pizza = new JPanel();
    JPanel panel_burger = new JPanel();

    public MarketPanel() {

        label = new JLabel(" -------WELCOME------");
        add(label);

        Border solidBorder = BorderFactory.createLineBorder(Color.green, 2);
        Border orangeBorder = BorderFactory.createLineBorder(Color.orange, 3);

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));


        ////////////////////////////Бутылка//////////////////////////////////////////
        add(panel_1);
        panel_1.setBackground(Color.black);
        panel_1.setBorder(solidBorder);

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);

        JLabel label = new JLabel();
        panel.add(label);
        label.setIcon(ImagePath.imageBottle);
        panel.setBorder(orangeBorder);
        panel_1.add(panel);

        /////////////////////////////ПИЦЦА//////////////////////////////////////////
        add(panel_pizza);
        panel_pizza.setBackground(Color.white);
        panel_pizza.setBorder(solidBorder);
    //    panel_pizza.setBackground(Color.gray);

        JLabel labelPizza = new JLabel();
        panel_pizza.add(labelPizza);
        labelPizza.setIcon(ImagePath.imagePizza);
        panel_pizza.setBorder(orangeBorder);
        panel_pizza.add(labelPizza);

        ////////////////////////////БУРГЕР//////////////////////////////////////////
        add(panel_burger);
        panel_burger.setBackground(Color.white);
        panel_burger.setBorder(solidBorder);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.gray);
        JLabel label2 = new JLabel();
        panel2.setBorder(orangeBorder);
        label2.setIcon(ImagePath.imageBurger);
        panel_burger.add(label2);


        setBorder(BorderFactory.createEtchedBorder());

        setBackground(Color.green);
        setVisible(true);
    }
}
