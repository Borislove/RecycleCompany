package rc_1;

import javax.swing.*;

import static rc_1.RC_1.countScrapMetal;
import static rc_1.RC_1.textCredit;

public class Contract {


    ///////////////////////////////////////////////
    //количество
    private static int quantity = quantity();

    private static int quantity() {
        int quantity = Contract.randNumber();
        System.out.println("quantity = " + quantity);
        return quantity;
    }

    private static int randNumber() {
        return (int) (Math.random() * 20) + 1;
    }

    ///////////////////////////////////////////////
    //общая цена
    private static int prize = prize();

    private static int prize() {
        int prize = 15;
        return quantity * prize;
    }

    private static void update() {
        quantity = quantity();
        prize = prize();
    }

    private static void questMessage() {
        JOptionPane.showMessageDialog(null, "I need to:\n" + "scrap: " + quantity + "\n" + "price: " + prize + " credit");
    }

    private static void updateMessageContract() {
        JOptionPane.showMessageDialog(null, "контракт исполнен: \n" + "получено: " + " +" + prize + " credit's");
    }


    static void quest() {

        Contract.questMessage();

        int response = JOptionPane.showConfirmDialog(null, "желаете отдать ресурсы за вознаграждение?", "confim", JOptionPane.YES_NO_CANCEL_OPTION);

        if ((response == JOptionPane.YES_OPTION) && (countScrapMetal >= quantity)) {
            //проверить есть ли ресурсы
            if (RC_1.countScrapMetal >= quantity) {
                RC_1.money += prize;
                RC_1.countScrapMetal -= quantity;
                RC_1.textCollection.setText(String.valueOf(RC_1.countScrapMetal));

                textCredit.setText("credit: " + String.valueOf(RC_1.money));

                Contract.updateMessageContract();
                //  JOptionPane.showMessageDialog(null, "контракт исполнен: \n" + "получено: " + " +" + prize + " credit's");
                //если исполнен контракт, создать  новый
                update();
            }
        } else if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "заходите еще!");
        } else if (response == JOptionPane.CANCEL_OPTION) {
            System.out.println("cancel");
        } else JOptionPane.showMessageDialog(null, "у вас нет ресурсов");
        // else updateMessageContract();
    }

    public static void main(String[] args) {

        //case


        //System.out.println("мне нужно: " + " ");
    }
}
