package rc_2.panels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MarketPanel extends JPanel {

    JLabel label;

    JPanel panel_1 = new JPanel();
    JPanel panel_2 = new JPanel();
    JPanel panel_3 = new JPanel();

    public MarketPanel() {

        label = new JLabel(" -------WELCOME------");
        add(label);

        Border solidBorder = BorderFactory.createLineBorder(Color.green, 2);

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));


        add(panel_1);
        panel_1.setBackground(Color.black);
        panel_1.setBorder(solidBorder);

        add(panel_2);
        panel_2.setBackground(Color.black);
        panel_2.setBorder(solidBorder);
        add(panel_3);
        panel_3.setBackground(Color.black);
        panel_3.setBorder(solidBorder);


        setBorder(BorderFactory.createEtchedBorder());

        setBackground(Color.green);
        setVisible(true);
    }
}
