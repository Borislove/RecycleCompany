package rc_1.transport_store;

import rc_1.RC_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static rc_1.RC_1.money;
import static rc_1.RC_1.textWeight;

public class TransportStore {

    static int count = 0; //счетчик для покупок

    static int countTransport = 0;

    public static class HandlerTransportStore implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            // TransportStore.yesNo();
            TransportStore.test();

            if (e.getSource() == RC_1.transportStore) {
                System.out.println("в магазине");
                if ((money >= 70) && (count == 0)) {
                    JOptionPane.showMessageDialog(null, "вы приобрели тележку! грузоподъемность 10 единиц");
                    RC_1.weight += 9;
                    textWeight.setText("weight: " + String.valueOf(RC_1.weight));
                    money -= 70;
                    RC_1.textCredit.setText("credit: " + money);
                    count++;
                    System.out.println("count: " + count);
                    System.out.println("получена телега 1");
                    System.out.println("countTransport" + countTransport);
                    countTransport++;

                    str_telega_1 = ' ';
                    str_telega_1 = 'V';
                }

                if ((money >= 300) && (count == 1)) {
                    JOptionPane.showMessageDialog(null, "вы приобрели тележку! грузоподъемность 35 единиц");
                    RC_1.weight = 35;
                    textWeight.setText("weight: " + String.valueOf(RC_1.weight));
                    money -= 300;
                    RC_1.textCredit.setText("credit: " + money);
                    count++;
                    System.out.println("count: " + count);
                    System.out.println("получена телега 2");
                    System.out.println("countTransport" + countTransport);
                    countTransport++;

                    str_telega_2 = ' ';
                    str_telega_2 = 'V';
                }
            } else
                JOptionPane.showMessageDialog(null, "недостаточно credit's ");
        }
    }

      /*  private static void test() {
            JOptionPane.showMessageDialog(null, "телега: 70 credits - [вместимость 10 единиц]   " + yesNo(countTransport, test, 1) + "\n" +
                    "большая телега: 300 credits - [вместимость 35 единиц]   " + yesNo(countTransport, test, 2) + "\n");
        }*/


    private static char str_telega_1 = 'X';
    private static char str_telega_2 = 'X';

    private static void test() {

        JOptionPane.showMessageDialog(null, "телега: 70 credits - (вместимость 10 единиц)   " + "[" + str_telega_1 + "]" + "\n" +
                "большая телега: 300 credits - (вместимость 35 единиц)   " + "[" + str_telega_2 + "]" + "\n");

    }
}

