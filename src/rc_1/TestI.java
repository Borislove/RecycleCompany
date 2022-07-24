package rc_1;

import javax.swing.*;
import java.awt.*;

public class TestI extends JFrame {


    JLabel label;
    JLabel label2;

    TestI() {
        label = new JLabel();
        label2 = new JLabel();
        //Image image = new ImageIcon("E:\\RecycleCompany\\src\\rc_1\\1.png").getImage();
        label = new JLabel(new ImageIcon("E:\\\\RecycleCompany\\\\src\\\\rc_1\\\\1.png"));

        setSize(150, 150);
        setLocationRelativeTo(null); //center
        setVisible(true);
      //  this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        add(label);
        //   label.setText("bla bla");


        add(label2);
         label2.setText("получено:"+ ScrapSorting.metal);
        //label2.setVisible(true);



        //  label.setVisible(true);

    }
}
