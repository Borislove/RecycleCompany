package rc_2;

import rc_2.panels.*;
import rc_2.values.image_path.ImagePath;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class RC_2_Main_Window extends JFrame {


    JPanel creditPanel;
    JPanel energyPanel;
    JPanel marketPanel;
    JPanel messagePanel;
    JPanel inventoryPanel;
    JPanel hotelPanel;
    FlowLayout flowLayout;
    JTabbedPane jTabbedPane = new JTabbedPane();
    JPanel shopPanel;
    JPanel panel;
    SearchPanel searcPanel;
    TradePanel tradePanel = new TradePanel();

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
        // container.add(creditPanel, BorderLayout.NORTH);
        //////////////////////////////////////////////////

        //Add energyPanel
        energyPanel = new EnergyPanel();
        //     container.add(energyPanel,BorderLayout.NORTH);

        //
        JPanel panelNorth = new JPanel();
        panelNorth.setBackground(Color.lightGray);
        Border solidBorder = BorderFactory.createLineBorder(Color.black, 2);
        panelNorth.setBorder(solidBorder);
        panelNorth.add(energyPanel);
        panelNorth.add(creditPanel);
        container.add(panelNorth, BorderLayout.NORTH);


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
        jTabbedPane.addTab(" SEARCH ", ImagePath.iconSearch, searcPanel);


        //TRADE PANEL
        //tradePanel = new TradePanel();
        jTabbedPane.addTab(" TRADE ", ImagePath.iconTrade, tradePanel);

        //  jTabbedPane.addTab("Source", null);

        shopPanel = new ShopPanel();
        jTabbedPane.addTab(" SHOP ", ImagePath.iconShop, shopPanel);
        //  jTabbedPane.setBorder(BorderFactory.createEtchedBorder(Color.green, Color.black));
        //  jTabbedPane.addTab("ShopPanel", creditPanel1);
        add(panel);

        marketPanel = new MarketPanel();
        jTabbedPane.addTab(" MARKET ", ImagePath.iconMarket, marketPanel);

        //настройки

        panel.setVisible(true);
        creditPanel.setVisible(true);

        jTabbedPane.setSelectedComponent(tradePanel);
        tradePanel.repaint();

        messagePanel = new MessagePanel();
        add(messagePanel, BorderLayout.SOUTH);


        inventoryPanel = new InventoryPanel();
        jTabbedPane.addTab(" INVENTORY ", null, inventoryPanel);


        hotelPanel = new HotelPanel();
        jTabbedPane.addTab(" HOTEL ", ImagePath.iconHotel, hotelPanel);

        // setBackground(Color.black); //не работает Оо

        setVisible(true);

    }
}
