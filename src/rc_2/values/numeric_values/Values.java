package rc_2.values.numeric_values;

public class Values {

    public static int tax = 5;
    public static int credit = 0;
    public static int scrap = 0;
    public static int price = Values.priceRand();

    public static int priceRand() {
        int min = 5;
        int max = 30;
        price = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(Values.class);
        System.out.println("price: " + price);
        return price;
    }
}
