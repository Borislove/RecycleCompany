package rc_2.panels;

import rc_2.values.image_path.ImagePath;
import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class HotelPanel extends JPanel {

    JLabel label; //основной
    JLabel label_1 = new JLabel(); //bunk
    JLabel label_2 = new JLabel(); //single_bed
    JLabel label_3 = new JLabel(); //bedroom

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
    }
}
