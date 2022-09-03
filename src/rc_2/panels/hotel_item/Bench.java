package rc_2.panels.hotel_item;

import rc_2.panels.EnergyPanel;
import rc_2.panels.MessagePanel;
import rc_2.values.image_path.ImagePath;
import rc_2.values.numeric_values.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//скамейка
//free enegry
public class Bench extends JPanel {

    JButton button_bench = new JButton("  MEDITATION  ");
    JLabel label = new JLabel();
    JLabel free_label = new JLabel();
    JPanel panel = new JPanel();

    public Bench() {
        Font font = new Font("Bernard MT Condensed", Font.PLAIN, 20);
        Border solidBorder = BorderFactory.createLineBorder(Color.green, 2);
        Border whiteBorder_size_1 = BorderFactory.createLineBorder(Color.white, 1);
        Border orangeBorder = BorderFactory.createLineBorder(Color.orange, 3);


        add(panel);

        label.setIcon(ImagePath.imageBench_24px);
        panel.setBorder(orangeBorder);
        panel.setBackground(Color.lightGray);
        panel.add(label);

        free_label.setBorder(whiteBorder_size_1);
        free_label.setText("free relaxing");
        free_label.setForeground(Color.white);
        add(free_label);

        //кнопка
        button_bench.setFont(font);
        button_bench.setForeground(Color.green);
        button_bench.setBackground(Color.black);
        button_bench.setFocusable(false);
        button_bench.setBorder(solidBorder);
        button_bench.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button_bench) {
                    if (Values.enegry == 0) {
                        Values.enegry++;
                        EnergyPanel.textField.setText(String.valueOf(Values.enegry));
                        MessagePanel.textField.setText(" restored +1 energy");
                    } else
                        MessagePanel.textField.setText(" not tired!!!");

                }
            }
        });

        add(button_bench);


        setBackground(Color.black);

        setBorder(solidBorder);
    }
}
