package rc_1;

import javax.swing.*;

public class ScrapSorting {

    static String arrayScrapSorting[] = {"провод", "металл", "пласстмаса", "стекло", "платы"};


    static int wire = 0;
    static int metal = 0;
    static int plastic = 0;
    static int glass = 0;
    static int electronics = 0;

    public int quantity() {
        return (int) ((Math.random()) * 5) + 1;
    }

    public int randomPosition() {
        return (int) (Math.random() * arrayScrapSorting.length);
    }


    public void messageScrapSorting() {

        int position = randomPosition();
        int quantity = quantity();

        System.out.println("quantity " + quantity());


        JOptionPane.showMessageDialog(null, "получено: " + arrayScrapSorting[position] + " x" + quantity);

        //test

        switch (position) {
            case 0:
                wire += quantity;
                System.out.println("wire : " + wire);
                break;
            case 1:
                metal += quantity;
                System.out.println("metal: " + metal);
                break;

            case 2:
                plastic += quantity;
                System.out.println("plastic: " + plastic);
                break;
            case 3:
                glass += quantity;
                System.out.println("glass: " + glass);
                break;
            case 4:
                electronics += quantity;
                System.out.println("electronics: " + electronics);
                break;
        }
    }

    static public  void showMyLoot() {
        JOptionPane.showMessageDialog(null, "wire: " + wire + "\n"
                + "metal: " + metal + "\n" +
                "plastic: " + plastic + "\n" +
                "glass: " + glass + "\n" +
                "electronics: " + electronics);
    }

    public static void main(String[] args) {

        //System.out.println(RC_1.money);
        ScrapSorting scrapSorting = new ScrapSorting();
        scrapSorting.messageScrapSorting();
    }
}
