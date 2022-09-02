package rc_2.values.numeric_values;

public class Values {

    public static int tax = 5;
    public static int credit = 0;
    public static int scrap = 0;
    public static int price = Values.priceRand();
    public static int enegry = 30;

    ///////////////////////////////////////////////////////////
    //price market
    public static int price_water = 30;
    public static int price_pizza = 150;
    public static int price_burger = 75;

    //recovery
    public static int water_recovery = 1;
    public static int pizza_recovery = 3;
    public static int burger_recovery = 7;

    //count
    public static int water_count = 0;
    public static int pizza_count = 0;
    public static int burger_count = 0;
    ///////////////////////////////////////////////////////////

    ///////////HOTEL///////////////////////////////////////////
    //price hotel
    public static  int bunk_price = 150 ;
    public static  int single_bed_price = 280 ;
    public static  int bedroom_price = 350;
    //energy recovery in hotel
    public static int bunk_recovery = 40;
    public static int single_bed_recovery = 80 ;
    public static int berdoom_recovery = 100;

    public static int priceRand() {
        int min = 5;
        int max = 30;
        price = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(Values.class);
        System.out.println("price: " + price);
        return price;
    }
}
