package rc_2.panels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ShopPanel extends JPanel {

    JLabel label;

    public ShopPanel() {

        label = new JLabel("Shop");
        add(label);

        setBorder(BorderFactory.createEtchedBorder());

        setBackground(Color.orange);
        setVisible(true);
    }
}
