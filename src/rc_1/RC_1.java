package rc_1;

// TODO: 18.07.2022  String.valueOf   - вынести в одну
// TODO: 18.07.2022  text.SetText (); 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RC_1 extends JFrame {

    static int energy = 0;

    static int money = 50;

    static int experience = 0;

    JTextArea textCredit = new JTextArea("credit: " + money);


    String dialog = "больше не унесу";

    static JButton buttonCollection = new JButton("Collect");

    String str = " ";
    JTextArea helper = new JTextArea(str);

    int countScrapMetal = 0;
    JTextArea textCollection = new JTextArea(String.valueOf(countScrapMetal));

    JTextArea textEnergy = new JTextArea(String.valueOf(energy));

    JButton buttonSleep = new JButton("sleep");

    boolean isSleeping = true;
    static boolean energyIsOk = true;

    JButton sell_scrap = new JButton("sell scrap");


    JButton scrapParse = new JButton("parse scrap");
    JButton buyScrapParse = new JButton("buy parse scrap");

    public RC_1() {

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setSize(800, 700);
        setLocationRelativeTo(null); //center
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c.add(buttonCollection);

        /////////////////////////////////
        textCollection.setEditable(false);
        c.add(textCollection);

        Handler handler = new Handler();
        buttonCollection.addActionListener(handler);

        /////////////////////////////////
        textEnergy.setEditable(false);
        textEnergy.setBackground(Color.black);
        textEnergy.setForeground(Color.green);
        c.add(textEnergy);


        c.add(helper);

        //////////////////////
        c.add(buttonSleep);
        buttonSleep.setEnabled(false);
        HandlerSleep handlerSleep = new HandlerSleep();
        buttonSleep.addActionListener(handlerSleep);


        //////////////////////
        c.add(sell_scrap);
        HandlerSellScrap sellScrap = new HandlerSellScrap();
        sell_scrap.addActionListener(sellScrap);

        ////////////////
        c.add(textCredit);
        textCredit.setEditable(false);
        textCredit.setForeground(Color.blue);

        c.add(scrapParse);
        HandlerScrapParse handlerScrapParse = new HandlerScrapParse();
        scrapParse.addActionListener(handlerScrapParse);


        c.add(buyScrapParse);
        HandlerPurchase handlerPurchase = new HandlerPurchase();
        buyScrapParse.addActionListener(handlerPurchase);

    }

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            //если перевес
            if (countScrapMetal >= 4) {
                helper.setBackground(Color.red);
                helper.setText(dialog);
                buttonCollection.setEnabled(false);
            }

            if ((e.getSource() == buttonCollection) && energy >= 1) {
                energy -= 5;
                countScrapMetal++;
                textEnergy.setText(String.valueOf(energy));
            }

            if (energy == 0) {
                buttonCollection.setEnabled(false);
                System.out.println("не хватает энергии");

                helper.setBackground(Color.red);
                helper.setText("не хватает энергии!");
                buttonSleep.setEnabled(true);
                isSleeping = true;
            }
            textCollection.setText(String.valueOf(countScrapMetal));
        }
    }

    class HandlerSleep implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonSleep && isSleeping) {
                energy += 30;
                textEnergy.setText(String.valueOf(energy));
                helper.setBackground(Color.orange);
                helper.setText("я выспался!");
                isSleeping = false;
                buttonSleep.setEnabled(false);
                buttonCollection.setEnabled(true);
                System.out.println("isSleeping -" + isSleeping);
            } else
                helper.setText("я выспался!!!");
        }
    }

    class HandlerSellScrap implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("HandlerSellScrap click");
            textCredit.setText(String.valueOf(money));
            if (e.getSource() == sell_scrap) {

                //пока просто продаем и получаем монетки
               /* JOptionPane jOptionPane = new JOptionPane();
                JOptionPane.showInputDialog("sell:  yes : no");*/

                //цена за 1 кусочек лома
                int scrap = 10;
                if (countScrapMetal != 0) {
                    countScrapMetal -= 1;
                    textCollection.setText(String.valueOf(countScrapMetal));
                    money += scrap;

                } else
                    helper.setText("у тебя не достаточно лома!!!");
                System.out.println("money: " + money);
                textCredit.setText("credit: " + String.valueOf(money));

                if (countScrapMetal <= 5) {
                    buttonCollection.setEnabled(true);
                }
            }
        }
    }

    class HandlerScrapParse implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (experience >= 1) {
                JOptionPane.showMessageDialog(null, "получено: " + (int) (Math.random() * 10 + 1));
            } else
                JOptionPane.showMessageDialog(null, "У тебя недостаточно знаний!");
        }
    }

    class HandlerPurchase implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("handlerPurchase");
            if (money >= 50) {
                money -= 50;
                buyScrapParse.setEnabled(false);
                JOptionPane.showMessageDialog(null, "спасибо за покупку! заходите еще) ");
                textCredit.setText("credit: " + money);
                experience++;
            } else
                JOptionPane.showMessageDialog(null, "недостаточно кредитов");

            System.out.println("exp: " + experience);
        }
    }


    public static void main(String[] args) {

        new RC_1();


    }
}


//за 20 кредит , * научит тебя чето там
//