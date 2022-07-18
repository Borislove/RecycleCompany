package rc_1;

// TODO: 18.07.2022  String.valueOf   - вынести в одну
// TODO: 18.07.2022  text.SetText (); 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RC_1 extends JFrame {


    static int weight = 1;
    static int energy = 0;
    static int money = 1000;
    static int experience = 0;
    static int countScrapMetal = 0;

    static JTextArea textCredit = new JTextArea("credit: " + money);
    static JTextArea textWeight = new JTextArea("weight: " + weight);


    String dialog = "больше не унесу";

    static JButton buttonCollection = new JButton("Collect");

    String str = " ";
    JTextArea helper = new JTextArea(str);

    static JTextArea textCollection = new JTextArea(String.valueOf(countScrapMetal));

    JTextArea textEnergy = new JTextArea(String.valueOf(energy));

    JButton buttonSleep = new JButton("sleep");

    boolean isSleeping = true;
    static boolean energyIsOk = true;

    JButton sell_scrap_Button = new JButton("sell scrap");
    JButton scrapParseButton = new JButton("parse scrap");
    JButton buyScrapParseButton = new JButton("buy parse scrap");
    JButton showMyLootButton = new JButton("inventory");

    ScrapSorting scrapSorting = new ScrapSorting();

    JButton questContract = new JButton("contract");

    JButton transportStore = new JButton("transport");

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
        c.add(sell_scrap_Button);
        HandlerSellScrap sellScrap = new HandlerSellScrap();
        sell_scrap_Button.addActionListener(sellScrap);

        ////////////////
        c.add(textCredit);
        textCredit.setEditable(false);
        textCredit.setForeground(Color.blue);
        ///////////////
        c.add(textWeight);
        textWeight.setEditable(false);

        c.add(scrapParseButton);
        HandlerScrapParse handlerScrapParse = new HandlerScrapParse();
        scrapParseButton.addActionListener(handlerScrapParse);


        c.add(buyScrapParseButton);
        HandlerPurchase handlerPurchase = new HandlerPurchase();
        buyScrapParseButton.addActionListener(handlerPurchase);

        c.add(showMyLootButton);
        HandlerShowMyLooting handlerShowMyLooting = new HandlerShowMyLooting();
        showMyLootButton.addActionListener(handlerShowMyLooting);

        c.add(questContract);
        HandlerQuestContract handlerQuestContract = new HandlerQuestContract();
        questContract.addActionListener(handlerQuestContract);

        c.add(transportStore);
        HandlerTransportStore handlerTransportStore = new HandlerTransportStore();
        transportStore.addActionListener(handlerTransportStore);
    }

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            //ПЕРЕВЕС
            if (countScrapMetal == weight) {
                JOptionPane.showMessageDialog(null, " Перевес! Необходимо приобрести транспорт!");
                helper.setBackground(Color.red);
                helper.setText(dialog);
                buttonCollection.setEnabled(false);
            } else if ((e.getSource() == buttonCollection) && energy >= 1 && weight > 0) {
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

    //продажа лома , 10 монеток
    class HandlerSellScrap implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("HandlerSellScrap click");
            textCredit.setText(String.valueOf(money));
            if (e.getSource() == sell_scrap_Button) {

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
                //   JOptionPane.showMessageDialog(null, "получено: " + (int) (Math.random() * 10 + 1));
                scrapSorting.messageScrapSorting();
            } else
                JOptionPane.showMessageDialog(null, "У тебя недостаточно знаний!");
        }
    }

    class HandlerPurchase implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("handlerPurchase");

            int need_money = 1500;

            if (money >= need_money) {
                money -= need_money;
                buyScrapParseButton.setEnabled(false);
                JOptionPane.showMessageDialog(null, "спасибо за покупку! заходите еще) ");
                textCredit.setText("credit: " + money);
                experience++;
            } else
                JOptionPane.showMessageDialog(null, "недостаточно кредитов\n" + "необоходимо: " + need_money + " credit's");

            System.out.println("exp: " + experience);
        }
    }

    class HandlerShowMyLooting implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == showMyLootButton) {
                ScrapSorting.showMyLoot();
            }
        }
    }

    class HandlerQuestContract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == questContract) {
                Contract.quest();
            }
        }
    }

    class HandlerTransportStore implements ActionListener {


        public void actionPerformed(ActionEvent e) {

            test();

            if (e.getSource() == transportStore) {
                System.out.println("в магазине");
                if ((money >= 70) && (count == 0)) {
                    JOptionPane.showMessageDialog(null, "вы приобрели тележку! грузоподъемность 10 единиц");
                    weight += 9;
                    textWeight.setText("weight: " + String.valueOf(weight));
                    money -= 70;
                    textCredit.setText("credit: " + money);
                    count++;

                    System.out.println("count: " + count);

                } else
                    JOptionPane.showMessageDialog(null, "недостаточно credit's ");
            }
        }
    }


    // TODO: 18.07.2022  //пока не выходит
    static int count = 0;

    static public int isAvailable(int x) {

        switch (count) {
            case 0:
                System.out.println("case 0:");
                break;
            case 1:
                //StringIsOk();
                System.out.println("count " + count + " isAvailable case: 1");
                return 1;

        }

        return 0;
    }


    public static void test() {
        JOptionPane.showMessageDialog(null, "телега: 70 credits - [вместимость 10 единиц] " + RC_1.isAvailable(1) + "\n" +
                "большая телега: 300 credits - [вместимость 35 единиц]" + RC_1.isAvailable(2) + "\n");
    }

    public static void main(String[] args) {

        new RC_1();

        System.out.println("countScrapMetal: " + countScrapMetal);
    }
}


//за 20 кредит , * научит тебя чето там
//