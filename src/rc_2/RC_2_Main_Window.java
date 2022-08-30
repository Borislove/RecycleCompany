package rc_2;

import rc_2.panels.CreditPanel;
import rc_2.panels.SearchPanel;
import rc_2.panels.ShopPanel;
import rc_2.panels.TradePanel;
import rc_2.values.image_path.ImagePath;

import javax.swing.*;
import java.awt.*;

public class RC_2_Main_Window extends JFrame {


    JPanel creditPanel;
    FlowLayout flowLayout;
    JTabbedPane jTabbedPane = new JTabbedPane();
    JPanel shopPanel;
    JPanel panel;
    SearchPanel searcPanel;
    TradePanel tradePanel = new TradePanel();

    //картинки
    ImageIcon icon = new ImageIcon("E:\\ПРОГРАММИРОВАНИЕ\\RecycleCompany\\shopImage\\shop.png");

    RC_2_Main_Window() {

        super("RC_2");


        // flowLayout = new FlowLayout();
        //setLayout(flowLayout);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        //   setSize(1280, 768);
        setLocationRelativeTo(null);


        //Add creditPanel
        ///////////////////////////////////////////////////
        creditPanel = new CreditPanel();
        Container container = getContentPane();
        container.add(creditPanel, BorderLayout.NORTH);
        //////////////////////////////////////////////////

        //Add Tab Panel
        panel = new JPanel();
        Container container1 = getContentPane();
        container1.add(panel);
        // getContentPane().add(panel);
        panel.setBackground(Color.white);
        panel.setLayout(new BorderLayout());

//        jTabbedPane = new JTabbedPane();

        //getContentPane().setLayout(new GridLayout());

        jTabbedPane.setVisible(true);
        jTabbedPane.setForeground(Color.black);
        jTabbedPane.setBackground(Color.green);
        panel.add(jTabbedPane);
        //test

        //SEARCH PANEL
        searcPanel = new SearchPanel();
        jTabbedPane.addTab("Search", ImagePath.iconSearch, searcPanel);


        //TRADE PANEL
        //tradePanel = new TradePanel();
        jTabbedPane.addTab("trade", ImagePath.iconTrade, tradePanel);

        //  jTabbedPane.addTab("Source", null);

        shopPanel = new ShopPanel();
        jTabbedPane.addTab("Shop", icon, shopPanel);
        //  jTabbedPane.setBorder(BorderFactory.createEtchedBorder(Color.green, Color.black));
        //  jTabbedPane.addTab("ShopPanel", creditPanel1);
        add(panel);

        //настройки

        panel.setVisible(true);
        creditPanel.setVisible(true);

        jTabbedPane.setSelectedComponent(tradePanel);
        tradePanel.repaint();


        // setBackground(Color.black); //не работает Оо

        setVisible(true);

    }
}