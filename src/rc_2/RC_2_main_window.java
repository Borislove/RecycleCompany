package rc_2;

import rc_2.panels.CreditPanel;

import javax.swing.*;
import java.awt.*;

public class RC_2_main_window extends JFrame {

    JPanel creditPanel;
    JPanel creditPanel2;

    RC_2_main_window() {
        super("RC_2");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        ///////////////////////////////////////////////////
        creditPanel = new CreditPanel();
        Container container = getContentPane();
        container.add(creditPanel, "North");
        add(creditPanel);

    }
}
