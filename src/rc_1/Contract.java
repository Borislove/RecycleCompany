package rc_1;

import javax.swing.*;

import static rc_1.RC_1.textCredit;

public class Contract {


    ///////////////////////////////////////////////
    //количество
    static int quantity = quantity();

    static public int quantity() {
        int quantity = (int) ((Math.random()) * 20) + 1;
        System.out.println("quantity = " + quantity);
        return quantity;
    }

    ///////////////////////////////////////////////
    //общая цена
    static int prize = prize();

    static public int prize() {
        int prize = 15;
        return quantity * prize;
    }

    static public void quest() {
        JOptionPane.showMessageDialog(null, "I need to:\n" + "scrap: " + quantity + "\n" + "price: " + prize + " credit");

        int response = JOptionPane.showConfirmDialog(null, "желаете отдать ресурсы за вознаграждение?", "confim", JOptionPane.YES_NO_CANCEL_OPTION);


        if ((response == JOptionPane.YES_OPTION)) {
            System.out.println("заходите еще!");

            //проверить есть ли ресурсы
            if (RC_1.countScrapMetal >= quantity) {
                RC_1.money += prize;
                RC_1.countScrapMetal -= quantity;
                RC_1.textCollection.setText(String.valueOf(RC_1.countScrapMetal));

                textCredit.setText("credit: " + String.valueOf(RC_1.money));
                JOptionPane.showMessageDialog(null, "контракт исполнен: \n" + "получено: " + " +" + prize + " credit's");

                //если исполнен контракт, создать  новый
                // TODO: 18.07.2022 не сбрасывается 
                quantity();

            } else
                JOptionPane.showMessageDialog(null, "недостаточно ресурсов");

        }
    }

    public static void main(String[] args) {

        //case


        //System.out.println("мне нужно: " + " ");
    }
}
