package rc_1;

import javax.swing.*;

public class ScrapSorting {


    public static void main(String[] args) {

        //System.out.println(RC_1.money);

        int countScrapMetal = RC_1.countScrapMetal;
        System.out.println(countScrapMetal);

        countScrapMetal += 50;
        System.out.println("countScrapMetal: " + countScrapMetal);

        String arrayScrapSorting[] = {"провод", "металл", "пласстмаса", "стекло", "платы"};

        int randomPosition = (int) (Math.random() * arrayScrapSorting.length);
        System.out.println("randomPosition = " + randomPosition);

        int quantity = (int) ((Math.random()) * 5)+1;
        JOptionPane.showMessageDialog(null, "получено: " + arrayScrapSorting[randomPosition] + " x" + quantity);
    }
}
